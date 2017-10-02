//package dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import model.*;
//
//@Repository
//@Transactional
//public class DaoAdresseH implements DaoAdresse {
//
//	@PersistenceContext
//	private EntityManager em;
//
//	@Autowired
//	@Qualifier("daoAdresseH")
//	private DaoAdresse daoAdresse;
//	public Adresse findById(String adresse) {
//		return em.find(Adresse.class, adresse);
//	}
//
//	
//	public List<Adresse> findAll() {
//		Query query = em.createQuery("SELECT a FROM Adresse a");
//		return query.getResultList();
//	}
//
//
//	public void create(Adresse adresse) {
//		em.persist(adresse);
//	}
//
//
//	public Adresse update(Adresse adresse) {
//		return em.merge(adresse);
//	}
//
//	
//	public void delete(Adresse adresse) {
//		em.remove(adresse);
//	}
//
//	public List<Adresse> findByClient(Client p) {
//		Query query = em.createQuery("SELECT a FROM Adresse a WHERE a.client = :p");
//		query.setParameter("p", p);
//		return query.getResultList();
//	}
//
//}
