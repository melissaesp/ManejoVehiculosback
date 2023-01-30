package co.com.ManejoVehiculos.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ManejoVehiculos.entity.vehiculo;
import co.com.ManejoVehiculos.repository.vehiculoRepository;

@Service
public class vehiculoServiceImpl implements vehiculoService{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private vehiculoRepository VehiculoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<vehiculo> findAll() {		
		return VehiculoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<vehiculo> findAll(Pageable pageable) {		
		return VehiculoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<vehiculo> findById(Integer id) {
		return VehiculoRepository.findById(id);
	}

	@Override
	@Transactional
	public vehiculo save(vehiculo acto) {		
		return VehiculoRepository.save(acto);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		VehiculoRepository.deleteById(id);		
	}

	@Override
	@Transactional
	public void delete(vehiculo acto) {		
		VehiculoRepository.delete(acto);
	}
	
	
	
	
}

