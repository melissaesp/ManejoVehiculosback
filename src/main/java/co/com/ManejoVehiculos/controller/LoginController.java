package co.com.ManejoVehiculos.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ManejoVehiculos.entity.Login;
import co.com.ManejoVehiculos.repository.LoginRepository;
import co.com.ManejoVehiculos.service.LoginService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private LoginService serviceN;
	
	@Autowired
	private LoginRepository repoN;
	
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll() {
		Iterable<Login> optional = serviceN.findAll();
		
		return ResponseEntity.ok(optional);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<Login>> findByUser(@RequestParam String user,@RequestParam String pass) {
		
		
		
		
		return new ResponseEntity<List<Login>>(repoN.findByUser(user, pass), HttpStatus.OK);
//		if(!optional.isPresent())
//			return ResponseEntity.notFound().build();
//		
//		return ResponseEntity.ok(optional);
	}
	
	
	
}
