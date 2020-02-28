package com.example.expertisetestoutline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expertisetestoutline.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
