package co.com.ManejoVehiculos.service;

import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.com.ManejoVehiculos.entity.motor;
import co.com.ManejoVehiculos.repository.motorRepository;


@Service
public class motorServiceImpl implements motorService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private motorRepository VehiculoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<motor> findAll() {		
		return VehiculoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<motor> findAll(Pageable pageable) {		
		return VehiculoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<motor> findById(Integer id) {
		return VehiculoRepository.findById(id);
	}

	@Override
	@Transactional
	public motor save(motor acto) {		
		return VehiculoRepository.save(acto);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		VehiculoRepository.deleteById(id);		
	}

	@Override
	@Transactional
	public void delete(motor acto) {		
		VehiculoRepository.delete(acto);
	}
}
