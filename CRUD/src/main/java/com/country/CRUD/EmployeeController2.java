package com.country.CRUD;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController2 {

	@Autowired
	private EmployeeRepo er;

	@GetMapping("/id")
	public ArrayList<Integer> getSample() {
		ArrayList<Integer> transformedvalues = new ArrayList<Integer>();
		for (EmployeeEntity emt : er.findAll()) {
			transformedvalues.add(emt.getId());
		}
		return transformedvalues;
	}
}
