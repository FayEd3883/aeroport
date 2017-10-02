package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.DaoEscale;
import model.Escale;

@Repository
@Transactional
public class DaoEscaleH implements DaoEscale {

	@PersistenceContext
	private EntityManager em;
		
	public void 		create(Escale value) 		{em.persist(value);}
	public Escale 		update(Escale value) 		{return em.merge(value);}
	public void 		delete(Escale value) 		{em.remove(value);}
	public Escale 		findById(Long value) 		{return em.find(Escale.class, value);}
	@SuppressWarnings("unchecked")
	public List<Escale> findAll() 					{Query query = em.createQuery("FROM Escale");
													return query.getResultList();}
	
}
