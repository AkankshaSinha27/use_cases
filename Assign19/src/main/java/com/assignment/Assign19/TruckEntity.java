package com.assignment.Assign19;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Truck")
public class TruckEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer Truck_id;
	public Integer getTruck_id() {
		return Truck_id;
	}
	public void setTruck_id(Integer truck_id) {
		Truck_id = truck_id;
	}
	public String getTruck_name() {
		return Truck_name;
	}
	public void setTruck_name(String truck_name) {
		Truck_name = truck_name;
	}
	public String getNo_of_types() {
		return No_of_types;
	}
	public void setNo_of_types(String no_of_types) {
		No_of_types = no_of_types;
	}
	private String Truck_name;
	private String No_of_types;
}

