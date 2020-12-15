package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data;

import java.sql.Connection;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Destinatario;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Remitente;

@Stateless
public class RemitenteDAO {
	@Inject
	private Connection con;
	
	@Inject
	private EntityManager em;
	
	public RemitenteDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean registarRemitente(Remitente remitente) {
		em.persist(remitente);
		return true;
	}
	public Remitente buscaRemitente(String cedula) {
		Remitente remitente = new Remitente();
		remitente = em.find(Remitente.class, cedula );
		return remitente;
	}
	
	public List<Remitente> listarRemitente(){
		String jpql ="SELECT d from Remitente d";
		Query ejecutar = em.createQuery(jpql, Destinatario.class); 
		List<Remitente> listado = ejecutar.getResultList();
		return listado;
	}

}
