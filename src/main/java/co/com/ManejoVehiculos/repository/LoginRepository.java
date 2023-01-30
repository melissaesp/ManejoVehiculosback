package co.com.ManejoVehiculos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.com.ManejoVehiculos.entity.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{
		
	@Query(value="SELECT* FROM login u WHERE (u.user =:user) AND (u.password =:password)", nativeQuery = true)
	List<Login> findByUser(@Param("user")String user, @Param("password") String name);
}
