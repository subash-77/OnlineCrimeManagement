package com.subash.api.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.subash.api.model.Fir;
import com.subash.api.ownrepo.FirOwnRepo;
import com.subash.api.service.FirService;

@Service
public class FirServiceImpl implements FirService {

	public FirServiceImpl(FirOwnRepo ownrepo) {
		super();
		this.ownrepo = ownrepo;
	}

	FirOwnRepo ownrepo;

	@Override
	public void addFir(Fir fir) {
		ownrepo.save(fir);
	}

	@Override
	public Fir getFir(int id) {
		return ownrepo.findById(id);
	}

	public List<Fir> getAllFir() {
		return ownrepo.findAll();
	}

	@Override
	public void updateFir(Fir fir) {
		ownrepo.update(fir);
	}

	@Override
	public void deleteFir(int id) {
		ownrepo.deleteById(id);
	}

}
