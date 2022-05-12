package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="pavi1_speaker_one_to_one")//class=table
@Data //getter setter
@NoArgsConstructor
@AllArgsConstructor

public class Speaker {
	
	@Id
	@Column(name="speaker_id")
	int id;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="qualification")
	String qualification;

}
