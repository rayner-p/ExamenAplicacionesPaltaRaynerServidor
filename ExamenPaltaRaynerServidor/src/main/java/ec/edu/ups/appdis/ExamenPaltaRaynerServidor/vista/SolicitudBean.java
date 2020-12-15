package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.vista;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.SolicitudPaquetes;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio.GestionSistemaRemoto;

@Named
@RequestScoped
public class SolicitudBean {

	private SolicitudPaquetes newSolicitudesPaquetes;
	private GestionSistemaRemoto on;
	public SolicitudBean() {
		init();
	}
	public void init() {
		newSolicitudesPaquetes = new SolicitudPaquetes();
	}
	public SolicitudPaquetes getNewSolicitudesPaquetes() {
		return newSolicitudesPaquetes;
	}

	public void setNewSolicitudesPaquetes(SolicitudPaquetes newSolicitudesPaquetes) {
		this.newSolicitudesPaquetes = newSolicitudesPaquetes;
	}
	public String doRegistro() {
		try {
			on.registaSolicitud(newSolicitudesPaquetes);
			System.out.println("Destinatario creado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String resultado= "Destinatario creado";
		return resultado;
	}
}
