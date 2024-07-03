package com.subash.api.service;

import java.util.List;

import com.subash.api.model.PoliceStation;

public interface PoliceStationService {
	public void addPoliceStation(PoliceStation policestation);

	public PoliceStation getPoliceStation(int id);

	public List<PoliceStation> getAllPoliceStation();

	public void updatePoliceStation(PoliceStation policestation);

	public void deletePoliceStation(int id);
}
