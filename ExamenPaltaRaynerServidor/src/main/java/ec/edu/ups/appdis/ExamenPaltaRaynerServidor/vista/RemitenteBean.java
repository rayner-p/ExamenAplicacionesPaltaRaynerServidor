package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.vista;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Remitente;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio.GestionSistemaRemoto;

@Named
@RequestScoped
public class RemitenteBean {
	
	
	private Remitente newRemitente;
	private GestionSistemaRemoto on;
	
	public RemitenteBean() {
		init();	
		}
		
	public void init() {
		newRemitente = new Remitente();
	}
	public Remitente getNewRemitente() {
		return newRemitente;
	}

	public void setNewRemitente(Remitente newRemitente) {
		this.newRemitente = newRemitente;
	}
	
	public String doRegistro() {
		try {
			on.registarRemitente(newRemitente);
			System.out.println("Remitente creado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String resultado= "Remitente creado";
		return resultado;
	}
	
	
	
}
