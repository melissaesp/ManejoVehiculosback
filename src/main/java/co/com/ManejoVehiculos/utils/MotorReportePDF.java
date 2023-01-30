package co.com.ManejoVehiculos.utils;


import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import co.com.ManejoVehiculos.entity.cilindro;
import co.com.ManejoVehiculos.entity.perdida;
import co.com.ManejoVehiculos.entity.vehiculo;



public class MotorReportePDF{


	
	public void buildPdfDocument(List < vehiculo> listvehiculo, HttpServletResponse response) throws DocumentException, IOException  {
		 // Creating the Object of Document
		 Document document = new Document(PageSize.LETTER);
		 // Getting instance of PdfWriter
		 
		    // Opening the created document to change it
		    document.open();
		    Image icon = Image.getInstance(ClassLoader.getSystemResource("logo.png"));
		    icon.scaleAbsolute(200, 150);;
		    icon.setAlignment(Element.ALIGN_CENTER);
		 // Creating font
		    // Setting font style and size
		    Font fontTiltle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		    fontTiltle.setSize(18);
		    
		    
		    // Creating paragraph
		    Paragraph paragraph1 = new Paragraph("Reporte Motor", fontTiltle);
		    paragraph1.setSpacingAfter(20);
		 // Aligning the paragraph in the document
		    paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
		  
		    // Creating a table 
		    PdfPTable tablevehiculo = new PdfPTable(5);
		    PdfPTable tablecliente = new PdfPTable(4);
		    PdfPTable tablepropietario = new PdfPTable(3);
		    PdfPTable tablecilindro = new PdfPTable(3);
		    PdfPTable tableperdida = new PdfPTable(2);
		    PdfPTable tableMotor = new PdfPTable(3);
		    PdfPTable tableMotor2 = new PdfPTable(3);
		    PdfPTable titulopropie = new PdfPTable(1);
		    PdfPTable titulocliente = new PdfPTable(1);
		    PdfPTable titulocilin = new PdfPTable(1);
		    PdfPTable tituloperdida = new PdfPTable(1);
		    PdfPTable titulomotor = new PdfPTable(1);
		    PdfPTable titulovehiculo = new PdfPTable(1);
		    PdfPTable tableobservacion = new PdfPTable(1);
		    
		    // Setting width of the table, its columns and spacing
		    tablevehiculo.setWidthPercentage(100);
		    tablevehiculo.setWidths(new int[] {2,2,2,2,2});
		    tablevehiculo.setSpacingBefore(5);
		    tablecliente.setWidthPercentage(100);
		    tablecliente.setWidths(new int[] {3,3,3,3});
		    tablecliente.setSpacingBefore(5);
		    tablepropietario.setWidthPercentage(100 );
		    tablepropietario.setWidths(new int[] {3,3,3});
		    tablepropietario.setSpacingBefore(5);
		    tableperdida.setWidthPercentage(100);
		    tableperdida.setWidths(new int[] {3,3});
		    tableperdida.setSpacingBefore(5);
		    tablecilindro.setWidthPercentage(100);
		    tablecilindro.setWidths(new int[] {2,2,2});
		    tablecilindro.setSpacingBefore(5);
		    tableMotor.setWidthPercentage(100);
		    tableMotor.setWidths(new int[] {2,2,2});
		    tableMotor.setSpacingBefore(5);
		    tableMotor2.setWidthPercentage(100);
		    tableMotor2.setWidths(new int[] {2,2,2});
		    tableMotor2.setSpacingBefore(5);
		    titulopropie.setWidthPercentage(100);
		    titulocliente.setWidthPercentage(100);
		    tituloperdida.setWidthPercentage(100);
		    titulocilin.setWidthPercentage(100);
		    titulomotor.setWidthPercentage(100);
		    titulovehiculo.setWidthPercentage(100);
		    tableobservacion.setWidthPercentage(100);
		    tableobservacion.setWidths(new int[] {3});
		    tableobservacion.setSpacingBefore(5);
		   
		    // Create Table Cells for the table header
		    PdfPCell cell = new PdfPCell();
		    PdfPCell cell2 = new PdfPCell();
		    PdfPCell cell3 = new PdfPCell();
		    PdfPCell cell4 = new PdfPCell();
		    PdfPCell cell5 = new PdfPCell();
		    PdfPCell cell6 = new PdfPCell();
		    PdfPCell celltitulos = new PdfPCell();
		    // Setting the background color and padding of the table cell
		    cell.setBackgroundColor(CMYKColor.RED);
		    cell.setPadding(5);
		    cell2.setBackgroundColor(CMYKColor.RED);
		    cell2.setPadding(5);
		    cell3.setBackgroundColor(CMYKColor.RED);
		    cell3.setPadding(5);
		    cell4.setBackgroundColor(CMYKColor.RED);
		    cell4.setPadding(5);
		    cell5.setBackgroundColor(CMYKColor.RED);
		    cell5.setPadding(5);
		    cell6.setBackgroundColor(CMYKColor.RED);
		    cell6.setPadding(5);
		    celltitulos.setBorder(0);
		    celltitulos.setBackgroundColor(new Color(255,255,254,255));
		    celltitulos.setHorizontalAlignment(Element.ALIGN_LEFT);
		    celltitulos.setVerticalAlignment(Element.ALIGN_LEFT);
		   		   
		    // Creating font
		    // Setting font style and size
		    Font font = FontFactory.getFont(FontFactory.HELVETICA);
		    font.setColor(CMYKColor.WHITE);
		    Font fonttitulos = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		    fonttitulos.setColor(CMYKColor.BLACK);
		    fonttitulos.setSize(18);
		    // Adding headings in the created table cell or  header
		    // Adding Cell to table
		    //----datos vehiculo----------//
		    
		    celltitulos.setPhrase(new Phrase("Datos vehiculo", fonttitulos));
		    titulovehiculo.addCell(celltitulos);
		    titulovehiculo.setSpacingAfter(10);
		    cell.setPhrase(new Phrase("Placa ", font));
		    tablevehiculo.addCell(cell);
		    cell.setPhrase(new Phrase("Fecha de registro", font));
		    tablevehiculo.addCell(cell);
		    cell.setPhrase(new Phrase("Nro chasis ", font));
		    tablevehiculo.addCell(cell);
		    cell.setPhrase(new Phrase("Modelo", font));
		    tablevehiculo.addCell(cell);
		    cell.setPhrase(new Phrase("Marca", font));
		    tablevehiculo.addCell(cell);
		    tablevehiculo.setSpacingAfter(10);
		    
		   //----campos de propietario---////
		
		    
		    celltitulos.setPhrase(new Phrase("Datos propietario ", fonttitulos));
		    titulopropie.addCell(celltitulos);
		    titulopropie.setSpacingAfter(10);
		    
		    cell.setPhrase(new Phrase("Identificación ", font));
		    tablecliente.addCell(cell);
		    cell.setPhrase(new Phrase("Nombre", font));
		    tablecliente.addCell(cell);
		    cell.setPhrase(new Phrase("Dirección ", font));
		    tablecliente.addCell(cell);
		    cell.setPhrase(new Phrase("Celular ", font));
		    tablecliente.addCell(cell);
		    //-----campos cliente-----------//
		 
		    celltitulos.setPhrase(new Phrase("Datos cliente ", fonttitulos));
		    titulocliente.addCell(celltitulos);
		    titulocliente.setSpacingAfter(10);
		    cell2.setPhrase(new Phrase("Identificación", font));
		    tablepropietario.addCell(cell2);
		    cell2.setPhrase(new Phrase("Nombre", font));
		    tablepropietario.addCell(cell2);
		    cell2.setPhrase(new Phrase("Celular", font));
		    tablepropietario.addCell(cell2);
		   //-------campos perdida----------//
		    celltitulos.setPhrase(new Phrase("Perdidas de fluidos del motor ", fonttitulos));
		    tituloperdida.addCell(celltitulos);
		    tituloperdida.setSpacingAfter(10);
			  cell3.setPhrase(new Phrase("Perdida fluido", font));		  
			  tableperdida.addCell(cell3); 
			  cell3.setPhrase(new Phrase("Revisar", font));
			  tableperdida.addCell(cell3);
			 //-------campos cilindro----------//
		 
			celltitulos.setPhrase(new Phrase("Cilindros de motor ", fonttitulos));
			titulocilin.addCell(celltitulos); 
			titulocilin.setSpacingAfter(10);
		    cell4.setPhrase(new Phrase("Cilindro", font));
		    tablecilindro.addCell(cell4);
		    cell4.setPhrase(new Phrase("Valor", font));
		    tablecilindro.addCell(cell4);
		    cell4.setPhrase(new Phrase("Vacio", font));
		    tablecilindro.addCell(cell4);
		   
		    
		    //-----------motor--------------------//
		    celltitulos.setPhrase(new Phrase("Niveles de fluidos ", fonttitulos));
		    titulomotor.addCell(celltitulos);
		    titulomotor.setSpacingAfter(10);
		    cell5.setPhrase(new Phrase("Aceite motor", font));
		    tableMotor.addCell(cell5);
		    cell5.setPhrase(new Phrase("Dirección hidráulica", font));
		    tableMotor.addCell(cell5);
		    cell5.setPhrase(new Phrase("Lava parabrisas", font));
		    tableMotor.addCell(cell5);
		    cell5.setPhrase(new Phrase("Liquido frenos", font));
		    tableMotor2.addCell(cell5);
		    cell5.setPhrase(new Phrase("Embrague", font));
		    tableMotor2.addCell(cell5);
		    cell5.setPhrase(new Phrase("Refrigerante", font));
		    tableMotor2.addCell(cell5);
		    cell5.setPhrase(new Phrase("Observaciones", font));
		    tableobservacion.addCell(cell5);
		    
		    for(vehiculo vehiculo:listvehiculo) {
		    	//-----------------VEHICULO---------------//
		    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    	tablevehiculo.addCell(vehiculo.getPlaca());
		    	tablevehiculo.addCell(sdf.format(vehiculo.getCreatedDate()));
		    	tablevehiculo.addCell(vehiculo.getNrochasis());
		    	tablevehiculo.addCell(vehiculo.getModelo());
		    	tablevehiculo.addCell(vehiculo.getMarca());
		    	
		    	//-----------------TABLA PROPIETARIO-------------//
		    	
		    	tablecliente.addCell(vehiculo.getId_cliente().getIdentificacionPropietario());
		    	tablecliente.addCell(vehiculo.getId_cliente().getNombrePropietario());
		    	tablecliente.addCell(vehiculo.getId_cliente().getDireccionP());
		    	tablecliente.addCell(vehiculo.getId_cliente().getCelularPropietario());
		    	
		    	
		    	//---------------TABLA CLIENTE---------//
		    	
		    	tablepropietario.addCell(String.valueOf(vehiculo.getId_cliente().getNumeroIdentificacion()));
		    	tablepropietario.addCell(vehiculo.getId_cliente().getNombreC());
		    	tablepropietario.addCell(vehiculo.getId_cliente().getCelularC());   	
		    	//table2.addCell(vehiculo.getId_motor().getAceitemotor());
		    	//-----------TABLA PERDIDA----------//

			  for(perdida perdida:vehiculo.getId_motor().getId_perdida()) {		  
			  tableperdida.addCell(perdida.getPerdidafluido());
			  tableperdida.addCell(perdida.getRevisar());
			  
			  }	 
		    	//---------TABLA CILINDRO--------//
				
				  for(cilindro cilindro:vehiculo.getId_motor().getId_cilindro()) {
				  tablecilindro.addCell(cilindro.getCilindro());
				  tablecilindro.addCell(cilindro.getValor());
				  tablecilindro.addCell(cilindro.getVacio());				  
				  }
				  
				  //------------------datos motor-----------------------//
				  tableMotor.addCell(vehiculo.getId_motor().getAceitemotor());
				  tableMotor.addCell(vehiculo.getId_motor().getDireccionhidraulica());
				  tableMotor.addCell(vehiculo.getId_motor().getLavaparabrisas());
				  tableMotor2.addCell(vehiculo.getId_motor().getLiquidofrenos());
				  tableMotor2.addCell(vehiculo.getId_motor().getEmbrague());
				  tableMotor2.addCell(vehiculo.getId_motor().getRefigerante());
				  tableobservacion.addCell(vehiculo.getId_motor().getObservaciones());
				  
		    }
		    
		
		   
		    
		    
		    // Adding the created table to the document
		    document.add(icon);
		    // Adding the created paragraph in the document
		    document.add(paragraph1);
		    document.add(titulovehiculo);
		    document.add(tablevehiculo);
		    document.add(titulocliente);
		    document.add(tablecliente);
		    document.add(titulopropie);
		    document.add(tablepropietario);
		    document.add(tituloperdida);
		    document.add(tableperdida);
		    document.add(titulocilin);
		    document.add(tablecilindro);
		    document.add(titulomotor);
		    document.add(tableMotor);
		    document.add(tableMotor2);
		    document.add(tableobservacion);
		    // Closing the document
		    document.close();
	}
	
	

}
