package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="remitente")
public class Remitente implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=10,nullable=false)
	private String cedula;
	@Column(length=50)
	private String nombre;
	@Column(length=50)
	private String apellido;
	@Column(length=50)
	private String direccion;
	@Column(length=50)
	private String correo;
	@Column(length=10)
	private String celular;
	@OneToMany
	@JoinColumn(name="solicitud_codigo")
	private List<SolicitudPaquetes> solicitud;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public List<SolicitudPaquetes> getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(List<SolicitudPaquetes> solicitud) {
		this.solicitud = solicitud;
	}
	@Override
	public String toString() {
		return "Remitente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", correo=" + correo + ", celular=" + celular + ", solicitud=" + solicitud + "]";
	}
	
}
