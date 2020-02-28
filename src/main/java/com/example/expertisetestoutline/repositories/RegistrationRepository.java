package com.example.expertisetestoutline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.expertisetestoutline.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	
	@Query(value = "select a from Registration a where userName = :userName")
	List<Registration> findUserByName(@Param(value = "userName")String userName);
	

}
