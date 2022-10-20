package com.assignment.Assign19;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Bike")
public class BikeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Bike_id;
	private String Bike_name;
	public Integer getBike_id() {
		return Bike_id;
	}
	public void setBike_id(Integer bike_id) {
		Bike_id = bike_id;
	}
	public String getBike_name() {
		return Bike_name;
	}
	public void setBike_name(String bike_name) {
		Bike_name = bike_name;
	}
	public String getNo_of_types() {
		return No_of_types;
	}
	public void setNo_of_types(String no_of_types) {
		No_of_types = no_of_types;
	}
	private String No_of_types;
	

	
	 @OneToMany(cascade = CascadeType.ALL)
	    private List<BikeEntity> B1;
}