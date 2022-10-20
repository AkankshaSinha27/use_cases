package com.assignment.Assign19;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BikeJpa extends JpaRepository<BikeEntity,Integer>{

	@Query(value="SELECT * from bike b JOIN car c ON b.Bike_name=c.Car_name;",nativeQuery=true)
	public List<BikeEntity> getjoin3();
	
}
