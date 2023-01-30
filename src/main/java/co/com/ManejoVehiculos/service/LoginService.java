package co.com.ManejoVehiculos.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.ManejoVehiculos.entity.Login;



public interface LoginService {

	public Iterable<Login> findAll();
	
	public Page<Login> findAll(Pageable pageable);
	
	public Optional<Login> findById(Integer id);
	
	public Login save(Login accesoExterno);
	
	public void deleteById(Integer id);
	
	public void delete(Login accesoExterno);
	
	
	 
	
	
}
