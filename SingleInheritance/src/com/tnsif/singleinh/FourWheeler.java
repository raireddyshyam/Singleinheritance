package com.tnsif.singleinh;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Fourwheeler")
@DiscriminatorValue("car")
public class FourWheeler extends Vehicle{
	
	@Column(name="steeringfourwheeler")
	private String Steeringfourwheeler;

	public String getSteeringfourwheeler() {
		return Steeringfourwheeler;
	}

	public void setSteeringfourwheeler(String steeringfourwheeler) {
		Steeringfourwheeler = steeringfourwheeler;
	}
	

}
