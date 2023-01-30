package co.com.ManejoVehiculos.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lowagie.text.pdf.codec.Base64.OutputStream;

import co.com.ManejoVehiculos.entity.revision_tecnica;
import co.com.ManejoVehiculos.repository.revisionRepository;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;


public interface revisionService {
	
	
	public static final revisionRepository repository = null;
	
	public Iterable<revision_tecnica> findAll();
	
	public Page<revision_tecnica> findAll(Pageable pageable);
	
	public Optional<revision_tecnica> findById(Integer id);
	
	public revision_tecnica save(revision_tecnica accesoExterno);
	
	public void deleteById(Integer id);
	
	public default void exportReport(int id,OutputStream outputstream) throws JRException,IOException,SQLException {
		JasperPrint jasperPrint=repository.exportReport(id);
		
		JasperExportManager.exportReportToPdfStream(jasperPrint, outputstream);
	}
	
}
