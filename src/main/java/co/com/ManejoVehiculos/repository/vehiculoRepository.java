package co.com.ManejoVehiculos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.ManejoVehiculos.entity.vehiculo;

@Repository
public interface vehiculoRepository extends JpaRepository<vehiculo, Integer> {
	
	
	@Query(value="SELECT * FROM vehiculo v  WHERE v.Placa = ?1  ", nativeQuery = true)
	List<vehiculo> findByPlaca(String placa);
	
	
}
