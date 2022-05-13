package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.bidirectional.Doctor;
import com.example.demo.bidirectional.Patient;
import com.example.demo.util.bidirection.Utils;




@SpringBootApplication
public class SpringjpaonetomanybidirectionalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
		 SpringApplication.run(SpringjpaonetomanybidirectionalApplication.class, args);
		 Utils util = ctx.getBean(Utils.class);
		 System.out.println(("-------------add data----------"));
		 util.create();
		 System.out.println("-------------findall--------");
		 util.findAll();
		 System.out.println(("-------------find form pateint-----------"));
		 util.findDoctorfromPatient();
	}	
				
				@Bean
				public Doctor ariya() {
					Doctor doc1 = new Doctor();
					doc1.setDoctorId(101);
					doc1.setDoctorName("kaviya");
					doc1.setDepartment("eye");
					doc1.setPhoneNumber(9159161960l);
					return doc1;
				}
				
				@Bean
				public Patient dhiya() {
					return new Patient(1005,"priya",9884380451l);
				}
				@Bean
				public Patient siva() {
					return new Patient(1004,"seenu",98849078211l);
				}

}
