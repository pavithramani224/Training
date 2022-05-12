package com.example.demo.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

	@Entity
	@Table(name="pavi1_seminar_one_to_one")


	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public class Seminar {
		@Id
		@Column(name="seminar_id")
		int seminarId;
		
		@Column(name="seminar_name")
		String seminarName;
		
		@Column(name="time_duration")
		int duration;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "speaker_ref")
		private Speaker speaker;

}
