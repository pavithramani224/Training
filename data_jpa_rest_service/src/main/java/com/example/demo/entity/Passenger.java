package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name="pavi_passenger")

@Data
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Passenger {
	@Id
	    @Column(name="passenger_id")
		int passengerId;
	    
	    @Column(name="passenger_name")
		String passengerName;
	    
	    @Column(name="passenger_email")
		String passengerEmail;
	    
	    @Column(name="passenger_location")
		String  passengerLocation;
	    
	    @OneToMany(targetEntity = TripHistory.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        
	    @JoinColumn(name="passenger_ref",referencedColumnName="passenger_id")
	    
	    List<TripHistory> tripHistory;
}
