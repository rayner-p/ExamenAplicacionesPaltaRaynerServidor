package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.vista;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Destinatario;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Remitente;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio.GestionSistemaRemoto;

@Named
@RequestScoped
public class destinatarioBean {
	private Destinatario newDestinatario;
	
	private GestionSistemaRemoto on;
	public destinatarioBean() {
		init();
	}
	
	public void init() {
		newDestinatario = new Destinatario();
	}
	public Destinatario getNewDestinatario() {
		return newDestinatario;
	}

	public void setNewDestinatario(Destinatario newDestinatario) {
		this.newDestinatario = newDestinatario;
	}
	public String doRegistro() {
		try {
			on.registarDestinatario(newDestinatario);
			System.out.println("Destinatario creado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String resultado= "Destinatario creado";
		return resultado;
	}
	
}
