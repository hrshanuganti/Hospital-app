package com.example.expertisetestoutline.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expertisetestoutline.exceptionhandler.GenericResponse;
import com.example.expertisetestoutline.exceptionhandler.GlobalException;
import com.example.expertisetestoutline.model.Patient;
import com.example.expertisetestoutline.model.Registration;
import com.example.expertisetestoutline.repositories.PatientRepository;
import com.example.expertisetestoutline.repositories.RegistrationRepository;
import com.example.expertisetestoutline.request.LoginRequest;
import com.example.expertisetestoutline.request.PatientRequest;
import com.example.expertisetestoutline.request.RegistrationRequest;
import com.example.expertisetestoutline.service.CommonService;

@RestController
@RequestMapping(value = "/api")
public class PatientController {

	@Autowired
	private PatientRepository patientRepo;

	@Autowired
	private RegistrationRepository registrationRepo;

	@Autowired
	CommonService commonService;

	@PostMapping("/captureResult")
	public ResponseEntity<?> registerPatient(@Valid @RequestBody PatientRequest request, BindingResult bindingResult)
			throws GlobalException {
		commonService.validate(bindingResult);
		Patient patient = new Patient();
		patient.setDiastolicBloodPressure(request.getDiastolicBloodPressure());
		patient.setHeight(request.getHeight());
		patient.setId(request.getId());
		patient.setBmi(0);
		patient.setPatientEmail(request.getPatientEmail());
		patient.setPatientName(request.getPatientName());
		patient.setPatientSurname(request.getPatientSurname());
		patient.setSystolicBloodPressure(request.getSystolicBloodPressure());
		patient.setWeight(request.getWeight());
		patient.setCapturedby(request.getCapturedby());
		Patient response = patientRepo.save(patient);
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@PostMapping("/viewHighRiskPatients")
	public ResponseEntity<?> viewHighRiskPatients() throws GlobalException {
		System.out.println("helo");
		Integer bmi = null;
		List<Patient> list = patientRepo.findAll();
		List<Patient> riskpat = new ArrayList<Patient>();
		for (Patient patient : list) {
			Integer weight = patient.getWeight();
			Integer height = patient.getHeight();
			Integer systolicBloodPressure = patient.getSystolicBloodPressure();
			Integer diastolicBloodPressure = patient.getDiastolicBloodPressure();
			bmi = weight / (height * height);
			if (bmi > 30 && systolicBloodPressure > 140 && diastolicBloodPressure > 90) {
				patient.setBmi(bmi);
				riskpat.add(patient);
			}

		}

		return new ResponseEntity<>(riskpat, HttpStatus.OK);
	}

	@PostMapping("/userRegistration")
	public ResponseEntity<?> userRegistration(@Valid @RequestBody RegistrationRequest request,
			BindingResult bindingResult) throws GlobalException {
		commonService.validate(bindingResult);
		Registration registration = new Registration();
		registration.setId(request.getId());
		registration.setUserName(request.getUserName());
		registration.setUserPassword(request.getUserPassword());
		registration.setUserRole(request.getUserRole());
		Registration response = registrationRepo.save(registration);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/userLogin")
	public ResponseEntity<?> userLogin(@Valid @RequestBody LoginRequest request, BindingResult bindingResult)
			throws GlobalException {
		commonService.validate(bindingResult);
		List<Registration> registration = registrationRepo.findUserByName(request.getUserName());
		Registration user = registration.get(0);
		if (user.getUserName().equals(request.getUserName())
				&& user.getUserPassword().equals(request.getUserPassword())) {
			GenericResponse response = new GenericResponse();
			response.setResponseCode("200");
			response.setResponseMessage("Success");
			response.setDeveloperMessage("User Successfully Logged In");
			return new ResponseEntity<>(response, HttpStatus.OK);

		}

		else {
			throw new GlobalException("400", "Bad Request", "Invalid Username and password provided.Please try again ",
					HttpStatus.BAD_REQUEST);

		}

	}

}
