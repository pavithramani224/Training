package com.example.demo.util.bidirection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.bidirectional.Doctor;
import com.example.demo.bidirectional.Patient;
import com.example.demo.ifaces.bidirectional.DoctorRepository;
import com.example.demo.ifaces.bidirectional.PatientRepository;

@Component
public class Utils {
	@Autowired //to fetch data
	List<Patient> patientList;//LIST OF PATIENTS
	
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository docrepo;
	
	@Autowired
	Patient pat;
	
	@Autowired
	PatientRepository  patientrepo;
	
	public void create() { //instance of 3 beans that will inject to patient list
		
		doc.setPatientList(patientList);//doc will have all details+ patient details
		
		Doctor added=docrepo.save(doc);
		
		if(added!=null) {
			System.out.println("One Record Added");
	}
}
	public void findAll() {
		List<Doctor>doctors=docrepo.findAll();
     //	System.out.println(doctors);
		
		for(Doctor eachDoctor:doctors) {
		}
		}
	public void findDoctorfromPatient() {
		Patient entity = patientrepo.findById(101).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getdoctor);
	}
	

}
