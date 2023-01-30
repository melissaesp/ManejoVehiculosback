package co.com.ManejoVehiculos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the vehiculo database table.
 * 
 */
@Entity
@Table(name="vehiculo")
@NamedQuery(name="vehiculo.findAll", query="SELECT r FROM vehiculo r")
public class vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;
//--------registro vehiculo------------------//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;
	
	@Column(name="Placa",length=150)
	private String Placa;
	
	@OneToOne
	@JoinColumn(name="id_motor", nullable=true)
	private motor id_motor;
	
	@Column(name="fecha_creacion")
	private java.util.Date createdDate;
	
	@ManyToOne
	@JoinColumn(name="id_cliente", nullable=true)
	private Cliente id_cliente;

	
	@Column( nullable=true, length=150)
	private String Clase;
	@Column( nullable=true, length=150)
	private String Marca;
	@Column( nullable=true, length=150)
	private String Tipo;
	@Column( nullable=true, length=150)
	private String Carroceria;
	@Column( nullable=true, length=150)
	private String Modelo;
	@Column( nullable=true, length=150)
	private String Nacionalidad;
	@Column( nullable=true, length=100)
	private String Tipodecaja;
	@Column( nullable=true, length=100)
	private String Cilindraje;
	@Column( nullable=true, length=100)
	private String Combustible;
	@Column( nullable=true, length=100)
	private String Tipodepintura;
	@Column( nullable=true, length=100)
	private String Servicio;
	@Column( nullable=true, length=100)
	private String Kilometraje;
	@Column( nullable=true, length=100)
	private String Color;
	@Column( nullable=true, length=100)
	private String Nrochasis;
	@Column( nullable=true, length=100)
	private String Nroserial;
	@Column( nullable=true, length=100)
	private String Nromotor;
	@Column( nullable=true)
	private String Trasmision;
	@Column( nullable=true, length=100)
	private String Traccion;
	@Column( nullable=true, length=100)
	private String Version;
	
	@Lob
	@Column(nullable=true)
	private String SOAT;
	@Lob
	@Column(nullable=true)
	private String Tarjetadepropiedad;
	@Lob
	@Column(nullable=true)
	private String Fotofrente;
	@Lob
	@Column(nullable=true)
	private String Fototrasera;
	@Lob
	@Column(nullable=true)
	private String Fotoconsola;
	@Lob
	@Column(nullable=true)
	private String Fotolateralder;
	
	@Lob
	@Column(nullable=true)
	private String Fotolateralizq;
	
	//-------------------Estructura vehiculo---------//
	@Column( nullable=true, length=150)
	private String Paraldelanteroizquierdo;
	@Column( nullable=true, length=150)
	private String paraldelanteroderecho;
	
	@Column( nullable=true, length=150)
	private String Paralcentralderecho;
	
	@Column( nullable=true, length=150)
	private String Paralcentralizquierdo;
	@Column( nullable=true, length=150)
	private String Paraltraseroderecho;
	
	@Column( nullable=true, length=150)
	private String Paraltraserpizquierdo;
	
	@Column( nullable=true, length=150)
	private String Estriboizquierdo;
	
	@Column( nullable=true, length=150)
	private String Capota;
	
	@Column( nullable=true, length=150)
	private String Estriboderecho;
	
	@Column( nullable=true, length=150)
	private String Pisobaulsuperior;
	
	@Column( nullable=true, length=150)
	private String Gpolvometalizq;
	@Column( nullable=true, length=150)
	private String Gpolvometalderecho;
	@Column( nullable=true, length=150)
	private String Engrafescostadoizquierdo;
	@Column( nullable=true, length=150)
	private String Engrafescostadoderecho;
	@Column( nullable=true, length=150)
	private String Paneltrasero;
	@Column( nullable=true, length=150)
	private String Pisobaul;
	@Column( nullable=true, length=150)
	private String Porcentajeesctructura;
	
	
	
	//-------------------latoneria--------------//
	
	
	@Column( nullable=true, length=150)
	private String Guardafangoizq;
	@Column( nullable=true, length=150)
	private String Guardafangoderecho;
	@Column( nullable=true, length=150)
	private String Bompertrasero;
	@Column( nullable=true, length=150)
	private String Bomperdelantero;
	@Column( nullable=true, length=150)
	private String Compuerta;
	@Column( nullable=true, length=150)
	private String Retrovisorizq;
	@Column( nullable=true, length=150)
	private String Retrovisorder;
	@Column( nullable=true, length=150)
	private String Puertadelanteraizq;
	@Column( nullable=true, length=150)
	private String Puertatraseraizq;
	@Column( nullable=true, length=150)
	private String Puertatraseraderecha;
	@Column( nullable=true, length=150)
	private String Puertadelanteraderecha;
	@Column( nullable=true, length=150)
	private String Persiana;
	@Column( nullable=true, length=150)
	private String Costadoderecho;
	@Column( nullable=true, length=150)
	private String Porcentajelatoneria;
	
	
	//----------vidrio---------------------------//
	
	
	@Column( nullable=true, length=150)
	private String Sunroof;
	@Column( nullable=true)
	private String Vidriodelanteroizquierdo;
	@Column( nullable=true)
	private String Vidriodelanteroderecho;
	@Column( nullable=true)
	private String Vidriotraseroizquierdo;
	@Column( nullable=true)
	private String  Vidriotraseroderecho;
	@Column( nullable=true)
	private String Lunetaretrovisorizquierdo;
	@Column( nullable=true)
	private String Vidriopuertadelanteraizq;
	@Column( nullable=true)
	private String Panoramicotrasero;
	@Column( nullable=true)
	private String Vidriopuertadelanterader;
	@Column( nullable=true)
	private String  Vidriopuertatraserader;
	@Column( nullable=true)
	private String Lunetaretrovisorderecho;
	@Column( nullable=true)
	private String   Retrovisorinterior;
	@Column( nullable=true)
	private String   Panorámicodelantero;
	@Column( nullable=true)
	private String   Vidriopuertatraseraizq;
	@Column( nullable=true)
	private String Porcentajevidrios;
	
	//---------------chasis---------------//
	
	
	@Column( nullable=true, length=150)
	private String Basetijeraderecha;
	@Column( nullable=true, length=150)
	private String  Basetijeraizquierda;
	@Column( nullable=true, length=150)
	private String Extensionpuntadelantera;
	@Column( nullable=true, length=150)
	private String  Extensionpuntatrasera;
	@Column( nullable=true, length=150)
	private String Barraestabilizadora;
	@Column( nullable=true, length=150)
	private String  Puntadelanteraizq;
	@Column( nullable=true, length=150)
	private String Cartercaja;
	@Column( nullable=true, length=150)
	private String  Cartermotor;
	@Column( nullable=true, length=150)
	private String   Exosto;
	@Column( nullable=true, length=150)
	private String Puntadelanteraderecha;
	@Column( nullable=true, length=150)
	private String   Puntatraseraderecha;
	@Column( nullable=true, length=150)
	private String   Tanquedecombustible;
	@Column( nullable=true, length=150)
	private String  Traviesadelantera;
	@Column( nullable=true, length=150)
	private String  Puntatraseraizq;
	@Column( nullable=true, length=150)
	private String   Traviesamedia;
	@Column( nullable=true, length=150)
	private String   Traviesatrasera;
	@Column( nullable=true, length=150)
	private String  Frontalsuperior;
	@Column( nullable=true, length=150)
	private String  Vigaderecha;
	@Column( nullable=true, length=150)
	private String  Vigaizq;
	@Column( nullable=true, length=150)
	private String  Frontalinferior;
	@Column( nullable=true, length=150)
	private String  Panel;
	@Column( nullable=true, length=150)
	private String  Porcentajedechasis;
	
	//--------------interior------------------------//
	
	@Column( nullable=true, length=150)
	private String Carterapuertadelanteraizq;
	@Column( nullable=true, length=150)
	private String Carterapuertatraserader;
	@Column( nullable=true, length=150)
	private String Cojineriadelanteraizq;
	@Column( nullable=true, length=150)
	private String Cojineriatrasera;
	@Column( nullable=true, length=150)
	private String  Consolacentral;
	@Column( nullable=true, length=150)
	private String  Carterapuertatraseraizq;
	@Column( nullable=true, length=150)
	private String Carterapuertadelanterader;
	@Column( nullable=true)
	private String Tapiceriapiso;
	@Column( nullable=true, length=150)
	private String Tapetesalfombras;
	@Column( nullable=true, length=150)
	private String  CojineriaDelanteraDerecha;	
	@Column( nullable=true, length=150)
	private String Parasolizquierdo;
	@Column( nullable=true, length=150)
	private String Parasolderecho;
	@Column( nullable=true, length=150)
	private String  Barradecambio;
	@Column( nullable=true, length=150)
	private String Timon;
	@Column( nullable=true, length=150)
	private String Tablero;
	@Column( nullable=true, length=150)
	private String Frenodemano;
	@Column( nullable=true, length=150)
	private String Guantera;
	@Column( nullable=true, length=150)
	private String  Mandopuertadelanteraizqui;
	@Column( nullable=true, length=150)
	private String Mandopuertadelanteradere;
	@Column( nullable=true, length=150)
	private String Mandopuertatraseradere;
	@Column( nullable=true, length=150)
	private String  Mandopuertatraseraizqui;
	@Column( nullable=true, length=150)
	private String Tapiceriatecho;
	@Column(name="tablero_instrumentos",nullable=true)
	private String TableroInstrumentos;
	@Column( nullable=true, length=150)
	private String Porcentajeestadointerior;
	
	//-------------luces---------------//
	
	
	@Column( nullable=true, length=150)
	private String Luzdireccionaldelanteroder;
	@Column( nullable=true, length=150)
	private String Luzdireccionaldelanteroizq;
	@Column( nullable=true, length=150)
	private String  Luzdireccionaltraseroder;
	@Column( nullable=true, length=150)
	private String Luzdireccionaltraseroizq;
	@Column( nullable=true, length=150)
	private String  Pito;
	@Column( nullable=true, length=150)
	private String  Luzreversaderecha;
	@Column( nullable=true, length=150)
	private String Luzreversaizquierda;
	@Column( nullable=true, length=150)
	private String Cocuyolateralizquierdo;
	@Column( nullable=true, length=150)
	private String Stopderecho;
	@Column( nullable=true, length=150)
	private String LuzTablero;
	@Column( nullable=true, length=150)
	private String Luztecho;
	@Column( nullable=true, length=150)
	private String Farolaizquierda;
	@Column( nullable=true, length=150)
	private String Faroladerecha;
	@Column( nullable=true, length=150)
	private String Radio;
	@Column( nullable=true, length=150)
	private String testigo;
	@Column( nullable=true, length=150)
	private String Stopizquierdo;
	@Column( nullable=true, length=150)
	private String Cocuyolateralderecho;
	@Column( nullable=true, length=150)
	private String Exploradoraizq;
	@Column( nullable=true, length=150)
	private String Exploradoraderecha;
	@Column( nullable=true, length=150)
	private String  Luzplaca;
	@Column( nullable=true, length=150)
	private String Porcentajeestadoluces;
	
	//----------------llantas-------------//
	@Column( nullable=true, length=150)
	private String Llantadelanteraderecha;
	@Column( nullable=true, length=150)
	private String  Llantadelanteraizquierda;
	@Column( nullable=true, length=150)
	private String  Llantatraseraderecha;
	@Column( nullable=true, length=150)
	private String Llantatraseraizquierda;
	@Column( nullable=true, length=150)
	private String Suspensiondelanteraizquierda;
	@Column( nullable=true, length=150)
	private String Suspensiondelanteraderecha;
	@Column( nullable=true, length=150)
	private String Suspensiontraseraizquierda;
	@Column( nullable=true, length=150)
	private String  Suspensiontraseraderecha;
	@Column( nullable=true)
	private String  Observaciones;
	

	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	public String getTestigo() {
		return testigo;
	}
	public void setTestigo(String testigo) {
		this.testigo = testigo;
	}
	public String getParaldelanteroderecho() {
		return paraldelanteroderecho;
	}
	public void setParaldelanteroderecho(String paraldelanteroderecho) {
		this.paraldelanteroderecho = paraldelanteroderecho;
	}
	public java.util.Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}
	public Cliente getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	
	public motor getId_motor() {
		return id_motor;
	}
	public void setId_motor(motor id_motor) {
		this.id_motor = id_motor;
	}
	public String getClase() {
		return Clase;
	}
	public void setClase(String clase) {
		Clase = clase;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getCarroceria() {
		return Carroceria;
	}
	public void setCarroceria(String carroceria) {
		Carroceria = carroceria;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getTipodecaja() {
		return Tipodecaja;
	}
	public void setTipodecaja(String tipodecaja) {
		Tipodecaja = tipodecaja;
	}
	public String getCilindraje() {
		return Cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		Cilindraje = cilindraje;
	}
	public String getCombustible() {
		return Combustible;
	}
	public void setCombustible(String combustible) {
		Combustible = combustible;
	}
	public String getTipodepintura() {
		return Tipodepintura;
	}
	public void setTipodepintura(String tipodepintura) {
		Tipodepintura = tipodepintura;
	}
	public String getServicio() {
		return Servicio;
	}
	public void setServicio(String servicio) {
		Servicio = servicio;
	}
	public String getKilometraje() {
		return Kilometraje;
	}
	public void setKilometraje(String kilometraje) {
		Kilometraje = kilometraje;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getNrochasis() {
		return Nrochasis;
	}
	public void setNrochasis(String nrochasis) {
		Nrochasis = nrochasis;
	}
	public String getNroserial() {
		return Nroserial;
	}
	public void setNroserial(String nroserial) {
		Nroserial = nroserial;
	}
	public String getNromotor() {
		return Nromotor;
	}
	public void setNromotor(String nromotor) {
		Nromotor = nromotor;
	}
	public String getTrasmision() {
		return Trasmision;
	}
	public void setTrasmision(String trasmision) {
		Trasmision = trasmision;
	}
	public String getTraccion() {
		return Traccion;
	}
	public void setTraccion(String traccion) {
		Traccion = traccion;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public String getSOAT() {
		return SOAT;
	}
	public void setSOAT(String sOAT) {
		SOAT = sOAT;
	}
	public String getTarjetadepropiedad() {
		return Tarjetadepropiedad;
	}
	public void setTarjetadepropiedad(String tarjetadepropiedad) {
		Tarjetadepropiedad = tarjetadepropiedad;
	}
	public String getFotofrente() {
		return Fotofrente;
	}
	public void setFotofrente(String fotofrente) {
		Fotofrente = fotofrente;
	}
	public String getFototrasera() {
		return Fototrasera;
	}
	public void setFototrasera(String fototrasera) {
		Fototrasera = fototrasera;
	}
	public String getFotoconsola() {
		return Fotoconsola;
	}
	public void setFotoconsola(String fotoconsola) {
		Fotoconsola = fotoconsola;
	}
	public String getFotolateralder() {
		return Fotolateralder;
	}
	public void setFotolateralder(String fotolateralder) {
		Fotolateralder = fotolateralder;
	}
	public String getFotolateralizq() {
		return Fotolateralizq;
	}
	public void setFotolateralizq(String fotolateralizq) {
		Fotolateralizq = fotolateralizq;
	}
	public String getParaldelanteroizquierdo() {
		return Paraldelanteroizquierdo;
	}
	public void setParaldelanteroizquierdo(String paraldelanteroizquierdo) {
		Paraldelanteroizquierdo = paraldelanteroizquierdo;
	}
	public String getParalcentralderecho() {
		return Paralcentralderecho;
	}
	public void setParalcentralderecho(String paralcentralderecho) {
		Paralcentralderecho = paralcentralderecho;
	}
	public String getParalcentralizquierdo() {
		return Paralcentralizquierdo;
	}
	public void setParalcentralizquierdo(String paralcentralizquierdo) {
		Paralcentralizquierdo = paralcentralizquierdo;
	}
	public String getParaltraseroderecho() {
		return Paraltraseroderecho;
	}
	public void setParaltraseroderecho(String paraltraseroderecho) {
		Paraltraseroderecho = paraltraseroderecho;
	}
	public String getParaltraserpizquierdo() {
		return Paraltraserpizquierdo;
	}
	public void setParaltraserpizquierdo(String paraltraserpizquierdo) {
		Paraltraserpizquierdo = paraltraserpizquierdo;
	}
	public String getEstriboizquierdo() {
		return Estriboizquierdo;
	}
	public void setEstriboizquierdo(String estriboizquierdo) {
		Estriboizquierdo = estriboizquierdo;
	}
	public String getCapota() {
		return Capota;
	}
	public void setCapota(String capota) {
		Capota = capota;
	}
	public String getEstriboderecho() {
		return Estriboderecho;
	}
	public void setEstriboderecho(String estriboderecho) {
		Estriboderecho = estriboderecho;
	}
	
	public String getPisobaulsuperior() {
		return Pisobaulsuperior;
	}
	public void setPisobaulsuperior(String pisobaulsuperior) {
		Pisobaulsuperior = pisobaulsuperior;
	}
	public String getGpolvometalizq() {
		return Gpolvometalizq;
	}
	public void setGpolvometalizq(String gpolvometalizq) {
		Gpolvometalizq = gpolvometalizq;
	}
	public String getGpolvometalderecho() {
		return Gpolvometalderecho;
	}
	public void setGpolvometalderecho(String gpolvometalderecho) {
		Gpolvometalderecho = gpolvometalderecho;
	}
	public String getEngrafescostadoizquierdo() {
		return Engrafescostadoizquierdo;
	}
	public void setEngrafescostadoizquierdo(String engrafescostadoizquierdo) {
		Engrafescostadoizquierdo = engrafescostadoizquierdo;
	}
	public String getEngrafescostadoderecho() {
		return Engrafescostadoderecho;
	}
	public void setEngrafescostadoderecho(String engrafescostadoderecho) {
		Engrafescostadoderecho = engrafescostadoderecho;
	}
	public String getPaneltrasero() {
		return Paneltrasero;
	}
	public void setPaneltrasero(String paneltrasero) {
		Paneltrasero = paneltrasero;
	}
	public String getPisobaul() {
		return Pisobaul;
	}
	public void setPisobaul(String pisobaul) {
		Pisobaul = pisobaul;
	}
	public String getPorcentajeesctructura() {
		return Porcentajeesctructura;
	}
	public void setPorcentajeesctructura(String porcentajeesctructura) {
		Porcentajeesctructura = porcentajeesctructura;
	}
	public String getGuardafangoizq() {
		return Guardafangoizq;
	}
	public void setGuardafangoizq(String guardafangoizq) {
		Guardafangoizq = guardafangoizq;
	}
	public String getGuardafangoderecho() {
		return Guardafangoderecho;
	}
	public void setGuardafangoderecho(String guardafangoderecho) {
		Guardafangoderecho = guardafangoderecho;
	}
	public String getBompertrasero() {
		return Bompertrasero;
	}
	public void setBompertrasero(String bompertrasero) {
		Bompertrasero = bompertrasero;
	}
	public String getBomperdelantero() {
		return Bomperdelantero;
	}
	public void setBomperdelantero(String bomperdelantero) {
		Bomperdelantero = bomperdelantero;
	}
	public String getCompuerta() {
		return Compuerta;
	}
	public void setCompuerta(String compuerta) {
		Compuerta = compuerta;
	}
	public String getRetrovisorizq() {
		return Retrovisorizq;
	}
	public void setRetrovisorizq(String retrovisorizq) {
		Retrovisorizq = retrovisorizq;
	}
	public String getRetrovisorder() {
		return Retrovisorder;
	}
	public void setRetrovisorder(String retrovisorder) {
		Retrovisorder = retrovisorder;
	}
	public String getPuertadelanteraizq() {
		return Puertadelanteraizq;
	}
	public void setPuertadelanteraizq(String puertadelanteraizq) {
		Puertadelanteraizq = puertadelanteraizq;
	}
	public String getPuertatraseraizq() {
		return Puertatraseraizq;
	}
	public void setPuertatraseraizq(String puertatraseraizq) {
		Puertatraseraizq = puertatraseraizq;
	}
	public String getPuertatraseraderecha() {
		return Puertatraseraderecha;
	}
	public void setPuertatraseraderecha(String puertatraseraderecha) {
		Puertatraseraderecha = puertatraseraderecha;
	}
	public String getPuertadelanteraderecha() {
		return Puertadelanteraderecha;
	}
	public void setPuertadelanteraderecha(String puertadelanteraderecha) {
		Puertadelanteraderecha = puertadelanteraderecha;
	}
	public String getPersiana() {
		return Persiana;
	}
	public void setPersiana(String persiana) {
		Persiana = persiana;
	}
	public String getCostadoderecho() {
		return Costadoderecho;
	}
	public void setCostadoderecho(String costadoderecho) {
		Costadoderecho = costadoderecho;
	}
	public String getPorcentajelatoneria() {
		return Porcentajelatoneria;
	}
	public void setPorcentajelatoneria(String porcentajelatoneria) {
		Porcentajelatoneria = porcentajelatoneria;
	}
	public String getSunroof() {
		return Sunroof;
	}
	public void setSunroof(String sunroof) {
		Sunroof = sunroof;
	}
	public String getVidriodelanteroizquierdo() {
		return Vidriodelanteroizquierdo;
	}
	public void setVidriodelanteroizquierdo(String vidriodelanteroizquierdo) {
		Vidriodelanteroizquierdo = vidriodelanteroizquierdo;
	}
	public String getVidriodelanteroderecho() {
		return Vidriodelanteroderecho;
	}
	public void setVidriodelanteroderecho(String vidriodelanteroderecho) {
		Vidriodelanteroderecho = vidriodelanteroderecho;
	}
	public String getVidriotraseroizquierdo() {
		return Vidriotraseroizquierdo;
	}
	public void setVidriotraseroizquierdo(String vidriotraseroizquierdo) {
		Vidriotraseroizquierdo = vidriotraseroizquierdo;
	}
	public String getVidriotraseroderecho() {
		return Vidriotraseroderecho;
	}
	public void setVidriotraseroderecho(String vidriotraseroderecho) {
		Vidriotraseroderecho = vidriotraseroderecho;
	}
	public String getLunetaretrovisorizquierdo() {
		return Lunetaretrovisorizquierdo;
	}
	public void setLunetaretrovisorizquierdo(String lunetaretrovisorizquierdo) {
		Lunetaretrovisorizquierdo = lunetaretrovisorizquierdo;
	}
	public String getVidriopuertadelanteraizq() {
		return Vidriopuertadelanteraizq;
	}
	public void setVidriopuertadelanteraizq(String vidriopuertadelanteraizq) {
		Vidriopuertadelanteraizq = vidriopuertadelanteraizq;
	}
	public String getPanoramicotrasero() {
		return Panoramicotrasero;
	}
	public void setPanoramicotrasero(String panoramicotrasero) {
		Panoramicotrasero = panoramicotrasero;
	}
	public String getVidriopuertadelanterader() {
		return Vidriopuertadelanterader;
	}
	public void setVidriopuertadelanterader(String vidriopuertadelanterader) {
		Vidriopuertadelanterader = vidriopuertadelanterader;
	}
	public String getVidriopuertatraserader() {
		return Vidriopuertatraserader;
	}
	public void setVidriopuertatraserader(String vidriopuertatraserader) {
		Vidriopuertatraserader = vidriopuertatraserader;
	}
	public String getLunetaretrovisorderecho() {
		return Lunetaretrovisorderecho;
	}
	public void setLunetaretrovisorderecho(String lunetaretrovisorderecho) {
		Lunetaretrovisorderecho = lunetaretrovisorderecho;
	}
	public String getRetrovisorinterior() {
		return Retrovisorinterior;
	}
	public void setRetrovisorinterior(String retrovisorinterior) {
		Retrovisorinterior = retrovisorinterior;
	}
	public String getPanorámicodelantero() {
		return Panorámicodelantero;
	}
	public void setPanorámicodelantero(String panorámicodelantero) {
		Panorámicodelantero = panorámicodelantero;
	}
	public String getVidriopuertatraseraizq() {
		return Vidriopuertatraseraizq;
	}
	public void setVidriopuertatraseraizq(String vidriopuertatraseraizq) {
		Vidriopuertatraseraizq = vidriopuertatraseraizq;
	}
	public String getPorcentajevidrios() {
		return Porcentajevidrios;
	}
	public void setPorcentajevidrios(String porcentajevidrios) {
		Porcentajevidrios = porcentajevidrios;
	}
	public String getBasetijeraderecha() {
		return Basetijeraderecha;
	}
	public void setBasetijeraderecha(String basetijeraderecha) {
		Basetijeraderecha = basetijeraderecha;
	}
	public String getBasetijeraizquierda() {
		return Basetijeraizquierda;
	}
	public void setBasetijeraizquierda(String basetijeraizquierda) {
		Basetijeraizquierda = basetijeraizquierda;
	}
	public String getExtensionpuntadelantera() {
		return Extensionpuntadelantera;
	}
	public void setExtensionpuntadelantera(String extensionpuntadelantera) {
		Extensionpuntadelantera = extensionpuntadelantera;
	}
	public String getExtensionpuntatrasera() {
		return Extensionpuntatrasera;
	}
	public void setExtensionpuntatrasera(String extensionpuntatrasera) {
		Extensionpuntatrasera = extensionpuntatrasera;
	}
	public String getBarraestabilizadora() {
		return Barraestabilizadora;
	}
	public void setBarraestabilizadora(String barraestabilizadora) {
		Barraestabilizadora = barraestabilizadora;
	}
	public String getPuntadelanteraizq() {
		return Puntadelanteraizq;
	}
	public void setPuntadelanteraizq(String puntadelanteraizq) {
		Puntadelanteraizq = puntadelanteraizq;
	}
	public String getCartercaja() {
		return Cartercaja;
	}
	public void setCartercaja(String cartercaja) {
		Cartercaja = cartercaja;
	}
	public String getCartermotor() {
		return Cartermotor;
	}
	public void setCartermotor(String cartermotor) {
		Cartermotor = cartermotor;
	}
	public String getExosto() {
		return Exosto;
	}
	public void setExosto(String exosto) {
		Exosto = exosto;
	}
	public String getPuntadelanteraderecha() {
		return Puntadelanteraderecha;
	}
	public void setPuntadelanteraderecha(String puntadelanteraderecha) {
		Puntadelanteraderecha = puntadelanteraderecha;
	}
	public String getPuntatraseraderecha() {
		return Puntatraseraderecha;
	}
	public void setPuntatraseraderecha(String puntatraseraderecha) {
		Puntatraseraderecha = puntatraseraderecha;
	}
	public String getTanquedecombustible() {
		return Tanquedecombustible;
	}
	public void setTanquedecombustible(String tanquedecombustible) {
		Tanquedecombustible = tanquedecombustible;
	}
	public String getTraviesadelantera() {
		return Traviesadelantera;
	}
	public void setTraviesadelantera(String traviesadelantera) {
		Traviesadelantera = traviesadelantera;
	}
	public String getPuntatraseraizq() {
		return Puntatraseraizq;
	}
	public void setPuntatraseraizq(String puntatraseraizq) {
		Puntatraseraizq = puntatraseraizq;
	}
	public String getTraviesamedia() {
		return Traviesamedia;
	}
	public void setTraviesamedia(String traviesamedia) {
		Traviesamedia = traviesamedia;
	}
	public String getTraviesatrasera() {
		return Traviesatrasera;
	}
	public void setTraviesatrasera(String traviesatrasera) {
		Traviesatrasera = traviesatrasera;
	}
	public String getFrontalsuperior() {
		return Frontalsuperior;
	}
	public void setFrontalsuperior(String frontalsuperior) {
		Frontalsuperior = frontalsuperior;
	}
	public String getVigaderecha() {
		return Vigaderecha;
	}
	public void setVigaderecha(String vigaderecha) {
		Vigaderecha = vigaderecha;
	}
	public String getVigaizq() {
		return Vigaizq;
	}
	public void setVigaizq(String vigaizq) {
		Vigaizq = vigaizq;
	}
	public String getFrontalinferior() {
		return Frontalinferior;
	}
	public void setFrontalinferior(String frontalinferior) {
		Frontalinferior = frontalinferior;
	}
	public String getPanel() {
		return Panel;
	}
	public void setPanel(String panel) {
		Panel = panel;
	}
	public String getPorcentajedechasis() {
		return Porcentajedechasis;
	}
	public void setPorcentajedechasis(String porcentajedechasis) {
		Porcentajedechasis = porcentajedechasis;
	}
	public String getCarterapuertadelanteraizq() {
		return Carterapuertadelanteraizq;
	}
	public void setCarterapuertadelanteraizq(String carterapuertadelanteraizq) {
		Carterapuertadelanteraizq = carterapuertadelanteraizq;
	}
	public String getCarterapuertatraserader() {
		return Carterapuertatraserader;
	}
	public void setCarterapuertatraserader(String carterapuertatraserader) {
		Carterapuertatraserader = carterapuertatraserader;
	}
	public String getCojineriadelanteraizq() {
		return Cojineriadelanteraizq;
	}
	public void setCojineriadelanteraizq(String cojineriadelanteraizq) {
		Cojineriadelanteraizq = cojineriadelanteraizq;
	}
	public String getCojineriatrasera() {
		return Cojineriatrasera;
	}
	public void setCojineriatrasera(String cojineriatrasera) {
		Cojineriatrasera = cojineriatrasera;
	}
	public String getConsolacentral() {
		return Consolacentral;
	}
	public void setConsolacentral(String consolacentral) {
		Consolacentral = consolacentral;
	}
	public String getCarterapuertatraseraizq() {
		return Carterapuertatraseraizq;
	}
	public void setCarterapuertatraseraizq(String carterapuertatraseraizq) {
		Carterapuertatraseraizq = carterapuertatraseraizq;
	}
	public String getCarterapuertadelanterader() {
		return Carterapuertadelanterader;
	}
	public void setCarterapuertadelanterader(String carterapuertadelanterader) {
		Carterapuertadelanterader = carterapuertadelanterader;
	}
	public String getTapiceriapiso() {
		return Tapiceriapiso;
	}
	public void setTapiceriapiso(String tapiceriapiso) {
		Tapiceriapiso = tapiceriapiso;
	}
	public String getTapetesalfombras() {
		return Tapetesalfombras;
	}
	public void setTapetesalfombras(String tapetesalfombras) {
		Tapetesalfombras = tapetesalfombras;
	}
	public String getCojineriaDelanteraDerecha() {
		return CojineriaDelanteraDerecha;
	}
	public void setCojineriaDelanteraDerecha(String cojineriaDelanteraDerecha) {
		CojineriaDelanteraDerecha = cojineriaDelanteraDerecha;
	}
	public String getParasolizquierdo() {
		return Parasolizquierdo;
	}
	public void setParasolizquierdo(String parasolizquierdo) {
		Parasolizquierdo = parasolizquierdo;
	}
	public String getParasolderecho() {
		return Parasolderecho;
	}
	public void setParasolderecho(String parasolderecho) {
		Parasolderecho = parasolderecho;
	}
	public String getBarradecambio() {
		return Barradecambio;
	}
	public void setBarradecambio(String barradecambio) {
		Barradecambio = barradecambio;
	}
	public String getTimon() {
		return Timon;
	}
	public void setTimon(String timon) {
		Timon = timon;
	}
	public String getTablero() {
		return Tablero;
	}
	public void setTablero(String tablero) {
		Tablero = tablero;
	}
	public String getFrenodemano() {
		return Frenodemano;
	}
	public void setFrenodemano(String frenodemano) {
		Frenodemano = frenodemano;
	}
	public String getGuantera() {
		return Guantera;
	}
	public void setGuantera(String guantera) {
		Guantera = guantera;
	}
	public String getMandopuertadelanteraizqui() {
		return Mandopuertadelanteraizqui;
	}
	public void setMandopuertadelanteraizqui(String mandopuertadelanteraizqui) {
		Mandopuertadelanteraizqui = mandopuertadelanteraizqui;
	}
	public String getMandopuertadelanteradere() {
		return Mandopuertadelanteradere;
	}
	public void setMandopuertadelanteradere(String mandopuertadelanteradere) {
		Mandopuertadelanteradere = mandopuertadelanteradere;
	}
	public String getMandopuertatraseradere() {
		return Mandopuertatraseradere;
	}
	public void setMandopuertatraseradere(String mandopuertatraseradere) {
		Mandopuertatraseradere = mandopuertatraseradere;
	}
	public String getMandopuertatraseraizqui() {
		return Mandopuertatraseraizqui;
	}
	public void setMandopuertatraseraizqui(String mandopuertatraseraizqui) {
		Mandopuertatraseraizqui = mandopuertatraseraizqui;
	}
	public String getTapiceriatecho() {
		return Tapiceriatecho;
	}
	public void setTapiceriatecho(String tapiceriatecho) {
		Tapiceriatecho = tapiceriatecho;
	}
	public String getTableroInstrumentos() {
		return TableroInstrumentos;
	}
	public void setTableroInstrumentos(String tableroInstrumentos) {
		TableroInstrumentos = tableroInstrumentos;
	}
	public String getPorcentajeestadointerior() {
		return Porcentajeestadointerior;
	}
	public void setPorcentajeestadointerior(String porcentajeestadointerior) {
		Porcentajeestadointerior = porcentajeestadointerior;
	}
	public String getLuzdireccionaldelanteroder() {
		return Luzdireccionaldelanteroder;
	}
	public void setLuzdireccionaldelanteroder(String luzdireccionaldelanteroder) {
		Luzdireccionaldelanteroder = luzdireccionaldelanteroder;
	}
	public String getLuzdireccionaldelanteroizq() {
		return Luzdireccionaldelanteroizq;
	}
	public void setLuzdireccionaldelanteroizq(String luzdireccionaldelanteroizq) {
		Luzdireccionaldelanteroizq = luzdireccionaldelanteroizq;
	}
	public String getLuzdireccionaltraseroder() {
		return Luzdireccionaltraseroder;
	}
	public void setLuzdireccionaltraseroder(String luzdireccionaltraseroder) {
		Luzdireccionaltraseroder = luzdireccionaltraseroder;
	}
	public String getLuzdireccionaltraseroizq() {
		return Luzdireccionaltraseroizq;
	}
	public void setLuzdireccionaltraseroizq(String luzdireccionaltraseroizq) {
		Luzdireccionaltraseroizq = luzdireccionaltraseroizq;
	}
	public String getPito() {
		return Pito;
	}
	public void setPito(String pito) {
		Pito = pito;
	}
	public String getLuzreversaderecha() {
		return Luzreversaderecha;
	}
	public void setLuzreversaderecha(String luzreversaderecha) {
		Luzreversaderecha = luzreversaderecha;
	}
	public String getLuzreversaizquierda() {
		return Luzreversaizquierda;
	}
	public void setLuzreversaizquierda(String luzreversaizquierda) {
		Luzreversaizquierda = luzreversaizquierda;
	}
	public String getCocuyolateralizquierdo() {
		return Cocuyolateralizquierdo;
	}
	public void setCocuyolateralizquierdo(String cocuyolateralizquierdo) {
		Cocuyolateralizquierdo = cocuyolateralizquierdo;
	}
	public String getStopderecho() {
		return Stopderecho;
	}
	public void setStopderecho(String stopderecho) {
		Stopderecho = stopderecho;
	}
	public String getLuzTablero() {
		return LuzTablero;
	}
	public void setLuzTablero(String luzTablero) {
		LuzTablero = luzTablero;
	}
	public String getLuztecho() {
		return Luztecho;
	}
	public void setLuztecho(String luztecho) {
		Luztecho = luztecho;
	}
	public String getFarolaizquierda() {
		return Farolaizquierda;
	}
	public void setFarolaizquierda(String farolaizquierda) {
		Farolaizquierda = farolaizquierda;
	}
	public String getFaroladerecha() {
		return Faroladerecha;
	}
	public void setFaroladerecha(String faroladerecha) {
		Faroladerecha = faroladerecha;
	}
	public String getRadio() {
		return Radio;
	}
	public void setRadio(String radio) {
		Radio = radio;
	}
	
	public String getStopizquierdo() {
		return Stopizquierdo;
	}
	public void setStopizquierdo(String stopizquierdo) {
		Stopizquierdo = stopizquierdo;
	}
	public String getCocuyolateralderecho() {
		return Cocuyolateralderecho;
	}
	public void setCocuyolateralderecho(String cocuyolateralderecho) {
		Cocuyolateralderecho = cocuyolateralderecho;
	}
	public String getExploradoraizq() {
		return Exploradoraizq;
	}
	public void setExploradoraizq(String exploradoraizq) {
		Exploradoraizq = exploradoraizq;
	}
	public String getExploradoraderecha() {
		return Exploradoraderecha;
	}
	public void setExploradoraderecha(String exploradoraderecha) {
		Exploradoraderecha = exploradoraderecha;
	}
	public String getLuzplaca() {
		return Luzplaca;
	}
	public void setLuzplaca(String luzplaca) {
		Luzplaca = luzplaca;
	}
	public String getPorcentajeestadoluces() {
		return Porcentajeestadoluces;
	}
	public void setPorcentajeestadoluces(String porcentajeestadoluces) {
		Porcentajeestadoluces = porcentajeestadoluces;
	}
	public String getLlantadelanteraderecha() {
		return Llantadelanteraderecha;
	}
	public void setLlantadelanteraderecha(String llantadelanteraderecha) {
		Llantadelanteraderecha = llantadelanteraderecha;
	}
	public String getLlantadelanteraizquierda() {
		return Llantadelanteraizquierda;
	}
	public void setLlantadelanteraizquierda(String llantadelanteraizquierda) {
		Llantadelanteraizquierda = llantadelanteraizquierda;
	}
	public String getLlantatraseraderecha() {
		return Llantatraseraderecha;
	}
	public void setLlantatraseraderecha(String llantatraseraderecha) {
		Llantatraseraderecha = llantatraseraderecha;
	}
	public String getLlantatraseraizquierda() {
		return Llantatraseraizquierda;
	}
	public void setLlantatraseraizquierda(String llantatraseraizquierda) {
		Llantatraseraizquierda = llantatraseraizquierda;
	}
	public String getSuspensiondelanteraizquierda() {
		return Suspensiondelanteraizquierda;
	}
	public void setSuspensiondelanteraizquierda(String suspensiondelanteraizquierda) {
		Suspensiondelanteraizquierda = suspensiondelanteraizquierda;
	}
	public String getSuspensiondelanteraderecha() {
		return Suspensiondelanteraderecha;
	}
	public void setSuspensiondelanteraderecha(String suspensiondelanteraderecha) {
		Suspensiondelanteraderecha = suspensiondelanteraderecha;
	}
	public String getSuspensiontraseraizquierda() {
		return Suspensiontraseraizquierda;
	}
	public void setSuspensiontraseraizquierda(String suspensiontraseraizquierda) {
		Suspensiontraseraizquierda = suspensiontraseraizquierda;
	}
	public String getSuspensiontraseraderecha() {
		return Suspensiontraseraderecha;
	}
	public void setSuspensiontraseraderecha(String suspensiontraseraderecha) {
		Suspensiontraseraderecha = suspensiontraseraderecha;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	@Override
	public String toString() {
		return "vehiculo [id=" + id + ", Placa=" + Placa + ", id_motor=" + id_motor + ", createdDate=" + createdDate
				+ ", id_cliente=" + id_cliente + ", Clase=" + Clase + ", Marca=" + Marca + ", Tipo=" + Tipo
				+ ", Carroceria=" + Carroceria + ", Modelo=" + Modelo + ", Nacionalidad=" + Nacionalidad
				+ ", Tipodecaja=" + Tipodecaja + ", Cilindraje=" + Cilindraje + ", Combustible=" + Combustible
				+ ", Tipodepintura=" + Tipodepintura + ", Servicio=" + Servicio + ", Kilometraje=" + Kilometraje
				+ ", Color=" + Color + ", Nrochasis=" + Nrochasis + ", Nroserial=" + Nroserial + ", Nromotor="
				+ Nromotor + ", Trasmision=" + Trasmision + ", Traccion=" + Traccion + ", Version=" + Version
				+ ", SOAT=" + SOAT + ", Tarjetadepropiedad=" + Tarjetadepropiedad + ", Fotofrente=" + Fotofrente
				+ ", Fototrasera=" + Fototrasera + ", Fotoconsola=" + Fotoconsola + ", Fotolateralder=" + Fotolateralder
				+ ", Fotolateralizq=" + Fotolateralizq + ", Paraldelanteroizquierdo=" + Paraldelanteroizquierdo
				+ ", paraldelanteroderecho=" + paraldelanteroderecho + ", Paralcentralderecho=" + Paralcentralderecho
				+ ", Paralcentralizquierdo=" + Paralcentralizquierdo + ", Paraltraseroderecho=" + Paraltraseroderecho
				+ ", Paraltraserpizquierdo=" + Paraltraserpizquierdo + ", Estriboizquierdo=" + Estriboizquierdo
				+ ", Capota=" + Capota + ", Estriboderecho=" + Estriboderecho + ", Pisobaulsuperior=" + Pisobaulsuperior
				+ ", Gpolvometalizq=" + Gpolvometalizq + ", Gpolvometalderecho=" + Gpolvometalderecho
				+ ", Engrafescostadoizquierdo=" + Engrafescostadoizquierdo + ", Engrafescostadoderecho="
				+ Engrafescostadoderecho + ", Paneltrasero=" + Paneltrasero + ", Pisobaul=" + Pisobaul
				+ ", Porcentajeesctructura=" + Porcentajeesctructura + ", Guardafangoizq=" + Guardafangoizq
				+ ", Guardafangoderecho=" + Guardafangoderecho + ", Bompertrasero=" + Bompertrasero
				+ ", Bomperdelantero=" + Bomperdelantero + ", Compuerta=" + Compuerta + ", Retrovisorizq="
				+ Retrovisorizq + ", Retrovisorder=" + Retrovisorder + ", Puertadelanteraizq=" + Puertadelanteraizq
				+ ", Puertatraseraizq=" + Puertatraseraizq + ", Puertatraseraderecha=" + Puertatraseraderecha
				+ ", Puertadelanteraderecha=" + Puertadelanteraderecha + ", Persiana=" + Persiana + ", Costadoderecho="
				+ Costadoderecho + ", Porcentajelatoneria=" + Porcentajelatoneria + ", Sunroof=" + Sunroof
				+ ", Vidriodelanteroizquierdo=" + Vidriodelanteroizquierdo + ", Vidriodelanteroderecho="
				+ Vidriodelanteroderecho + ", Vidriotraseroizquierdo=" + Vidriotraseroizquierdo
				+ ", Vidriotraseroderecho=" + Vidriotraseroderecho + ", Lunetaretrovisorizquierdo="
				+ Lunetaretrovisorizquierdo + ", Vidriopuertadelanteraizq=" + Vidriopuertadelanteraizq
				+ ", Panoramicotrasero=" + Panoramicotrasero + ", Vidriopuertadelanterader=" + Vidriopuertadelanterader
				+ ", Vidriopuertatraserader=" + Vidriopuertatraserader + ", Lunetaretrovisorderecho="
				+ Lunetaretrovisorderecho + ", Retrovisorinterior=" + Retrovisorinterior + ", Panorámicodelantero="
				+ Panorámicodelantero + ", Vidriopuertatraseraizq=" + Vidriopuertatraseraizq + ", Porcentajevidrios="
				+ Porcentajevidrios + ", Basetijeraderecha=" + Basetijeraderecha + ", Basetijeraizquierda="
				+ Basetijeraizquierda + ", Extensionpuntadelantera=" + Extensionpuntadelantera
				+ ", Extensionpuntatrasera=" + Extensionpuntatrasera + ", Barraestabilizadora=" + Barraestabilizadora
				+ ", Puntadelanteraizq=" + Puntadelanteraizq + ", Cartercaja=" + Cartercaja + ", Cartermotor="
				+ Cartermotor + ", Exosto=" + Exosto + ", Puntadelanteraderecha=" + Puntadelanteraderecha
				+ ", Puntatraseraderecha=" + Puntatraseraderecha + ", Tanquedecombustible=" + Tanquedecombustible
				+ ", Traviesadelantera=" + Traviesadelantera + ", Puntatraseraizq=" + Puntatraseraizq
				+ ", Traviesamedia=" + Traviesamedia + ", Traviesatrasera=" + Traviesatrasera + ", Frontalsuperior="
				+ Frontalsuperior + ", Vigaderecha=" + Vigaderecha + ", Vigaizq=" + Vigaizq + ", Frontalinferior="
				+ Frontalinferior + ", Panel=" + Panel + ", Porcentajedechasis=" + Porcentajedechasis
				+ ", Carterapuertadelanteraizq=" + Carterapuertadelanteraizq + ", Carterapuertatraserader="
				+ Carterapuertatraserader + ", Cojineriadelanteraizq=" + Cojineriadelanteraizq + ", Cojineriatrasera="
				+ Cojineriatrasera + ", Consolacentral=" + Consolacentral + ", Carterapuertatraseraizq="
				+ Carterapuertatraseraizq + ", Carterapuertadelanterader=" + Carterapuertadelanterader
				+ ", Tapiceriapiso=" + Tapiceriapiso + ", Tapetesalfombras=" + Tapetesalfombras
				+ ", CojineriaDelanteraDerecha=" + CojineriaDelanteraDerecha + ", Parasolizquierdo=" + Parasolizquierdo
				+ ", Parasolderecho=" + Parasolderecho + ", Barradecambio=" + Barradecambio + ", Timon=" + Timon
				+ ", Tablero=" + Tablero + ", Frenodemano=" + Frenodemano + ", Guantera=" + Guantera
				+ ", Mandopuertadelanteraizqui=" + Mandopuertadelanteraizqui + ", Mandopuertadelanteradere="
				+ Mandopuertadelanteradere + ", Mandopuertatraseradere=" + Mandopuertatraseradere
				+ ", Mandopuertatraseraizqui=" + Mandopuertatraseraizqui + ", Tapiceriatecho=" + Tapiceriatecho
				+ ", TableroInstrumentos=" + TableroInstrumentos + ", Porcentajeestadointerior="
				+ Porcentajeestadointerior + ", Luzdireccionaldelanteroder=" + Luzdireccionaldelanteroder
				+ ", Luzdireccionaldelanteroizq=" + Luzdireccionaldelanteroizq + ", Luzdireccionaltraseroder="
				+ Luzdireccionaltraseroder + ", Luzdireccionaltraseroizq=" + Luzdireccionaltraseroizq + ", Pito=" + Pito
				+ ", Luzreversaderecha=" + Luzreversaderecha + ", Luzreversaizquierda=" + Luzreversaizquierda
				+ ", Cocuyolateralizquierdo=" + Cocuyolateralizquierdo + ", Stopderecho=" + Stopderecho
				+ ", LuzTablero=" + LuzTablero + ", Luztecho=" + Luztecho + ", Farolaizquierda=" + Farolaizquierda
				+ ", Faroladerecha=" + Faroladerecha + ", Radio=" + Radio + ", testigo=" + testigo + ", Stopizquierdo="
				+ Stopizquierdo + ", Cocuyolateralderecho=" + Cocuyolateralderecho + ", Exploradoraizq="
				+ Exploradoraizq + ", Exploradoraderecha=" + Exploradoraderecha + ", Luzplaca=" + Luzplaca
				+ ", Porcentajeestadoluces=" + Porcentajeestadoluces + ", Llantadelanteraderecha="
				+ Llantadelanteraderecha + ", Llantadelanteraizquierda=" + Llantadelanteraizquierda
				+ ", Llantatraseraderecha=" + Llantatraseraderecha + ", Llantatraseraizquierda="
				+ Llantatraseraizquierda + ", Suspensiondelanteraizquierda=" + Suspensiondelanteraizquierda
				+ ", Suspensiondelanteraderecha=" + Suspensiondelanteraderecha + ", Suspensiontraseraizquierda="
				+ Suspensiontraseraizquierda + ", Suspensiontraseraderecha=" + Suspensiontraseraderecha
				+ ", Observaciones=" + Observaciones + "]";
	}
	
	
	
	
	
}