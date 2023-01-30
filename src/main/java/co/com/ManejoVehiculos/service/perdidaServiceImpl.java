package co.com.ManejoVehiculos.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ManejoVehiculos.entity.perdida;
import co.com.ManejoVehiculos.repository.perdidaRepository;

@Service
public class perdidaServiceImpl implements perdidaService{

	
	@Autowired
	private perdidaRepository perdidaRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<perdida> findAll() {		
		return perdidaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<perdida> findAll(Pageable pageable) {		
		return perdidaRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<perdida> findById(Integer id) {
		return perdidaRepository.findById(id);
	}

	@Override
	@Transactional
	public perdida save(perdida acto) {		
		return perdidaRepository.save(acto);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		perdidaRepository.deleteById(id);		
	}

	@Override
	@Transactional
	public void delete(perdida acto) {		
		perdidaRepository.delete(acto);
	}
	
	
}
