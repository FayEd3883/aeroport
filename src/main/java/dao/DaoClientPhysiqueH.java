//package dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import model.ClientPhysique;
//import model.Passager;
//import model.Reservation;
//
//public class DaoClientPhysiqueH implements DaoClientPhysique {
//
//	@PersistenceContext
//	private EntityManager em;
//
//	public ClientPhysique findById(Long id) {
//		return em.find(ClientPhysique.class, id);
//	}
//
//	public List<ClientPhysique> findAll() {
//		Query query = em.createQuery("SELECT p FROM Passager p");
//		return query.getResultList();
//	}
//
//	public void create(ClientPhysique clientphysique) {
//		em.persist(clientphysique);
//	}
//
//	public ClientPhysique update(ClientPhysique clientphysique) {
//		return em.merge(clientphysique);
//	}
//
//	public void delete(ClientPhysique clientphysique) {
//		em.remove(clientphysique);
//	}
//
//}
