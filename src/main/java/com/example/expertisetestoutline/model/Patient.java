package com.example.expertisetestoutline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name = "PATIENT")
public class Patient {

	@Column(name = "id")
	@Id
	Integer id;

	@Column(name = "patientname")
	String patientName;

	@Column(name = "patientsurname")
	String patientSurname;

	@Column(name = "patientemail")
	String patientEmail;

	@Column(name = "height")
	Integer height;
	//String height;
	
	@Column(name = "capturedby")
	String capturedby;
	
//	@Column(name = "capturedon")
//	String capturedon;
//	

	@Column(name = "weight")
	Integer weight;
	
	@Column(name = "bmi")
	Integer bmi;
	
	

	@Column(name = "systolicbloodpressure")
	Integer systolicBloodPressure;

	@Column(name = "diastolicbloodpressure")
	Integer diastolicBloodPressure;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSurname() {
		return patientSurname;
	}

	public void setPatientSurname(String patientSurname) {
		this.patientSurname = patientSurname;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getSystolicBloodPressure() {
		return systolicBloodPressure;
	}

	public void setSystolicBloodPressure(Integer systolicBloodPressure) {
		this.systolicBloodPressure = systolicBloodPressure;
	}

	public Integer getDiastolicBloodPressure() {
		return diastolicBloodPressure;
	}

	public void setDiastolicBloodPressure(Integer diastolicBloodPressure) {
		this.diastolicBloodPressure = diastolicBloodPressure;
	}

//	public String getHeight() {
//		return height;
//	}
//
//	public void setHeight(String height) {
//		this.height = height;
//	}

	public String getCapturedby() {
		return capturedby;
	}

	public void setCapturedby(String capturedby) {
		this.capturedby = capturedby;
	}

	public Integer getBmi() {
		return bmi;
	}

	public void setBmi(Integer bmi) {
		this.bmi = bmi;
	}


}
