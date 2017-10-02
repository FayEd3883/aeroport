package dao;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
	import javax.persistence.Query;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	import model.CompagnieAerienne;

	@Repository
	@Transactional
	public class DaoCompagnieAerienneH implements DaoCompagnieAerienne {

		@PersistenceContext
		private EntityManager em;

		@Override
		public CompagnieAerienne findById(Long id) {
			return em.find(CompagnieAerienne.class, id);
		}

		public List<CompagnieAerienne> findAll() {
			Query query = em.createQuery("FROM CompagnieAerienne");
			return query.getResultList();
		}

		@Override
		public void create(CompagnieAerienne compagnieAerienne) {
			em.persist(compagnieAerienne);
		}

		@Override
		public CompagnieAerienne update(CompagnieAerienne compagnieAerienne) {
			return em.merge(compagnieAerienne);
		}

		@Override
		public void delete(CompagnieAerienne compagnieAerienne) {
			em.remove(compagnieAerienne);
		}

	}