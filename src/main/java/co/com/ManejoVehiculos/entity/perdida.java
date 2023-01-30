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
@Table(name="perdida")
@NamedQuery(name="perdida.findAll", query="SELECT r FROM perdida r")
public class perdida implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;
	
	@Column( nullable=true, length=150)
	private String perdidafluido;
	@Column( nullable=true, length=150)
	private String revisar;
	
	@ManyToOne
	@JoinColumn(name="id_motor", nullable=true)
	private motor id_motor;

	public motor getId_motor() {
		return id_motor;
	}
	public void setId_motor(motor id_motor) {
		this.id_motor = id_motor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPerdidafluido() {
		return perdidafluido;
	}
	public void setPerdidafluido(String perdidafluido) {
		this.perdidafluido = perdidafluido;
	}
	public String getRevisar() {
		return revisar;
	}
	public void setRevisar(String revisar) {
		this.revisar = revisar;
	}
	
}
