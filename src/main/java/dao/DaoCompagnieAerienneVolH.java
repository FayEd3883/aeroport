package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.CompagnieAerienne;
import model.CompagnieAerienneVol;


@Repository
@Transactional
public class DaoCompagnieAerienneVolH implements DaoCompagnieAerienneVol {

	@PersistenceContext
	private EntityManager em;

	@Override
	public CompagnieAerienneVol findById(Long id) {
		return em.find(CompagnieAerienneVol.class, id);
	}

	public List<CompagnieAerienneVol> findAll() {
		Query query = em.createQuery("FROM CompagnieAerienneVol");
		return query.getResultList();
	}

	@Override
	public void create(CompagnieAerienneVol value) {
		em.persist(value);
	}

	@Override
	public CompagnieAerienneVol update(CompagnieAerienneVol compagnieAerienneVol) {
		return em.merge(compagnieAerienneVol);
	}

	@Override
	public void delete(CompagnieAerienneVol compagnieAerienneVol) {
		em.remove(compagnieAerienneVol);
	}


}
