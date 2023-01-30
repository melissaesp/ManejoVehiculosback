package co.com.ManejoVehiculos.service;

import java.io.IOException;
import java.util.List;

import co.com.ManejoVehiculos.entity.revision_tecnica;
import co.com.ManejoVehiculos.entity.vehiculo;
import net.sf.jasperreports.engine.JRException;

public interface reportemotor {
	
	 String generateReport(String placa, String fileFormat) throws JRException, IOException;
	 
	 List<vehiculo> findAllVehiculo();
	 List<revision_tecnica> findRevision(int id);
}
