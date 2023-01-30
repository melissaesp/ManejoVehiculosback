package co.com.ManejoVehiculos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="revision_tecnica")
@NamedQuery(name="revision_tecnica.findAll", query="SELECT r FROM revision_tecnica r")
public class revision_tecnica implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column( nullable=true)
	private String Dictamen;
	@Column( nullable=true)
	private String Observaciones;
	@ManyToOne
	@JoinColumn(name="id_vehiculo", nullable=true)
	private vehiculo id_vehiculo;
	
	
	
	
	public vehiculo getId_vehiculo() {
		return id_vehiculo;
	}
	public void setId_vehiculo(vehiculo id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDictamen() {
		return Dictamen;
	}
	public void setDictamen(String dictamen) {
		Dictamen = dictamen;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	
}
