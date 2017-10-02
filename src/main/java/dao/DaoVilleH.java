package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Ville;

@Repository
@Transactional
public class DaoVilleH implements DaoVille {

	@PersistenceContext
	private EntityManager em;

	public void 		create(Ville value) 	{em.persist(value);}
	public Ville 		update(Ville value) 	{return em.merge(value);}
	public void 		delete(Ville value) 	{em.remove(value);}
	public Ville 		findById(Long value) 	{return em.find(Ville.class, value);}
	@SuppressWarnings("unchecked")
	public List<Ville> 	findAll() 				{Query query = em.createQuery("FROM Ville");
												return query.getResultList();}
}
