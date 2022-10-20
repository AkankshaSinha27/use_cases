package com.Insurance.Assign_Insurance;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InsurRepo extends JpaRepository<InsurEntity,Integer>{
	
	@Query(value="select * from Insurance_Table t where t.Id= ?1",nativeQuery=true)
	public List<InsurEntity> getjoin(Integer a);

}
