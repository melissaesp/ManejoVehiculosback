package co.com.ManejoVehiculos.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ManejoVehiculos.entity.Cliente;
import co.com.ManejoVehiculos.repository.clienteRepository;



@Service
public class clienteServiceImpl implements clienteService {

	
	@Autowired
	private clienteRepository clienteRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Cliente> findAll() {		
		return clienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {		
		return clienteRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> findById(Integer id) {
		return clienteRepository.findById(id);
	}

	@Override
	@Transactional
	public Cliente save(Cliente acto) {		
		return clienteRepository.save(acto);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		clienteRepository.deleteById(id);		
	}

	@Override
	@Transactional
	public void delete(Cliente acto) {		
		clienteRepository.delete(acto);
	}
}
