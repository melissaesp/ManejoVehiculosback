package co.com.ManejoVehiculos.service;

import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.com.ManejoVehiculos.entity.revision_tecnica;
import co.com.ManejoVehiculos.repository.revisionRepository;

@Service
public class revisionServiceImp implements revisionService {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private revisionRepository revisionRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<revision_tecnica> findAll() {		
		return revisionRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<revision_tecnica> findAll(Pageable pageable) {		
		return revisionRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<revision_tecnica> findById(Integer id) {
		return revisionRepository.findById(id);
	}

	@Override
	@Transactional
	public revision_tecnica save(revision_tecnica acto) {		
		return revisionRepository.save(acto);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		revisionRepository.deleteById(id);		
	}


	@Transactional
	public void delete(revision_tecnica acto) {		
		revisionRepository.delete(acto);
	}
	
}
