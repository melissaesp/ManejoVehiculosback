package co.com.ManejoVehiculos.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lowagie.text.pdf.codec.Base64.OutputStream;

import co.com.ManejoVehiculos.entity.motor;
import co.com.ManejoVehiculos.repository.motorRepository;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

public interface motorService {
	public static final motorRepository repository = null;
	
	
	public Iterable<motor> findAll();
	
	public Page<motor> findAll(Pageable pageable);
	
	public Optional<motor> findById(Integer id);
	
	public motor save(motor accesoExterno);
	
	public void deleteById(Integer id);
	
	public void delete(motor accesoExterno);
	public default void exportReport(int id,OutputStream outputstream) throws JRException,IOException,SQLException {
		JasperPrint jasperPrint=repository.exportReport(id);
		
		JasperExportManager.exportReportToPdfStream(jasperPrint, outputstream);
	}
}
