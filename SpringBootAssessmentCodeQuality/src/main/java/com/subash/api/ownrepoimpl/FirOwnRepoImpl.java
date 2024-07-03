package com.subash.api.ownrepoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.subash.api.model.Fir;
import com.subash.api.ownrepo.FirOwnRepo;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FirOwnRepoImpl implements FirOwnRepo {

	public FirOwnRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	EntityManager entityManager;

	@Override
	public void save(Fir fir) {
		entityManager.merge(fir);
	}

	@Override
	public Fir findById(int id) {
		return entityManager.find(Fir.class, id);
	}

	@Override
	public List<Fir> findAll() {
		return entityManager.createQuery("from Fir", Fir.class).getResultList();
	}

	@Override
	public void update(Fir fir) {
		entityManager.merge(fir);
	}

	@Override
	public void deleteById(int id) {
		Fir fir = entityManager.find(Fir.class, id);
		if (fir != null) {
			entityManager.remove(fir);
		}
	}

}
