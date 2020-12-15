package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="solicitud_paquetes")
public class SolicitudPaquetes  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(length=5, nullable=false)
	private int codigo;
	private Remitente remitente;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cedula_destinatario")
	private Destinatario destinatario;
	@OneToMany
	private List<Paquete> listaPaquetes;
	@Column(name = "lugar_recoger_paquete",length=50)
	private	String lugarRecogerPaquete;
	@Column(name = "lugar_entrega_paquete",length=50)
	private String lugarEntregaPaquete;
	@Column(name = "precio_solicitud",length=4)
	private double precioSolicitud;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Remitente getRemitente() {
		return remitente;
	}
	public void setRemitente(Remitente remitente) {
		this.remitente = remitente;
	}
	public Destinatario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}
	public List<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}
	public void setListaPaquetes(List<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}
	public String getLugarRecogerPaquete() {
		return lugarRecogerPaquete;
	}
	public void setLugarRecogerPaquete(String lugarRecogerPaquete) {
		this.lugarRecogerPaquete = lugarRecogerPaquete;
	}
	public String getLugarEntregaPaquete() {
		return lugarEntregaPaquete;
	}
	public void setLugarEntregaPaquete(String lugarEntregaPaquete) {
		this.lugarEntregaPaquete = lugarEntregaPaquete;
	}
	public double getPrecioSolicitud() {
		return precioSolicitud;
	}
	public void setPrecioSolicitud(double precioSolicitud) {
		this.precioSolicitud = precioSolicitud;
	}
	@Override
	public String toString() {
		return "SolicitudPaquetes [codigo=" + codigo + ", remitente=" + remitente + ", destinatario=" + destinatario
				+ ", listaPaquetes=" + listaPaquetes + ", lugarRecogerPaquete=" + lugarRecogerPaquete
				+ ", lugarEntregaPaquete=" + lugarEntregaPaquete + ", precioSolicitud=" + precioSolicitud + "]";
	}
	
	
}
