package com.subash.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "Fir")
public class Fir {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int firId;
	@Column(name = "incidentDate")
	private String incidentDate;
	@Column(name = "incidentTime")
	private String incidentTime;
	@Column(name = "incidentPlace")
	private String incidentPlace;
	@Column(name = "timeLodged")
	private String timeLodged;
	@Column(name = "dateLodged")
	private String dateLodged;

	public Fir() {
		super();
	}

	public Fir(int firId, String incidentDate, String incidentTime, String incidentPlace, String timeLodged,
			String dateLodged) {
		super();
		this.firId = firId;
		this.incidentDate = incidentDate;
		this.incidentTime = incidentTime;
		this.incidentPlace = incidentPlace;
		this.timeLodged = timeLodged;
		this.dateLodged = dateLodged;
	}

	public int getFirId() {
		return firId;
	}

	public void setFirId(int firId) {
		this.firId = firId;
	}

	public String getIncidentDate() {
		return incidentDate;
	}

	public void setIncidentDate(String incidentDate) {
		this.incidentDate = incidentDate;
	}

	public String getIncidentTime() {
		return incidentTime;
	}

	public void setIncidentTime(String incidentTime) {
		this.incidentTime = incidentTime;
	}

	public String getIncidentPlace() {
		return incidentPlace;
	}

	public void setIncidentPlace(String incidentPlace) {
		this.incidentPlace = incidentPlace;
	}

	public String getTimeLodged() {
		return timeLodged;
	}

	public void setTimeLodged(String timeLodged) {
		this.timeLodged = timeLodged;
	}

	public String getDateLodged() {
		return dateLodged;
	}

	public void setDateLodged(String dateLodged) {
		this.dateLodged = dateLodged;
	}

	@Override
	public String toString() {
		return "Fir [firId=" + firId + ", incidentDate=" + incidentDate + ", incidentTime=" + incidentTime
				+ ", incidentPlace=" + incidentPlace + ", timeLodged=" + timeLodged + ", dateLodged=" + dateLodged
				+ "]";
	}

}
