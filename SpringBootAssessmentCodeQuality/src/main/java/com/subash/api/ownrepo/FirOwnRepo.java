package com.subash.api.ownrepo;

import java.util.List;

import com.subash.api.model.Fir;

public interface FirOwnRepo {
	public void save(Fir fir);

	public Fir findById(int id);

	public List<Fir> findAll();

	public void update(Fir fir);

	public void deleteById(int id);

}
