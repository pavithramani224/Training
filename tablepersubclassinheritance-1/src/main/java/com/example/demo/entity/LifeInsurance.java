package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pavi1_lifeinsurance")


@PrimaryKeyJoinColumn(name="id",referencedColumnName="policy_Number")

public class LifeInsurance extends Insurance{
	
	@Column(name="age")
	private int age;
	
	@Column(name="profile")
	private String profile;
	
	public LifeInsurance(int policyNumber, String policyName, int age, String profile) {
		super(policyNumber, policyName);
		this.age = age;
		this.profile = profile;
	}
	
	
}
