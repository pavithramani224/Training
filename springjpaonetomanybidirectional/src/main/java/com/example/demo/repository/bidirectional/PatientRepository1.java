package com.example.demo.repository.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bidirectional.Patient;

public interface PatientRepository1 extends JpaRepository<Patient, Integer> {

}
