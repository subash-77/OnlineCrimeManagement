package com.subash.api.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.subash.api.model.PoliceStation;
import com.subash.api.ownrepo.PoliceStationOwnRepo;
import com.subash.api.service.PoliceStationService;

@Service
public class PoliceStationServiceImpl implements PoliceStationService {

	public PoliceStationServiceImpl(PoliceStationOwnRepo ownrepo) {
		super();
		this.ownrepo = ownrepo;
	}

	PoliceStationOwnRepo ownrepo;

	public void addPoliceStation(PoliceStation policestation) {
		ownrepo.save(policestation);
	}

	public PoliceStation getPoliceStation(int id) {
		return ownrepo.findById(id);
	}

	public List<PoliceStation> getAllPoliceStation() {
		return ownrepo.findAll();
	}

	public void updatePoliceStation(PoliceStation policestation) {
		ownrepo.update(policestation);
	}

	public void deletePoliceStation(int id) {
		ownrepo.deleteById(id);
	}

}
