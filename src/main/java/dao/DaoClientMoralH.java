//package dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import model.ClientMoral;
//import model.ClientPhysique;
//
//public class DaoClientMoralH implements DaoClientMoral {
//
//	@PersistenceContext
//	private EntityManager em;
//
//	public ClientMoral findById(Long id) {
//		return em.find(ClientMoral.class, id);
//	}
//
//	public List<ClientMoral> findAll() {
//		Query query = em.createQuery("FROM ClientMoral");
//		return query.getResultList();
//	}
//
//	public void create(ClientMoral clientmoral) {
//		em.persist(clientmoral);
//	}
//
//	public ClientMoral update(ClientMoral clientmoral) {
//		return em.merge(clientmoral);
//	}
//
//	public void delete(ClientMoral clientmoral) {
//		em.remove(clientmoral);
//	}
//
//}
