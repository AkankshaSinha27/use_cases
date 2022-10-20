package com.assignment.Assign19;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="car")
public class CarEntity {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Car_id;
	private String Car_name;
	public Integer getCar_id() {
		return Car_id;
	}
	public void setCar_id(Integer car_id) {
		Car_id = car_id;
	}
	public String getCar_name() {
		return Car_name;
	}
	public void setCar_name(String car_name) {
		Car_name = car_name;
	}
	public String getNo_of_types() {
		return No_of_types;
	}
	public void setNo_of_types(String no_of_types) {
		No_of_types = no_of_types;
	}
	private String No_of_types;
	
}
