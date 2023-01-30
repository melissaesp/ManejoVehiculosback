package co.com.ManejoVehiculos.service;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.ManejoVehiculos.entity.Cliente;


public interface clienteService {

	public Iterable<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Optional<Cliente> findById(Integer id);
	
	public Cliente save(Cliente accesoExterno);
	
	public void deleteById(Integer id);
	
	public void delete(Cliente accesoExterno);
	
	
}
