package com.subash.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subash.api.model.Fir;
import com.subash.api.serviceimpl.FirServiceImpl;

@RestController
@RequestMapping("/fir")
@CrossOrigin("http://localhost:3000")
public class FirController {

	FirServiceImpl service;

	public FirController(FirServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertFir(@RequestBody Fir fir) {
		String msg = "";

		try {
			service.addFir(fir);
			msg += "addSuccess";

		} catch (Exception e) {
			msg += "addFailure";
		}
		return msg;

	}

	@PutMapping
	public String updateFir(@RequestBody Fir fir) {
		String msg = "";

		try {

			service.updateFir(fir);
			msg += "updateSuccess";

		} catch (Exception e) {
			msg += "updateFailure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Fir getFirById(@PathVariable("id") int id) {
		return service.getFir(id);
	}

	@GetMapping("/all")
	public List<Fir> getFir() {
		return service.getAllFir();
	}

	@DeleteMapping("{id}")
	public String deleteFirById(@PathVariable("id") int id) {
		String msg = "";

		try {

			service.deleteFir(id);
			msg += "deleteSuccess";

		} catch (Exception e) {
			msg += "deleteFailure";
		}
		return msg;

	}
}
