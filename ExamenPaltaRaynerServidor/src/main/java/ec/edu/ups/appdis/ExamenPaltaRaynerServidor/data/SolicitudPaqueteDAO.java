package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data;

import java.sql.Connection;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Destinatario;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Remitente;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.SolicitudPaquetes;

@Stateless
public class SolicitudPaqueteDAO {
	@Inject
	private Connection con;
	
	@Inject
	private EntityManager em;
	
	public SolicitudPaqueteDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean registarSolicitud(SolicitudPaquetes solicitud) {
		em.persist(solicitud);
		return true;
	}
	public SolicitudPaquetes buscarSolicitud(int codigo) {
		SolicitudPaquetes soli = new SolicitudPaquetes();
		soli = em.find(SolicitudPaquetes.class, codigo );
		return soli;
	}
	
	public List<SolicitudPaquetes> listarSoli(){
		String jpql ="SELECT d from SolicitudPaquetes d";
		Query ejecutar = em.createQuery(jpql, SolicitudPaquetes.class); 
		List<SolicitudPaquetes> listado = ejecutar.getResultList();
		return listado;
	}
	
}
