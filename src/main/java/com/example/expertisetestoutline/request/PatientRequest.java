package com.example.expertisetestoutline.request;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class PatientRequest {
	
	Integer id;


	@NotBlank(message = "PatientName must not be null or empty")
	String patientName;

	@NotBlank(message = "patientSurname must not be null or empty")
	String patientSurname;

	@NotBlank(message = "patientEmail must not be null or empty")
	String patientEmail;
	
	
	Integer height;
	
//	@NotBlank(message = "height must not be null or empty")
//	String height;
	
	
	Integer weight;

	
	Integer systolicBloodPressure;

	
	Integer diastolicBloodPressure;
	
	String capturedby;
	
	//String capturedon;

	public String getCapturedby() {
		return capturedby;
	}

	public void setCapturedby(String capturedby) {
		this.capturedby = capturedby;
	}

	

//	public String getCapturedon() {
//		return capturedon;
//	}
//
//	public void setCapturedon(String capturedon) {
//		this.capturedon = capturedon;
//	}

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
	
	

}
