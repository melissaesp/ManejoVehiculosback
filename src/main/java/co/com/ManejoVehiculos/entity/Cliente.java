package co.com.ManejoVehiculos.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="cliente")
@NamedQuery(name="	Cliente.findAll", query="SELECT r FROM Cliente r")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;
	
	@Column(name="lugar_expedicion", nullable=true)
	private String lugarexpedicion;

	@Column(nullable=true, length=1)
	private String TipoIdentificacion;

	@Column(name="numero_identificacion",nullable=true)
	private int  numeroIdentificacion;


	@Column(name="identificacion_propietario",nullable=true)
	private String IdentificacionPropietario;

	
	@Column(name="nombre_propietario",nullable=true)
	private String NombrePropietario;

	@Column(name="celular_propietario", nullable=true,length=250)
	private String CelularPropietario;
	
	@Column( nullable=true,length=250)
	private String nombreC;
	@Column( nullable=true,length=250)
	private String direccionP;
	
	
	@Column( name="CorreoC",nullable=true)
	private String CorreoC;
	
	@Column( nullable=true,length=250)
	private String tipodepersona;
	
	@Column( nullable=true,length=250)
	private String  direccionC;
	
	@Column( nullable=true,length=250)
	private String   CelularC;
	

	@Column( nullable=true,length=250)
	private String  telefonoC;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLugarexpedicion() {
		return lugarexpedicion;
	}


	public void setLugarexpedicion(String lugarexpedicion) {
		this.lugarexpedicion = lugarexpedicion;
	}


	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}


	public void setTipoIdentificacion(String tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}


	
	


	




	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}


	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}


	public String getIdentificacionPropietario() {
		return IdentificacionPropietario;
	}


	public void setIdentificacionPropietario(String identificacionPropietario) {
		IdentificacionPropietario = identificacionPropietario;
	}


	public String getNombrePropietario() {
		return NombrePropietario;
	}


	public void setNombrePropietario(String nombrePropietario) {
		NombrePropietario = nombrePropietario;
	}


	public String getCelularPropietario() {
		return CelularPropietario;
	}


	public void setCelularPropietario(String celularPropietario) {
		CelularPropietario = celularPropietario;
	}


	public String getNombreC() {
		return nombreC;
	}


	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}


	public String getDireccionP() {
		return direccionP;
	}


	public void setDireccionP(String direccionP) {
		this.direccionP = direccionP;
	}


	public String getCorreoC() {
		return CorreoC;
	}


	public void setCorreoC(String correoC) {
		CorreoC = correoC;
	}


	public String getTipodepersona() {
		return tipodepersona;
	}


	public void setTipodepersona(String tipodepersona) {
		this.tipodepersona = tipodepersona;
	}


	public String getDireccionC() {
		return direccionC;
	}


	public void setDireccionC(String direccionC) {
		this.direccionC = direccionC;
	}


	public String getCelularC() {
		return CelularC;
	}


	public void setCelularC(String celularC) {
		CelularC = celularC;
	}


	public String getTelefonoC() {
		return telefonoC;
	}


	public void setTelefonoC(String telefonoC) {
		this.telefonoC = telefonoC;
	}
	
	
	
	

}