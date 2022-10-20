package com.assignment.Assign19;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarJpa extends JpaRepository<CarEntity,Integer>{

	@Query(value="SELECT * from car c JOIN Truck t ON t.No_of_types=c.No_of_types;",nativeQuery=true)
	public List<CarEntity> getjoin2();
}
