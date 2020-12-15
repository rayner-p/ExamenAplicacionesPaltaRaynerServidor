package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data.DestinatarioDAO;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data.PaqueteDAO;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data.RemitenteDAO;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data.SolicitudPaqueteDAO;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Destinatario;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Paquete;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Remitente;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.SolicitudPaquetes;


@Stateless
public class SistemaEnviosON implements GestionSistemaRemoto{
	@Inject
	private DestinatarioDAO daoDestinatario;
	@Inject
	private RemitenteDAO daoRemitente;
	@Inject
	private PaqueteDAO daoPaquete;
	@Inject
	private SolicitudPaqueteDAO daoSolicitudes;
	
	public boolean registarDestinatario(Destinatario destinatario) throws Exception {
		if (destinatario.getCedula()==null) {
			throw new Exception("Ingrese una cedula");
		}
		daoDestinatario.registar(destinatario);
		System.out.println("Destinatario creado");
		return true;	
	}
	public boolean registarRemitente(Remitente remitente) throws Exception {
		if (remitente.getCedula()==null) {
			throw new Exception("Ingrese una cedula");
		}
		daoRemitente.registarRemitente(remitente);
		System.out.println("Remitente creado");
		return true;	
	}
	public boolean registarPaquete(Paquete paque) throws Exception {
		daoPaquete.registarPaquete(paque);
		System.out.println("Paquete creado");
		return true;	
	}
	public boolean registaSolicitud(SolicitudPaquetes solicitud) throws Exception {
		
		daoSolicitudes.registarSolicitud(solicitud);
		System.out.println("Solicitud creado");
		return true;	
	}
	
	public Remitente buscarRemitente(String cedula ) throws Exception {
		Remitente remi = daoRemitente.buscaRemitente(cedula);
		System.out.println("BUSQUEDAD REMITENTE CORRECTA");
		return remi;
		
	}
	public Destinatario buscarDest(String cedula ) throws Exception {
		Destinatario desti = daoDestinatario.buscarDestinatario(cedula);
		System.out.println("BUSQUEDAD DESTINATARIO CORRECTA");
		return desti;
		
	}
	public Paquete buscarPaquete(int codigo ) throws Exception {
		Paquete paque = daoPaquete.buscarPaquete(codigo);
		System.out.println("BUSQUEDAD PAQUETE CORRECTA");
		return paque;
		
	}
	public SolicitudPaquetes buscarSoli( int codigo ) throws Exception {
		SolicitudPaquetes solis = daoSolicitudes.buscarSolicitud(codigo);
		System.out.println("BUSQUEDAD SOLICITUD CORRECTA");
		return solis;
		
	}
	
	public List<Remitente> listarRemi(){
		return daoRemitente.listarRemitente();
		
	}
	public List<Destinatario> listarDesti(){
		return daoDestinatario.listarDestinatario();
		
	}
	public List<Paquete> listarPaquete(){
		return daoPaquete.listarPaquete();
		
	}
	public List<SolicitudPaquetes> listarSolicitudes(){
		return daoSolicitudes.listarSoli();
		
	}
	public String generaPrecio() {
		int numeroInicio = 10;
		double resultado = Math.random()*numeroInicio;
		String resultadoFinal = String.valueOf(resultado);
		return resultadoFinal;
	}
}
