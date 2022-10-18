package com.country.CRUD;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController4 {



		@Autowired
		private EmployeeRepo er;

		@GetMapping("/department")
		public ArrayList<String> getSample() {
			ArrayList<String> transformedvalues = new ArrayList<String>();
			for (EmployeeEntity emt : er.findAll()) {
				transformedvalues.add(emt.getDepartment());
			
				
				
			}
			return transformedvalues;
		}
}
