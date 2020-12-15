package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data;

import java.sql.Connection;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Destinatario;

@Stateless
public class DestinatarioDAO {
	
	@Inject
	private Connection con;
	
	@Inject
	private EntityManager em;
	public DestinatarioDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean registar(Destinatario destinatario) {
		em.persist(destinatario);
		return true;
	}
	public Destinatario buscarDestinatario(String cedula) {
		Destinatario destinatario = new Destinatario();
		destinatario = em.find(Destinatario.class, cedula );
		return destinatario;
	}
	
	public List<Destinatario> listarDestinatario(){
		String jpql ="SELECT d from Destinatario d";
		Query ejecutar = em.createQuery(jpql, Destinatario.class); 
		List<Destinatario> listado = ejecutar.getResultList();
		return listado;
	}
}
