package co.com.ManejoVehiculos.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.ManejoVehiculos.entity.Cliente;


@Repository
public interface clienteRepository extends JpaRepository<Cliente, Integer> {

	List<Cliente> findByNumeroIdentificacion(int NroID);
	
	
	

	
}
