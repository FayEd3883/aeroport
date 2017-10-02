package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Vol;

@Repository
@Transactional
public class DaoVolH implements DaoVol {

	@PersistenceContext
	private EntityManager em;	
	
	public void 	 create(Vol value) 		{em.persist(value);}
	public Vol 		 update(Vol value) 		{return em.merge(value);}
	public void 	 delete(Vol value) 		{em.remove(value);}
	public Vol 		 findById(Long value) 	{return em.find(Vol.class, value);}
	@SuppressWarnings("unchecked")
	public List<Vol> findAll() 				{Query query = em.createQuery("FROM Vol");
												return query.getResultList();}
}
