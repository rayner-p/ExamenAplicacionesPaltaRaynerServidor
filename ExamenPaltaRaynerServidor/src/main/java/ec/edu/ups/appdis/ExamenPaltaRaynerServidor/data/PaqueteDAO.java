package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.data;

import java.sql.Connection;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Paquete;

@Stateless
public class PaqueteDAO {
	@Inject
	private Connection con;
	
	@Inject
	private EntityManager em;
	
	public PaqueteDAO() {
		// TODO Auto-generated constructor stub
	}
	public boolean registarPaquete(Paquete paquete) {
		em.persist(paquete);
		return true;
	}
	public Paquete buscarPaquete(int codigo) {
		Paquete paquete = new Paquete();
		paquete = em.find(Paquete.class, codigo );
		return paquete;
	}
	
	public List<Paquete> listarPaquete(){
		String jpql ="SELECT d from Paquete d";
		Query ejecutar = em.createQuery(jpql, Paquete.class); 
		List<Paquete> listado = ejecutar.getResultList();
		return listado;
	}

}
