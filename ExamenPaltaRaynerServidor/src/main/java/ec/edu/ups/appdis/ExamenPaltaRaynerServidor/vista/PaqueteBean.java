package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.vista;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Destinatario;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Paquete;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio.GestionSistemaRemoto;

@Named
@RequestScoped
public class PaqueteBean {
	private Paquete newPaquete;
	private GestionSistemaRemoto on;
public PaqueteBean() {
	init();
	
}
	public void init() {
		newPaquete = new Paquete();
	}
	public Paquete getNewPaquete() {
		return newPaquete;
	}

	public void setNewPaquete(Paquete newPaquete) {
		this.newPaquete = newPaquete;
	}
	public String doRegistro() {
		try {
			on.registarPaquete(newPaquete);
			System.out.println("Destinatario creado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String resultado= "Destinatario creado";
		return resultado;
	}
}
