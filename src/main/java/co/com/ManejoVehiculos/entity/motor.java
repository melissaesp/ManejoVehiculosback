package co.com.ManejoVehiculos.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="motor")
@NamedQuery(name="motor.findAll", query="SELECT r FROM motor r")
public class motor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;
	
	@OneToMany
	@JoinColumn(name="id_cilindro", nullable=true)
	List <cilindro>  id_cilindro;

	@OneToMany
	@JoinColumn(name="id_perdida", nullable=true)
	List <perdida>  id_perdida;
	
    
	@Column( nullable=true)
	private String Observaciones;
    @Column( nullable=true)
	private String Aceitemotor;
    @Column( nullable=true)
	private String Direccionhidraulica;	
    @Column( nullable=true)
	private String Lavaparabrisas;	
    @Column( nullable=true)
	private String Liquidofrenos;
    @Column( nullable=true)
	private String Embrague;
    @Column( nullable=true)
	private String Refigerante;
    
		

	public List<perdida> getId_perdida() {
		return id_perdida;
	}
	public void setId_perdida(List<perdida> id_perdida) {
		this.id_perdida = id_perdida;
	}
	public List<cilindro> getId_cilindro() {
		return id_cilindro;
	}
	public void setId_cilindro(List<cilindro> id_cilindro) {
		this.id_cilindro = id_cilindro;
	}
	public String getAceitemotor() {
		return Aceitemotor;
	}
	public void setAceitemotor(String aceitemotor) {
		Aceitemotor = aceitemotor;
	}
	public String getDireccionhidraulica() {
		return Direccionhidraulica;
	}
	public void setDireccionhidraulica(String direccionhidraulica) {
		Direccionhidraulica = direccionhidraulica;
	}
	public String getLavaparabrisas() {
		return Lavaparabrisas;
	}
	public void setLavaparabrisas(String lavaparabrisas) {
		Lavaparabrisas = lavaparabrisas;
	}
	public String getLiquidofrenos() {
		return Liquidofrenos;
	}
	public void setLiquidofrenos(String liquidofrenos) {
		Liquidofrenos = liquidofrenos;
	}
	public String getEmbrague() {
		return Embrague;
	}
	public void setEmbrague(String embrague) {
		Embrague = embrague;
	}
	public String getRefigerante() {
		return Refigerante;
	}
	public void setRefigerante(String refigerante) {
		Refigerante = refigerante;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String Observaciones) {
		this.Observaciones = Observaciones;
	}
	
	
	
}
