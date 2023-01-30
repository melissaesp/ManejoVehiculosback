package co.com.ManejoVehiculos.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ManejoVehiculos.entity.cilindro;
import co.com.ManejoVehiculos.repository.cilindroRepository;


@Service
public class cilindroServiceImpl implements cilindroService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private cilindroRepository cilindroRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<cilindro> findAll() {		
		return cilindroRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<cilindro> findAll(Pageable pageable) {		
		return cilindroRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<cilindro> findById(Integer id) {
		return cilindroRepository.findById(id);
	}

	@Override
	@Transactional
	public cilindro save(cilindro acto) {		
		return cilindroRepository.save(acto);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		cilindroRepository.deleteById(id);		
	}

	@Override
	@Transactional
	public void delete(cilindro acto) {		
		cilindroRepository.delete(acto);
	}
}
