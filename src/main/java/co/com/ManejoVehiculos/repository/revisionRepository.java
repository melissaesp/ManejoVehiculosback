package co.com.ManejoVehiculos.repository;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;



import co.com.ManejoVehiculos.entity.revision_tecnica;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;



@Repository
public interface revisionRepository extends JpaRepository<revision_tecnica, Integer>{

	
	 public default JasperPrint exportReport(int id) throws FileNotFoundException, JRException{
	
		try {
			File file=ResourceUtils.getFile("classpath:reporteTecnicoMecanico.jrxml");
			 JasperReport jasperReport=JasperCompileManager.compileReport(file.getAbsolutePath());
			 Map<String, Object> parametres=new HashMap<>();
			 parametres.put("id", id);
			 JasperPrint jasperprint= JasperFillManager.fillReport(jasperReport,parametres ); 
			 return jasperprint;
			 
		} catch (Exception e) {
			System.out.println("Error no se pudo bro");
			return null;
		} 
		 
		 
		 
	 
		 
		 
	 }
	
	
	
	
}
