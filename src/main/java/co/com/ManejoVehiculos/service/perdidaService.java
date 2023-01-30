package co.com.ManejoVehiculos.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.ManejoVehiculos.entity.perdida;



public interface perdidaService {
	
public Iterable<perdida> findAll();
	
	public Page<perdida> findAll(Pageable pageable);
	
	public Optional<perdida> findById(Integer id);
	
	public perdida save(perdida accesoExterno);
	
	public void deleteById(Integer id);
	
	public void delete(perdida accesoExterno);
	
	
}
