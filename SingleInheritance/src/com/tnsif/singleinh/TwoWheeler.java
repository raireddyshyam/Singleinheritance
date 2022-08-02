package com.tnsif.singleinh;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Twowheeler")
@DiscriminatorValue("bike")
public class TwoWheeler extends Vehicle {
	
	@Column(name="steeringtwowheeler")
	private String Steeringtwowheeler;

	public String getSteeringtwowheeler() {
		return Steeringtwowheeler;
	}

	public void setSteeringtwowheeler(String steeringtwowheeler) {
		Steeringtwowheeler = steeringtwowheeler;
	}
	
	
	

}
