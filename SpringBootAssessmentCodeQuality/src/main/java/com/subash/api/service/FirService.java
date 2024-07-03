package com.subash.api.service;

import java.util.List;

import com.subash.api.model.Fir;

public interface FirService {

	public void addFir(Fir fir);

	public Fir getFir(int id);

	public List<Fir> getAllFir();

	public void updateFir(Fir fir);

	public void deleteFir(int id);
}
