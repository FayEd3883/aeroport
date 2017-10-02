package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.ClientEI;
import model.ClientMoral;

public class DaoClientEIH implements DaoClientEI {
	@PersistenceContext
	private EntityManager em;

	public ClientEI findById(Long id) {
		return em.find(ClientEI.class, id);
	}

	public List<ClientEI> findAll() {
		Query query = em.createQuery("SELECT p FROM ClientEI p");
		return query.getResultList();
	}

	public void create(ClientEI clientei) {
		em.persist(clientei);
	}

	public ClientEI update(ClientEI clientei) {
		return em.merge(clientei);
	}

	public void delete(ClientEI clientei) {
		em.remove(clientei);
	}


}
