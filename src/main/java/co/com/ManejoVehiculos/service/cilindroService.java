package co.com.ManejoVehiculos.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import co.com.ManejoVehiculos.entity.cilindro;

public interface cilindroService {
public Iterable<cilindro> findAll();
	
	public Page<cilindro> findAll(Pageable pageable);
	
	public Optional<cilindro> findById(Integer id);
	
	public cilindro save(cilindro accesoExterno);
	
	public void deleteById(Integer id);
	
	public void delete(cilindro accesoExterno);
	
}
