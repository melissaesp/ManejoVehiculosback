package co.com.ManejoVehiculos.utils;

import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.ExceptionConverter;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfName;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.RGBColor;
import co.com.ManejoVehiculos.entity.cilindro;
import co.com.ManejoVehiculos.entity.perdida;
import co.com.ManejoVehiculos.entity.revision_tecnica;


public class revisionReporte {

	
	
	
public void buildPdfDocument(List <revision_tecnica> listrevision, HttpServletResponse response) throws DocumentException, IOException  {
		
		 // Creating the Object of Document
		 Document document = new Document(PageSize.LEGAL);
		 
		 // Getting instance of PdfWriter
		  PdfWriter writer=  PdfWriter.getInstance(document, response.getOutputStream());
		    // Opening the created document to change it
		  
		  
		  document.open();
			
			  Image icon = Image.getInstance(ClassLoader.getSystemResource("logo.png"));
			  icon.scaleAbsolute(100, 50);; icon.setAlignment(Element.ALIGN_CENTER); 
			 // Creating font // Setting font style and size
			  Font fontTiltle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
			  fontTiltle.setSize(18);
			   
		    // Creating paragraph
		    
		    // Creating a table 
		    PdfPTable tablevehiculo = new PdfPTable(2);
		    PdfPTable tablevehiculo2 = new PdfPTable(2);
		    PdfPTable tablecliente = new PdfPTable(2);
		    PdfPTable tablepropietario = new PdfPTable(3);
		    PdfPTable tablecilindro = new PdfPTable(3);
		    PdfPTable tableperdida = new PdfPTable(2);
		    PdfPTable tableMotor = new PdfPTable(3);
		    PdfPTable tableMotor2 = new PdfPTable(3);
		    PdfPTable titulopropie = new PdfPTable(1);
		    PdfPTable tituloEstructura = new PdfPTable(1);
		    PdfPTable tituloLatoneria = new PdfPTable(1);
		    PdfPTable titulovidrio = new PdfPTable(1);
		    PdfPTable titulochasis = new PdfPTable(1);
		    PdfPTable titulointerior = new PdfPTable(1);
		    PdfPTable tituloluces = new PdfPTable(1);
		    PdfPTable titulosuspencion = new PdfPTable(1);
		    PdfPTable titulocliente = new PdfPTable(1);
		    PdfPTable titulocilin = new PdfPTable(1);
		    PdfPTable tituloperdida = new PdfPTable(1);
		    PdfPTable titulomotor = new PdfPTable(1);
		    PdfPTable firma = new PdfPTable(1);
		    PdfPTable tituloftos = new PdfPTable(1);
		    PdfPTable tituloresumen = new PdfPTable(1);
		    PdfPTable titulovehiculo = new PdfPTable(1);
		    PdfPTable tableobservacion = new PdfPTable(1);
		    PdfPTable tableFotos = new PdfPTable(3);
		    PdfPTable tableFotos2 = new PdfPTable(2);
		    PdfPTable tableresumen = new PdfPTable(6);
		    PdfPTable tableTotal = new PdfPTable(2);
		    PdfPTable tableObservaciontotal = new PdfPTable(1);
		    PdfPTable tabledictamen = new PdfPTable(1);
		    PdfPTable tableLatoneria = new PdfPTable(2);
		    PdfPTable tablevidrio = new PdfPTable(2);
		    PdfPTable tablechasis = new PdfPTable(2);
		    PdfPTable tableinterior = new PdfPTable(2);
		    PdfPTable tableluces = new PdfPTable(2);
		    PdfPTable tablesuspencion = new PdfPTable(2);
		    PdfPTable tableimprontas = new PdfPTable(2);
		    
		    
		    tableLatoneria.setWidthPercentage(100);
		    tablevidrio.setWidthPercentage(100);
		    tablechasis.setWidthPercentage(100);
		    tableinterior.setWidthPercentage(100);
		    tableluces.setWidthPercentage(100);
		    tablesuspencion.setWidthPercentage(100);
		    tablevehiculo.setWidthPercentage(100);
		    tablevehiculo2.setWidthPercentage(100);
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
		    tableMotor2.setSpacingBefore(0);
		    tablecliente.setWidthPercentage(100);
		    tablepropietario.setWidthPercentage(100);
		    titulopropie.setWidthPercentage(100);
		    titulochasis.setWidthPercentage(100);
		    titulovidrio.setWidthPercentage(100);
		    tituloLatoneria.setWidthPercentage(100);
		    tituloluces.setWidthPercentage(100);
		    titulointerior.setWidthPercentage(100);
		    titulosuspencion.setWidthPercentage(100);
		    titulocliente.setWidthPercentage(100);
		    tituloperdida.setWidthPercentage(100);
		    titulocilin.setWidthPercentage(100);
		    tituloEstructura.setWidthPercentage(100);
		    titulomotor.setWidthPercentage(100);
		    titulomotor.setSpacingBefore(5);
		    titulovehiculo.setWidthPercentage(100);
		    tituloftos.setWidthPercentage(100);
		    tituloftos.setSpacingBefore(0);
		    tituloresumen.setWidthPercentage(100);
		    tituloresumen.setSpacingBefore(0);
		    tableobservacion.setWidthPercentage(100);
		    tableobservacion.setWidths(new int[] {3});
		    tableobservacion.setSpacingBefore(5);
		    tabledictamen.setWidthPercentage(100);
		    tabledictamen.setWidths(new int[] {3});
		    tabledictamen.setSpacingBefore(5);
		    tableObservaciontotal.setWidthPercentage(100);
		    tableObservaciontotal.setWidths(new int[] {3});
		    tableObservaciontotal.setSpacingBefore(5);
		    tableFotos.setWidthPercentage(100 );
		    tableFotos.setWidths(new int[] {3,3,3});
		    tableFotos.setSpacingBefore(5); 
		    tableFotos2.setWidthPercentage(100 );
		    tableFotos2.setWidths(new int[] {3,3});
		    tableFotos2.setSpacingBefore(5); 
		    tableresumen.setWidthPercentage(100);
		    tableresumen.setWidths(new int[] {2,2,2,2,2,2});
		    tableresumen.setSpacingBefore(5); 
		    tableTotal.setWidthPercentage(100);
		    tableimprontas.setWidthPercentage(100);
		    tableimprontas.setSpacingBefore(10);
		    tableimprontas.setWidths(new int[] {1,4});
		    // Create Table Cells for the table header
		    PdfPCell cell = new PdfPCell();
		    PdfPCell cellvehi = new PdfPCell();
		    PdfPCell cell2 = new PdfPCell();
		    PdfPCell cell3 = new PdfPCell();
		    PdfPCell cell4 = new PdfPCell();
		    PdfPCell cell5 = new PdfPCell();
		    PdfPCell cell6 = new PdfPCell();
		    PdfPCell celltitulos = new PdfPCell();
		    // Setting the background color and padding of the table cell
		    cell.setBackgroundColor(new Color( 242, 68, 68));
		    cell.setPadding(5);
		    cellvehi.setBackgroundColor(new Color( 242, 68, 68));
		    cellvehi.setPadding(5);
		    cell2.setBackgroundColor(new Color( 242, 68, 68));
		    cell2.setPadding(5);
		    cell3.setBackgroundColor(new Color( 242, 68, 68));
		    cell3.setPadding(5);
		    cell4.setBackgroundColor(new Color( 242, 68, 68));
		    cell4.setPadding(5);
		    cell5.setBackgroundColor(new Color( 242, 68, 68));
		    cell5.setPadding(5);
		    cell6.setBackgroundColor(new Color( 242, 68, 68));
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
		    fonttitulos.setSize(14);
		    // Adding headings in the created table cell or  header
		    // Adding Cell to table
		    
		    //----datos vehiculo----------//
		    
		    celltitulos.setPhrase(new Phrase("Datos vehículo", fonttitulos));
		    titulovehiculo.addCell(celltitulos);
		    titulovehiculo.setSpacingAfter(10);
		    celltitulos.setPhrase(new Phrase("Fotos vehículo ", fonttitulos));
		    tituloftos.addCell(celltitulos);
		    cell.setPhrase(new Phrase("Foto lateral izquierda",font));
		    tableFotos.addCell(cell);
		    cell.setPhrase(new Phrase("Foto consola",font));
		    tableFotos.addCell(cell);
		    cell.setPhrase(new Phrase("Foto lateral derecho",font));
		    tableFotos.addCell(cell);
		    cell.setPhrase(new Phrase("Foto trasera",font));
		    tableFotos2.addCell(cell);
		    cell.setPhrase(new Phrase("Foto frente",font));
		    tableFotos2.addCell(cell);
		    
		   //----campos de cliente---////
			
			  celltitulos.setPhrase(new Phrase("Datos Cliente ", fonttitulos));
			  titulocliente.addCell(celltitulos); titulocliente.setSpacingAfter(10);
			 
		    //-----campos propietario-----------//
		 
			
			 celltitulos.setPhrase(new Phrase("Datos Propietario ", fonttitulos));
			  titulopropie.addCell(celltitulos); titulopropie.setSpacingAfter(10);
			 
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
		    cell5.setPhrase(new Phrase("Observaciones motor ", font));
		    tableobservacion.addCell(cell5);
		    
		    celltitulos.setPhrase(new Phrase("Estado de el vehículo en porcentaje ", fonttitulos));
		    tituloresumen.addCell(celltitulos);
		    
		    cellvehi.setPhrase(new Phrase("chasis", font));
		    tableresumen.addCell(cellvehi);
		    cellvehi.setPhrase(new Phrase("Estructura", font));
		    tableresumen.addCell(cellvehi);
		    cellvehi.setPhrase(new Phrase("Estado interior ", font));
		    tableresumen.addCell(cellvehi);
		    cellvehi.setPhrase(new Phrase("Luces", font));
		    tableresumen.addCell(cellvehi);
		    cellvehi.setPhrase(new Phrase("Latoneria", font));
		    tableresumen.addCell(cellvehi);
		    cellvehi.setPhrase(new Phrase("vidrios", font));
		    tableresumen.addCell(cellvehi);
		    
		    cell5.setPhrase(new Phrase("Observaciones generales ", font));
		    tableObservaciontotal.addCell(cell5);
		    cell5.setPhrase(new Phrase("Dictamen ", font));
		    tabledictamen.addCell(cell5);
		    
		    Paragraph paragraph1 = null;
		    
		    ///------------------------------------------------------------------------CONSULTAS PARA LLENAR CAMPOS---------------------------------------------------------------//
		    for(revision_tecnica revision : listrevision) {
		    	paragraph1 = new Paragraph("Reporte Tecnico mecanico"+" Reporte N°:" +revision.getId(), fontTiltle);
			    paragraph1.setSpacingAfter(20);
			 // Aligning the paragraph in the document
			    paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
		    	//-----------------FOTOS DEL VEHICULO---------------//
		    	byte[] fotoconsola= Base64.getDecoder().decode(revision.getId_vehiculo().getFotoconsola());
		    	Image fotoConsola= Image.getInstance(fotoconsola);
		    	
		    	byte[] fotolateralder= Base64.getDecoder().decode(revision.getId_vehiculo().getFotolateralder());
		    	Image fotoLateralder= Image.getInstance(fotolateralder);
		    	
		    	byte[] fotolateraliz= Base64.getDecoder().decode(revision.getId_vehiculo().getFotolateralizq());
		    	Image fotoLateraliz= Image.getInstance(fotolateraliz);
		    	byte[] fotofrente= Base64.getDecoder().decode(revision.getId_vehiculo().getFotofrente());
		    	Image fotoFrente= Image.getInstance(fotofrente);
		    	byte[] fototrasera= Base64.getDecoder().decode(revision.getId_vehiculo().getFototrasera());
		    	Image fotoTrasera= Image.getInstance(fototrasera);
    	
		    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    	
		    	//-----------------------------DATOS VEHICULO-------------------------------///
		    	 addRow (tablevehiculo, 2, "Placa", revision.getId_vehiculo().getPlaca());
		    	 addRow (tablevehiculo, 2, "Fecha de registro", sdf.format(revision.getId_vehiculo().getCreatedDate()));
		    	 addRow (tablevehiculo, 2, "Número serial", revision.getId_vehiculo().getNroserial());
		    	 addRow (tablevehiculo, 2, "Número motor", revision.getId_vehiculo().getNromotor());
		    	 addRow (tablevehiculo, 2, "Número chasis", revision.getId_vehiculo().getNrochasis());
		    	 addRow (tablevehiculo, 2, "Color", revision.getId_vehiculo().getColor());
		    	 addRow (tablevehiculo, 2, "Clase", revision.getId_vehiculo().getClase());
		    	 addRow (tablevehiculo, 2, "Modelo", revision.getId_vehiculo().getModelo());
		    	 addRow (tablevehiculo, 2, "Marca", revision.getId_vehiculo().getMarca());
		    	 addRow (tablevehiculo, 2, "Cilindraje", revision.getId_vehiculo().getCilindraje());
		    	 addRow (tablevehiculo, 2, "Observaciones al vehículo", revision.getId_vehiculo().getObservaciones());
		    	
		    	
		    	 
		    	 
		    	tableFotos.addCell(fotoLateraliz);
		    	tableFotos.addCell(fotoConsola);
		    	tableFotos.addCell(fotoLateralder);
		    	tableFotos2.addCell(fotoTrasera);
		    	tableFotos2.addCell(fotoFrente);
		    	
		    	//-----------------TABLA PROPIETARIO-------------//
		    	 addRow (tablepropietario, 2, "Identificación", revision.getId_vehiculo().getId_cliente().getIdentificacionPropietario());
		    	 addRow (tablepropietario, 2, "Nombre", revision.getId_vehiculo().getId_cliente().getNombrePropietario());
		    	 addRow (tablepropietario, 2, "Celular", revision.getId_vehiculo().getId_cliente().getCelularPropietario());
	    	
		    	//---------------TABLA CLIENTE---------//
		    	 addRow (tablecliente,2, "Identificación",String.valueOf(revision.getId_vehiculo().getId_cliente().getNumeroIdentificacion()));
		    	 addRow (tablecliente,2, "Nombre ",revision.getId_vehiculo().getId_cliente().getNombreC());
		    	 addRow (tablecliente,2, "Dirección",revision.getId_vehiculo().getId_cliente().getDireccionC());
		    	 addRow (tablecliente,2, "Celular ",revision.getId_vehiculo().getId_cliente().getCelularC());
		    	 
		    	 //---------------------resumen-------------------------------//
		    	 
		    	 
		    	 
		    	 
		    	 
		    	//-----------TABLA PERDIDA----------//

		    	 for(perdida perdida: revision.getId_vehiculo().getId_motor().getId_perdida()) {		  
		    		 tableperdida.addCell(perdida.getPerdidafluido());
		    		 tableperdida.addCell(perdida.getRevisar());
			  
			  }	 
		    	//---------TABLA CILINDRO--------//
				
				 for(cilindro cilindro:revision.getId_vehiculo().getId_motor().getId_cilindro()) {
					  tablecilindro.addCell(cilindro.getCilindro());
					  tablecilindro.addCell(cilindro.getValor());
					  tablecilindro.addCell(cilindro.getVacio());				  
				  }
				  //----------------------TOTAL PORCENTAJES---------------------------//
				 double suma =Double.parseDouble(revision.getId_vehiculo().getPorcentajedechasis())+
						 Double.parseDouble(revision.getId_vehiculo().getPorcentajeesctructura())+
						 Double.parseDouble(revision.getId_vehiculo().getPorcentajeestadointerior())+
						 Double.parseDouble(revision.getId_vehiculo().getPorcentajeestadoluces())+
						 Double.parseDouble(revision.getId_vehiculo().getPorcentajelatoneria())+
						 Double.parseDouble(revision.getId_vehiculo().getPorcentajevidrios());
				 double total= Math.round(suma/6);
				 
				 tableresumen.addCell(revision.getId_vehiculo().getPorcentajedechasis()+"%");
				 tableresumen.addCell(revision.getId_vehiculo().getPorcentajeesctructura()+"%");
				 tableresumen.addCell(revision.getId_vehiculo().getPorcentajeestadointerior()+"%");
				 tableresumen.addCell(revision.getId_vehiculo().getPorcentajeestadoluces()+"%");
				 tableresumen.addCell(revision.getId_vehiculo().getPorcentajelatoneria()+"%");
				 tableresumen.addCell(revision.getId_vehiculo().getPorcentajevidrios()+"%");
				 addRow (tableTotal,2, "Total ", String.valueOf(total+"%"));
				  //------------------DATOS MOTOR -----------------------//
				  
				  tableMotor.addCell(revision.getId_vehiculo().getId_motor().getAceitemotor());
				  tableMotor.addCell(revision.getId_vehiculo().getId_motor().getDireccionhidraulica());
				  tableMotor.addCell(revision.getId_vehiculo().getId_motor().getLavaparabrisas());
				  tableMotor2.addCell(revision.getId_vehiculo().getId_motor().getLiquidofrenos());
				  tableMotor2.addCell(revision.getId_vehiculo().getId_motor().getEmbrague());
				  tableMotor2.addCell(revision.getId_vehiculo().getId_motor().getRefigerante());
				  tableMotor2.setSpacingAfter(5);
				  tableobservacion.addCell(revision.getId_vehiculo().getId_motor().getObservaciones());
				  
				  tableObservaciontotal.addCell(revision.getObservaciones());
				  tabledictamen.addCell(revision.getDictamen());
				  //-----------------ESTRUCTURA------------------------------------//
				  celltitulos.setPhrase(new Phrase("Estructura vehículo", fonttitulos));
				    tituloEstructura.addCell(celltitulos);
				    tituloEstructura.setSpacingAfter(10);
				  addRow (tablevehiculo2,2, "Paral delantero derecho",revision.getId_vehiculo().getParaldelanteroderecho());
				  addRow (tablevehiculo2,2, "Paral delantero izquierdo",revision.getId_vehiculo().getParaldelanteroizquierdo());
				  addRow (tablevehiculo2,2, "Paral central derecho",revision.getId_vehiculo().getParalcentralderecho());
				  addRow (tablevehiculo2,2, "Paral central izquierdo",revision.getId_vehiculo().getParalcentralizquierdo());
				  addRow (tablevehiculo2,2, "Paral trasero derecho",revision.getId_vehiculo().getParaltraseroderecho());
				  addRow (tablevehiculo2,2, "Paral trasero izquierdo",revision.getId_vehiculo().getParaltraserpizquierdo());
				  addRow (tablevehiculo2,2, "Estribo izquierdo",revision.getId_vehiculo().getEstriboizquierdo());
				  addRow (tablevehiculo2,2, "Estribo derecho",revision.getId_vehiculo().getEstriboderecho());
				  addRow (tablevehiculo2,2, "G/polvo metálico derecho",revision.getId_vehiculo().getGpolvometalderecho());
				  addRow (tablevehiculo2,2, "G/polvo metálico izquierdo",revision.getId_vehiculo().getGpolvometalizq());				  
				  addRow (tablevehiculo2,2, "Engrafes costado izquierdo",revision.getId_vehiculo().getEngrafescostadoizquierdo());
				  addRow (tablevehiculo2,2, "Engrafes costado derecho",revision.getId_vehiculo().getEngrafescostadoderecho());
				  addRow (tablevehiculo2,2, "Capota",revision.getId_vehiculo().getCapota());
				  addRow (tablevehiculo2,2, "Piso baúl superior",revision.getId_vehiculo().getPisobaulsuperior());
				  addRow (tablevehiculo2,2, "Panel trasero",revision.getId_vehiculo().getPaneltrasero());
				  addRow (tablevehiculo2,2, "Piso baul",revision.getId_vehiculo().getPisobaul());
				  //----------------------LATONERIA--------------------------//
				  celltitulos.setPhrase(new Phrase("Latoneria vehículo", fonttitulos));
				    tituloLatoneria.addCell(celltitulos);
				    tituloLatoneria.setSpacingAfter(10);
				  addRow (tableLatoneria,2, "Guardafango izquierdo",revision.getId_vehiculo().getGuardafangoizq());
				  addRow (tableLatoneria,2, "Guardafango derecho",revision.getId_vehiculo().getGuardafangoderecho());
				  addRow (tableLatoneria,2, "Bomper trasero",revision.getId_vehiculo().getBompertrasero());				  
				  addRow (tableLatoneria,2, "Bomper delantero",revision.getId_vehiculo().getBomperdelantero());				  
				  addRow (tableLatoneria,2, "Retrovisor izquierdo",revision.getId_vehiculo().getRetrovisorizq());
				  addRow (tableLatoneria,2, "Retrovisor derecho",revision.getId_vehiculo().getRetrovisorder());
				  addRow (tableLatoneria,2, "Puerta delantera izquierda",revision.getId_vehiculo().getPuertadelanteraizq());				  
				  addRow (tableLatoneria,2, "Puerta delantera derecha",revision.getId_vehiculo().getPuertadelanteraderecha());
				  addRow (tableLatoneria,2, "Costado derecho",revision.getId_vehiculo().getCostadoderecho());
				  addRow (tableLatoneria,2, "Puerta trasera derecha",revision.getId_vehiculo().getPuertatraseraderecha());
				  addRow (tableLatoneria,2, "Persiana",revision.getId_vehiculo().getPersiana());
				  addRow (tableLatoneria,2, "Compuerta",revision.getId_vehiculo().getCompuerta());
				  addRow (tableLatoneria,2, "Puerta trasera izquierda",revision.getId_vehiculo().getPuertatraseraizq());
				  //-------------------------VIDRIO------------------------//
				  celltitulos.setPhrase(new Phrase("Vidrios vehículo", fonttitulos));
				    titulovidrio.addCell(celltitulos);
				    titulovidrio.setSpacingAfter(10);
				    addRow (tablevidrio,2, "Vidrio delantero derecho",revision.getId_vehiculo().getVidriopuertadelanterader());
				    addRow (tablevidrio,2, "Vidrio delantero izquierdo",revision.getId_vehiculo().getVidriopuertadelanteraizq());
				    addRow (tablevidrio,2, "Vidrio trasero izquierdo",revision.getId_vehiculo().getVidriopuertatraseraizq());
				    addRow (tablevidrio,2, "Vidrio trasero der.",revision.getId_vehiculo().getVidriopuertatraserader());
				    addRow (tablevidrio,2, "Panorámico delantero",revision.getId_vehiculo().getPanorámicodelantero());				    
				    addRow (tablevidrio,2, "Panorámico trasero",revision.getId_vehiculo().getPanoramicotrasero());
				    addRow (tablevidrio,2, "Sunroof",revision.getId_vehiculo().getSunroof());
				    addRow (tablevidrio,2, "Retrovisor interior",revision.getId_vehiculo().getRetrovisorinterior());
				    addRow (tablevidrio,2, "Luneta retrovisor derecho",revision.getId_vehiculo().getLunetaretrovisorderecho());
				    addRow (tablevidrio,2, "Luneta retrovisor izquierdo",revision.getId_vehiculo().getLunetaretrovisorizquierdo());
				   //--------------------CHASIS------------------//
				    celltitulos.setPhrase(new Phrase("Chasis vehículo", fonttitulos));
				    titulochasis.addCell(celltitulos);
				    titulochasis.setSpacingAfter(10);
				    addRow (tablechasis,2, "Extensión punta delantera",revision.getId_vehiculo().getExtensionpuntadelantera());
				    addRow (tablechasis,2, "Extensión punta trasera",revision.getId_vehiculo().getExtensionpuntatrasera());
				    addRow (tablechasis,2, "Base tijera izquierda",revision.getId_vehiculo().getBasetijeraizquierda());
				    addRow (tablechasis,2, "Barra estabilizadora",revision.getId_vehiculo().getBarraestabilizadora());
				    addRow (tablechasis,2, "Punta delantera izquierda",revision.getId_vehiculo().getPuntadelanteraizq());
				    addRow (tablechasis,2, "Traviesa delantera",revision.getId_vehiculo().getTraviesadelantera());
				    addRow (tablechasis,2, "Traviesa media",revision.getId_vehiculo().getTraviesamedia());
				    addRow (tablechasis,2, "Traviesa trasera",revision.getId_vehiculo().getTraviesatrasera());
				    addRow (tablechasis,2, "Frontal superior",revision.getId_vehiculo().getFrontalsuperior());
				    addRow (tablechasis,2, "Base tijera derecha",revision.getId_vehiculo().getBasetijeraderecha());
				    addRow (tablechasis,2, "Carter caja",revision.getId_vehiculo().getCartercaja());
				    addRow (tablechasis,2, "Carter motor",revision.getId_vehiculo().getCartercaja());
				    addRow (tablechasis,2, "Exosto",revision.getId_vehiculo().getExosto());
				    addRow (tablechasis,2, "Viga derecha",revision.getId_vehiculo().getVigaderecha());
				    addRow (tablechasis,2, "Viga izquierda",revision.getId_vehiculo().getVigaizq());
				    addRow (tablechasis,2, "Frontal inferior",revision.getId_vehiculo().getFrontalinferior());
				    addRow (tablechasis,2, "Punta delantera derecha",revision.getId_vehiculo().getPuntadelanteraderecha());
				    addRow (tablechasis,2, "Punta trasera izq.",revision.getId_vehiculo().getPuntatraseraizq());
				    addRow (tablechasis,2, "Punta trasera derecha",revision.getId_vehiculo().getPuntatraseraderecha());
				    addRow (tablechasis,2, "Panel",revision.getId_vehiculo().getPanel());
				    //------------------INTERIOR---------------------------//
				    celltitulos.setPhrase(new Phrase("Interior vehículo", fonttitulos));
				    titulointerior.addCell(celltitulos);
				    titulointerior.setSpacingAfter(10);
				    addRow (tableinterior,2, "Cojineria delantera izq.",revision.getId_vehiculo().getCojineriadelanteraizq());  
				    addRow (tableinterior,2, "Cojineria trasera",revision.getId_vehiculo().getCojineriatrasera());
				    addRow (tableinterior,2, "Parasol izq.",revision.getId_vehiculo().getParasolizquierdo());
				    addRow (tableinterior,2, "Parasol der.",revision.getId_vehiculo().getParasolderecho());
				    addRow (tableinterior,2, "Mando puerta delantera der.",revision.getId_vehiculo().getMandopuertadelanteradere());
				    addRow (tableinterior,2, "Mando puerta delantera izq.",revision.getId_vehiculo().getMandopuertadelanteraizqui());
				    addRow (tableinterior,2, "Mando puerta trasera der.",revision.getId_vehiculo().getMandopuertatraseradere());
				    addRow (tableinterior,2, "Mando puerta trasera izq.",revision.getId_vehiculo().getMandopuertatraseraizqui());
				    addRow (tableinterior,2, "Consola central",revision.getId_vehiculo().getConsolacentral());
				    addRow (tableinterior,2, "Cartera puerta delantera izq.",revision.getId_vehiculo().getCarterapuertadelanteraizq());
				    addRow (tableinterior,2, "Cartera puerta trasera der.",revision.getId_vehiculo().getCarterapuertatraserader());
				    addRow (tableinterior,2, "Cartera puerta trasera izq.",revision.getId_vehiculo().getCarterapuertatraseraizq());
				    addRow (tableinterior,2, "Cartera puerta delantera der.",revision.getId_vehiculo().getCarterapuertadelanterader());
				    addRow (tableinterior,2, "Tapicería piso",revision.getId_vehiculo().getTapiceriapiso());
				    addRow (tableinterior,2, "Tapetes y/o alfombras",revision.getId_vehiculo().getTapetesalfombras());
				    addRow (tableinterior,2, "Barra de cambios",revision.getId_vehiculo().getBarradecambio());
				    addRow (tableinterior,2, "Tablero",revision.getId_vehiculo().getTablero());
				    addRow (tableinterior,2, "Tapicería techo",revision.getId_vehiculo().getTapiceriatecho());
				    addRow (tableinterior,2, "Tablero instrumentos",revision.getId_vehiculo().getTableroInstrumentos());
				    addRow (tableinterior,2, "Cojineria delantera derecha",revision.getId_vehiculo().getCojineriaDelanteraDerecha());				    
				    addRow (tableinterior,2, "Timón",revision.getId_vehiculo().getTimon());
				    addRow (tableinterior,2, "Freno de mano",revision.getId_vehiculo().getFrenodemano());
				    addRow (tableinterior,2, "Guantera",revision.getId_vehiculo().getGuantera());
				    //-------------------------LUCES----------------------------------------//
				    
				    celltitulos.setPhrase(new Phrase("Luces vehículo", fonttitulos));
				    tituloluces.addCell(celltitulos);
				    tituloluces.setSpacingAfter(10);
				    addRow (tableluces,2, "Cocuyo lateral izquierdo",revision.getId_vehiculo().getCocuyolateralizquierdo());
				    addRow (tableluces,2, "Stop derecho",revision.getId_vehiculo().getStopderecho());
				    addRow (tableluces,2, "Luz Tablero",revision.getId_vehiculo().getLuzTablero());
				    addRow (tableluces,2, "Luz techo",revision.getId_vehiculo().getLuztecho());
				    addRow (tableluces,2, "Luz placa",revision.getId_vehiculo().getLuzplaca());
				    addRow (tableluces,2, "Luz direccional delantero der.",revision.getId_vehiculo().getLuzdireccionaldelanteroder());
				    addRow (tableluces,2, "Luz direccional delantero izq.",revision.getId_vehiculo().getLuzdireccionaldelanteroizq());
				    addRow (tableluces,2, "Farola izquierda",revision.getId_vehiculo().getFarolaizquierda());
				    addRow (tableluces,2, "Farola derecha",revision.getId_vehiculo().getFaroladerecha());
				    addRow (tableluces,2, "Radio",revision.getId_vehiculo().getRadio());
				    addRow (tableluces,2, "Luz direccional trasero der.",revision.getId_vehiculo().getLuzdireccionaltraseroder());
				    addRow (tableluces,2, "Luz direccional trasero izq.",revision.getId_vehiculo().getLuzdireccionaltraseroizq());
				    addRow (tableluces,2, "Pito",revision.getId_vehiculo().getPito());
				    addRow (tableluces,2, "Testigo",revision.getId_vehiculo().getTestigo());
				    addRow (tableluces,2, "Stop izquierdo",revision.getId_vehiculo().getStopizquierdo());
				    addRow (tableluces,2, "Cocuyo lateral derecho",revision.getId_vehiculo().getCocuyolateralderecho());
				    addRow (tableluces,2, "Exploradora izq.",revision.getId_vehiculo().getExploradoraizq());
				    addRow (tableluces,2, "Exploradora derecha",revision.getId_vehiculo().getExploradoraderecha());
				    addRow (tableluces,2, "Luz reversa derecha",revision.getId_vehiculo().getLuzreversaderecha());
				    addRow (tableluces,2, "Luz reversa izquierda",revision.getId_vehiculo().getLuzreversaizquierda());
				//-----------------------SUSPENSION Y LLANTAS---------------------//
				    celltitulos.setPhrase(new Phrase("Suspensión y llantas del  vehículo", fonttitulos));
				    titulosuspencion.addCell(celltitulos);
				    titulosuspencion.setSpacingAfter(10);
				    addRow (tablesuspencion,2, "Llanta delantera derecha",revision.getId_vehiculo().getLlantadelanteraderecha());
				    addRow (tablesuspencion,2, "Llanta delantera izquierda",revision.getId_vehiculo().getLlantadelanteraizquierda());
				    addRow (tablesuspencion,2, "Llanta trasera derecha",revision.getId_vehiculo().getLlantatraseraderecha());
				    addRow (tablesuspencion,2, "Llanta trasera izquierda",revision.getId_vehiculo().getLlantatraseraizquierda());				    
				    addRow (tablesuspencion,2, "Suspensión trasera izquierda",revision.getId_vehiculo().getSuspensiontraseraizquierda());
				    addRow (tablesuspencion,2, "Suspensión trasera derecha",revision.getId_vehiculo().getSuspensiontraseraderecha());
				    addRow (tablesuspencion,2, "Suspensión delantera izquierda",revision.getId_vehiculo().getSuspensiondelanteraizquierda());
				    addRow (tablesuspencion,2, "Suspensión delantera derecha",revision.getId_vehiculo().getSuspensiondelanteraderecha());
				
				    addRow (tableimprontas,2, "Chasis","   "
				    		+ "\n "
				    		+ "\n"
				    		+ "\n "
				    		+ "\n"
				    		+ "\n");
				    addRow (tableimprontas,2, "Serial","   "
				    		+ "\n "
				    		+ "\n"
				    		+ "\n "
				    		+ "\n"
				    		+ "\n");
				    addRow (tableimprontas,2, "Motor","   "
				    		+ "\n "
				    		+ "\n"
				    		+ "\n "
				    		+ "\n"
				    		+ "\n");
				    celltitulos.setPhrase(new Phrase("FIRMA USUARIO:   _______________________________________________", fonttitulos));
				    firma.setSpacingBefore(100);
				    firma.addCell(celltitulos);
				    
		    }
		    		    
		    // Adding the created table to the document
		    
		    document.add(icon);
		    document.add(paragraph1);
		    document.add(titulovehiculo);
		    document.add(tablevehiculo);		    		    
		    document.add(titulocliente);
		    document.add(tablecliente);
		    document.add(titulopropie);
		    document.add(tablepropietario);
		    document.add(tituloresumen);
		    document.add(tableresumen);
		    document.add(tableTotal);
		    document.add(tituloperdida);
		    document.add(tableperdida);
		    document.add(titulocilin);
		    document.add(tablecilindro);
		    document.add(titulomotor);
		    document.add(tableMotor);
		    document.add(tableMotor2);
		    document.add(tableobservacion);
		    document.add(tituloEstructura);
		    document.add(tablevehiculo2);
		    document.add(tituloLatoneria);
		    document.add(tableLatoneria);
		    document.add(titulovidrio);
		    document.add(tablevidrio);
		    document.add(titulochasis);
		    document.add(tablechasis);		
		    document.add(titulointerior);
		    document.add(tableinterior);
		    document.add(tituloluces);
		    document.add(tableluces);
		    document.add(titulosuspencion);
		    document.add(tablesuspencion);
		    document.add(tituloftos);
		    document.add(tableFotos);
		    document.add(tableFotos2);
		    document.add(tableimprontas);
		    document.add(tableObservaciontotal);
		    document.add(tabledictamen);
		    document.add(firma);
		    
		    addfooter(writer);
		    // Closing the document
		    document.close();				
		
	}
	
	
public static void addRow(PdfPTable table,int columns,String title,String value) {
	    // Creates another row that only have to columns.
	    // The cell 5 and cell 6 width will span two columns
	    // in width.
	    RGBColor color = new RGBColor(242, 68, 68); // or red, green, blue, alpha
	    RGBColor colorLETRA = new RGBColor(254,254,254,255);
	    Font boldFont = new Font(Font.HELVETICA , 10, Font.BOLD);
	    boldFont.setColor(colorLETRA);
	    Font normalFont = new Font(Font.HELVETICA , 11, Font.NORMAL);
	    PdfPCell cell1 = new PdfPCell(new Phrase(title,boldFont));
	    cell1.setColspan(1);
	    cell1.setPadding(5);
	    
	    cell1.setBackgroundColor(color);//240
	    cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    table.addCell(cell1);
	    if(columns>1) {
	        PdfPCell cell2 = new PdfPCell(new Phrase(value,normalFont));
	        cell1.setBackgroundColor(color);
	        cell2.setColspan(2);
	        cell2.setPadding(5);
	        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        table.addCell(cell2);

	    }
	    table.completeRow();
	}





public static void addfooter(PdfWriter writer) {
	PdfPTable footer = new PdfPTable(3);
	
	try {
		
		 // set defaults
        footer.setWidths(new int[]{24, 2, 1});
        footer.setTotalWidth(527);
        footer.setLockedWidth(true);
        footer.getDefaultCell().setFixedHeight(40);
        footer.getDefaultCell().setBorder(Rectangle.TOP);
        footer.getDefaultCell().setBorderColor(Color.LIGHT_GRAY);
     // add copyright
        footer.addCell(new Phrase("\u00A9 Memorynotfound.com", new Font(Font.HELVETICA, 12, Font.BOLD)));

        // add current page count
        footer.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
        footer.addCell(new Phrase(String.format("Page %d of", writer.getPageNumber()), new Font(Font.HELVETICA, 8)));

        // add placeholder for total page count
        PdfPCell totalPageCount = new PdfPCell();
        totalPageCount.setBorder(Rectangle.TOP);
        totalPageCount.setBorderColor(Color.LIGHT_GRAY);
        footer.addCell(totalPageCount);

        // write page
        PdfContentByte canvas = writer.getDirectContent();
        canvas.beginMarkedContentSequence(PdfName.ARTIFACT);
        footer.writeSelectedRows(0, -1, 34, 50, canvas);
        canvas.endMarkedContentSequence();
		
		
	} catch (Exception e) {
		 throw new ExceptionConverter(e);
	}
	
	
}


}

