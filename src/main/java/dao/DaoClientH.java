package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Client;

@Repository
@Transactional
public class DaoClientH implements DaoClient {

	@PersistenceContext
	private EntityManager em;



	
	public Client findById(Long id) {
		return em.find(Client.class, id);
	}

	public List<Client> findAll() {
		Query query = em.createQuery("FROM Client"); 
		return query.getResultList();
	}

	
	public void create(Client client) {
		em.persist(client);
	}

	
	public Client update(Client client) {
		return em.merge(client);
	}

	
	public void delete(Client client) {
		em.remove(client);
	}

}
