package com.subash.api.ownrepoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.subash.api.model.PoliceStation;
import com.subash.api.ownrepo.PoliceStationOwnRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PoliceStationOwnRepoImpl implements PoliceStationOwnRepo {

	public PoliceStationOwnRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	EntityManager entityManager;

	@Override
	public void save(PoliceStation policestation) {
		entityManager.merge(policestation);
	}

	@Override
	public PoliceStation findById(int id) {
		return entityManager.find(PoliceStation.class, id);
	}

	@Override
	public List<PoliceStation> findAll() {
		return entityManager.createQuery("from PoliceStation", PoliceStation.class).getResultList();
	}

	@Override
	public void update(PoliceStation policestation) {
		entityManager.merge(policestation);
	}

	@Override
	public void deleteById(int id) {
		PoliceStation policestation = entityManager.find(PoliceStation.class, id);
		if (policestation != null) {
			entityManager.remove(policestation);
		}
	}

}
