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

import com.subash.api.model.PoliceStation;
import com.subash.api.serviceimpl.PoliceStationServiceImpl;

@RestController
@RequestMapping("/policestation")
@CrossOrigin("http://localhost:3000")
public class PoliceStationController {

	public PoliceStationController(PoliceStationServiceImpl service) {
		super();
		this.service = service;
	}

	PoliceStationServiceImpl service;

	@PostMapping
	public String insertPoliceStation(@RequestBody PoliceStation policestation) {
		String msg = "";

		try {

			service.addPoliceStation(policestation);
			msg += "addSuccess";

		} catch (Exception e) {
			msg += "addFailure";
		}
		return msg;
	}

	@PutMapping
	public String updatePoliceStation(@RequestBody PoliceStation policestation) {
		String msg = "";

		try {

			service.updatePoliceStation(policestation);
			msg += "updateSuccess";

		} catch (Exception e) {
			msg += "updateFailure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public PoliceStation getPoliceStationById(@PathVariable("id") int id) {
		return service.getPoliceStation(id);
	}

	@GetMapping("/all")
	public List<PoliceStation> getSales() {
		return service.getAllPoliceStation();
	}

	@DeleteMapping("{id}")
	public String deletePoliceStationById(@PathVariable("id") int id) {
		String msg = "";

		try {

			service.deletePoliceStation(id);
			msg += "deleteSuccess";

		} catch (Exception e) {
			msg += "deleteFailure";
		}
		return msg;

	}
}
