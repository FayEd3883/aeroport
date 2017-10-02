package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Login;
import model.Passager;
import model.Reservation;

public class DaoLoginH implements DaoLogin {

	@PersistenceContext
	private EntityManager em;

	public Login findById(Long id) {
		return em.find(Login.class, id);
	}

	public List<Login> findAll() {
		Query query = em.createQuery("FROM Login ");
		return query.getResultList();
	}

	public void create(Login login) {
		em.persist(login);
	}

	public Login update(Login login) {
		return em.merge(login);
	}

	public void delete(Login login) {
		em.remove(login);
	}

}
