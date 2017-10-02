package dao;

import java.util.List;
import model.Passager;
import model.Reservation;
import model.Passager;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DaoPassagerH implements Dao<Passager, Long> {

	@PersistenceContext
	private EntityManager em;

	public Passager findById(Long id) {
		return em.find(Passager.class, id);
	}

	public List<Passager> findAll() {
		Query query = em.createQuery("FROM Passager ");
		return query.getResultList();
	}

	public void create(Passager passager) {
		em.persist(passager);
	}

	public Passager update(Passager passager) {
		return em.merge(passager);
	}

	public void delete(Passager passager) {
		em.remove(passager);
	}

}
