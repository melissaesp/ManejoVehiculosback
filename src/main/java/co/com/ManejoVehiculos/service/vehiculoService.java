package co.com.ManejoVehiculos.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.ManejoVehiculos.entity.vehiculo;


public interface vehiculoService {
	
	

public Iterable<vehiculo> findAll();
	
	public Page<vehiculo> findAll(Pageable pageable);
	
	public Optional<vehiculo> findById(Integer id);
	
	public vehiculo save(vehiculo accesoExterno);
	
	
	
	public void deleteById(Integer id);
	
	public void delete(vehiculo accesoExterno);
	
}
