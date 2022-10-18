package com.country.CRUD;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController3 {

	@Autowired
	private EmployeeRepo er;

	@GetMapping("/A")
	public ArrayList<String> getSample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeEntity emt : er.findAll()) {
			if (emt.getEmployee_name().startsWith("A")) {
				transformedvalues.add(emt.getEmployee_name());

			}
		}

		return transformedvalues;

	}
}
