package com.subash.api.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PoliceStation")
public class PoliceStation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column(name = "stationInCharge")
	private String stationInCharge;
	@Column(name = "jurisdiction")
	private String jurisdiction;

	@OneToMany(targetEntity = Fir.class, cascade = CascadeType.ALL)
	@JoinColumn()
	private List<Fir> fir = new ArrayList<>();

	public PoliceStation() {
		super();
	}

	public PoliceStation(int pid, String stationInCharge, String jurisdiction, List<Fir> fir) {
		super();
		this.pid = pid;
		this.stationInCharge = stationInCharge;
		this.jurisdiction = jurisdiction;
		this.fir = fir;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getStationInCharge() {
		return stationInCharge;
	}

	public void setStationInCharge(String stationInCharge) {
		this.stationInCharge = stationInCharge;
	}

	public String getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public List<Fir> getFir() {
		return fir;
	}

	public void setFir(List<Fir> fir) {
		this.fir = fir;
	}

	@Override
	public String toString() {
		return "PoliceStation [pid=" + pid + ", stationInCharge=" + stationInCharge + ", jurisdiction=" + jurisdiction
				+ ", fir=" + fir + "]";
	}

}
