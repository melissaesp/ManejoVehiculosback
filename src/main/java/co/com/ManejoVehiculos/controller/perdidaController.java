package co.com.ManejoVehiculos.controller;

import java.util.Optional;

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


import co.com.ManejoVehiculos.entity.perdida;
import co.com.ManejoVehiculos.service.perdidaService;

@RestController
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false")
@RequestMapping("/api/perdida")
public class perdidaController {
	
	@Autowired
	private perdidaService serviceN;
	
	
	
	// Create a new Notificaciones
		@PostMapping("/add")
		public ResponseEntity<?> create(@RequestBody perdida acto) {
			// Start Validations
			acto.setId(0);
			return ResponseEntity.status(HttpStatus.CREATED).body(serviceN.save( acto));

		}
		
		// Update a new Notificaciones
		@PostMapping("/alter")
		public ResponseEntity<?> update(@RequestBody perdida update) {
			Optional<perdida> actual = serviceN.findById(update.getId());

			if(!actual.isPresent())
				return ResponseEntity.notFound().build();		

			return ResponseEntity.status(HttpStatus.OK).body(serviceN.save(update));
		}
		
		// Inactive an Notificaciones
		@GetMapping("/inactive/{id}")
		public ResponseEntity<?> inactivate(@PathVariable Integer id) {

			serviceN.deleteById(id);
			
			
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		
		// Find all an Notificaciones
		@GetMapping("/findAll")
		public ResponseEntity<?> findAll() {
			Iterable<perdida> optional = serviceN.findAll();
			
			return ResponseEntity.ok(optional);
		}
		
		
		// Find all pagable an Notificaciones
		@GetMapping("/findAll/{page}/{size}")
		public ResponseEntity<?> findAll(@PathVariable Integer page, @PathVariable Integer size) {
			Iterable<perdida> optional = serviceN.findAll(PageRequest.of(page, size));
			
			return ResponseEntity.ok(optional);
		}
		
		// Find an Notificaciones by Id
		@GetMapping("/{id}")
		public ResponseEntity<?> findById(@PathVariable Integer id) {
			Optional<perdida> optional = serviceN.findById(id);
			
			if(!optional.isPresent())
				return ResponseEntity.notFound().build();
			
			return ResponseEntity.ok(optional);
		}
	

}
