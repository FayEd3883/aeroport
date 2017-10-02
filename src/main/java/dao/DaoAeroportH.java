package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.DaoAeroport;
import model.Aeroport;

@Repository
@Transactional
public class DaoAeroportH implements DaoAeroport {
	
	@PersistenceContext
	private EntityManager em;
	
	public void 		  create(Aeroport value) 	{em.persist(value);}
	public Aeroport 	  update(Aeroport value) 	{return em.merge(value);}
	public void 		  delete(Aeroport value)	{em.remove(value);}
	public Aeroport 	  findById(Long value)	 	{return em.find(Aeroport.class, value);}
	@SuppressWarnings("unchecked")
	public List<Aeroport> findAll() 				{Query query = em.createQuery("FROM Aeroport");
													return query.getResultList();}
}
