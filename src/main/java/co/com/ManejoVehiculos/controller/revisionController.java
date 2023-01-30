package co.com.ManejoVehiculos.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lowagie.text.DocumentException;
import co.com.ManejoVehiculos.entity.revision_tecnica;
import co.com.ManejoVehiculos.service.revisionService;
import co.com.ManejoVehiculos.utils.revisionReporte;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/revision")
public class revisionController {

	@Autowired
	private revisionService serviceN;
	// Create a new revision 
	
			@PostMapping("/add")
			public ResponseEntity<?> create(@RequestBody revision_tecnica acto) {
				// Start Validations
				acto.setId(0);
				return ResponseEntity.status(HttpStatus.CREATED).body(serviceN.save( acto));

			}
			
			// Update a new Notificaciones
			@PostMapping("/alter")
			public ResponseEntity<?> update(@RequestBody revision_tecnica  update) {
				Optional<revision_tecnica > actual = serviceN.findById(update.getId());

				if(!actual.isPresent())
					return ResponseEntity.notFound().build();		

				return ResponseEntity.status(HttpStatus.OK).body(serviceN.save(update));
			}
			
			// Inactive an Notificaciones
			@GetMapping("/inactive/{id}")
			public ResponseEntity<?> inactivate(@PathVariable Integer id) {
				Optional<revision_tecnica > optional = serviceN.findById(id);
				
				if(!optional.isPresent())
					return ResponseEntity.notFound().build();
				
				revision_tecnica  temp = optional.get();
				
				
				return ResponseEntity.status(HttpStatus.OK).body(serviceN.save(temp));
			}
			
			// Find all an Notificaciones
			@GetMapping("/findAll")
			public ResponseEntity<?> findAll() {
				Iterable<revision_tecnica > optional = serviceN.findAll();
				
				return ResponseEntity.ok(optional);
			}
			
			
			// Find all pagable an Notificaciones
			@GetMapping("/findAll/{page}/{size}")
			public ResponseEntity<?> findAll(@PathVariable Integer page, @PathVariable Integer size) {
				Iterable<revision_tecnica > optional = serviceN.findAll(PageRequest.of(page, size));
				
				return ResponseEntity.ok(optional);
			}
			
			// Find an Notificaciones by Id
			@GetMapping("/{id}")
			public ResponseEntity<?> findById(@PathVariable Integer id) {
				Optional<revision_tecnica > optional = serviceN.findById(id);
				
				if(!optional.isPresent())
					return ResponseEntity.notFound().build();
				
				return ResponseEntity.ok(optional);
			}
			//Generate report in PDF
			@GetMapping("/export/{id}")
			  public void generatePdfFile(HttpServletResponse response,@PathVariable int id) throws DocumentException, IOException 
			  {
			    response.setContentType("application/pdf");
			    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
			    String currentDateTime = dateFormat.format(new Date());
			    String headerkey = "Content-Disposition";
			    String headervalue = "attachment; filename=ReporteVehiculo" +id+currentDateTime + ".pdf";
			    response.setHeader(headerkey, headervalue);
			    
			   // List<revision_tecnica> revision = serviceN.findById(id);
			    Optional<revision_tecnica> optional = serviceN.findById(id);
			    List < revision_tecnica > revision = optional.stream().toList();
			    revisionReporte generator = new revisionReporte();
			
			    generator.buildPdfDocument(revision, response);
			  }
}
