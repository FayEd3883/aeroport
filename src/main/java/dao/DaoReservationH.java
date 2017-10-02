package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Passager;
import model.Reservation;

public class DaoReservationH implements DaoReservation {

	@PersistenceContext
	private EntityManager em;

	public Reservation findById(Long id) {
		return em.find(	Reservation.class, id);
	}

	public List<Reservation> findAll() {
		Query query = em.createQuery("FROM Reservation ");
		return query.getResultList();
	}

	public void create(Reservation reservation) {
		em.persist(reservation);
	}

	public Reservation update(Reservation reservation) {
		return em.merge(reservation);
	}

	public void delete(Reservation reservation) {
		em.remove(reservation);
	}

}
