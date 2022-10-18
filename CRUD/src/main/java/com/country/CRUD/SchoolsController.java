package com.country.CRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolsController {

	@Autowired
	private SchoolsRepo er;

	@GetMapping("/sc")
	public List<SchoolsEntity> getSample() {
		ArrayList<SchoolsEntity> transformedvalues = new ArrayList<SchoolsEntity>();
		for (SchoolsEntity emt : er.findAll()) {
			SchoolsEntity temp = new SchoolsEntity();
			temp.setStudent_name(emt.getStudent_name());
			
			transformedvalues.add(temp);
			
			
		}
		return transformedvalues;
	}
}
