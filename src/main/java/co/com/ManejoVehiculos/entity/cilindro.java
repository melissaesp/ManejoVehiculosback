package co.com.ManejoVehiculos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="cilindro")
@NamedQuery(name="cilindro.findAll", query="SELECT r FROM cilindro r")
public class cilindro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column( nullable=true, length=150)
	private String vacio;
	@Column( nullable=true, length=150)
	private String valor;
	@Column( nullable=true, length=150)
	private String cilindro;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getVacio() {
		return vacio;
	}
	public void setVacio(String vacio) {
		this.vacio = vacio;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getCilindro() {
		return cilindro;
	}
	public void setCilindro(String cilindro) {
		this.cilindro = cilindro;
	}
	
	

}
