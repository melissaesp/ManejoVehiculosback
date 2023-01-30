package co.com.ManejoVehiculos.controller;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.com.ManejoVehiculos.entity.vehiculo;
import co.com.ManejoVehiculos.repository.vehiculoRepository;
import co.com.ManejoVehiculos.service.vehiculoService;

@RestController
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false")
@RequestMapping("/api/vehiculo")
public class vehiculoController {
	@Autowired
	private vehiculoService serviceN;
	@Autowired
	private vehiculoRepository repoN;
	
	
	// Create a new Notificaciones
	@PostMapping("/add")
	public ResponseEntity<?> create( 
		  @RequestBody vehiculo acto) {
		// Start Validations
		acto.setId(0);
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceN.save( acto));

	}
	
	// Partial Update 
	@PatchMapping("/alter/{id}")
	public ResponseEntity<vehiculo> update(@PathVariable int id, @RequestBody vehiculo update) throws ConfigDataResourceNotFoundException{
		 
		 vehiculo car = repoN.findById(id).orElseThrow(()-> new ConfigDataResourceNotFoundException(null));
	  car.setKilometraje(update.getKilometraje());
	  car.setNroserial(update.getNroserial());
	  car.setColor(update.getColor());
	  car.setNromotor(update.getNromotor());
	  car.setClase(update.getClase());
	  car.setModelo(update.getModelo());
	  
      final vehiculo updatedCar = serviceN.save(car);
	 
      return ResponseEntity.ok(updatedCar);
	
	}
	
	// Inactive an Notificaciones
	@GetMapping("/inactive/{id}")
	public ResponseEntity<?> inactivate(@PathVariable int id) {
		Optional<vehiculo> optional = serviceN.findById(id);
		
		if(!optional.isPresent())
			return ResponseEntity.notFound().build();
		
		vehiculo temp = optional.get();
		
		
		return ResponseEntity.status(HttpStatus.OK).body(serviceN.save(temp));
	}
	
	// Find all an Notificaciones
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll() {
		Iterable<vehiculo> optional = serviceN.findAll();
		
		return ResponseEntity.ok(optional);
	}
	
	
	// Find all pagable an Notificaciones
	@GetMapping("/findAll/{page}/{size}")
	public ResponseEntity<?> findAll(@PathVariable Integer page, @PathVariable Integer size) {
		Iterable<vehiculo> optional = serviceN.findAll(PageRequest.of(page, size));
		
		return ResponseEntity.ok(optional);
	}
	
	// Find an Notificaciones by Id
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable int id) {
		Optional<vehiculo> optional = serviceN.findById(id);
		
		if(!optional.isPresent())
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(optional);
	}
	@GetMapping("/placa/{id}")
	public ResponseEntity<?> findByPlaca(@PathVariable String id) {
		Optional<List<vehiculo>> optional = Optional.of(repoN.findByPlaca(id));
		
		if(!optional.isPresent())
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(optional);
	}

}
