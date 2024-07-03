package com.subash.api.ownrepo;

import java.util.List;

import com.subash.api.model.PoliceStation;

public interface PoliceStationOwnRepo {
	public void save(PoliceStation policestation);

	public PoliceStation findById(int id);

	public List<PoliceStation> findAll();

	public void update(PoliceStation policestation);

	public void deleteById(int id);
}
