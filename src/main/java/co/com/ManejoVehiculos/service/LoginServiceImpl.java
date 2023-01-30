package co.com.ManejoVehiculos.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ManejoVehiculos.entity.Login;
import co.com.ManejoVehiculos.repository.LoginRepository;


@Service
public class LoginServiceImpl implements LoginService {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private LoginRepository loginRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Login> findAll() {		
		return loginRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Login> findAll(Pageable pageable) {		
		return loginRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Login> findById(Integer id) {
		return loginRepository.findById(id);
	}

	@Override
	@Transactional
	public Login save(Login acto) {		
		return loginRepository.save(acto);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		loginRepository.deleteById(id);		
	}

	@Override
	@Transactional
	public void delete(Login acto) {		
		loginRepository.delete(acto);
	}

}
