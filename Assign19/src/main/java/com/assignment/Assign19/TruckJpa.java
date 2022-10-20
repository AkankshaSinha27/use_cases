package com.assignment.Assign19;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TruckJpa extends JpaRepository<TruckEntity,Integer>{

@Query(value="SELECT * from Truck t INNER JOIN car c ON t.No_of_tyres=c.No_of_tyres;",nativeQuery=true)
	
	public List<TruckEntity> getjoin();
}
