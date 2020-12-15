package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paquete")
public class Paquete implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;
	@Column(length=50)
	private String nombre;
	@Column(length=250)
	private String descripcion;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Paquete [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
}
