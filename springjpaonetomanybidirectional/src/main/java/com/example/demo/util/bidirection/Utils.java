package com.example.demo.util.bidirection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.bidirectional.Doctor;
import com.example.demo.bidirectional.Patient;
import com.example.demo.repository.bidirectional.DoctorRepository;
import com.example.demo.repository.bidirectional.PatientRepository1;

@Component
public class Utils {
	@Autowired //to fetch data
	List<Patient> patientList;//LIST OF PATIENTS
	
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository docrepo;

	
	@Autowired
	PatientRepository1  patientrepo;
	
	public void create() { //instance of 3 beans that will inject to patient list
		
		
		for(Patient eachPatient:patientList) {
			eachPatient.setDoctor(doc);
			patientrepo.save(eachPatient);
		}
		
		//doc.setPatientList(patientList);//doc will have all details+ patient details
		
		Doctor added=docrepo.save(doc);
		
		if(added!=null) {
			System.out.println("One Record Added");
	}
}
	public void findAll() {
		List<Doctor>doctors=docrepo.findAll();
     //	System.out.println(doctors);
		
		for(Doctor eachDoctor:doctors) {
			
			System.out.println(eachDoctor.getDoctorName());
			System.out.println(eachDoctor.getDepartment());
			
			List<Patient> patient = eachDoctor.getPatientList();
			for(Patient eachPatient:patient) {
				System.out.println(eachPatient.getPatientName());
				System.out.println(eachPatient.getMobileNumber());
			}
		}
		}
	public void findDoctorfromPatient() {
		Patient entity = patientrepo.findById(1005).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}
	

}
