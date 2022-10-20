package com.Insurance.Assign_Insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class InsurController {

	@Autowired
	private InsurRepo ir;
	@GetMapping("/c1")
	public List<InsurEntity> joinco() {

		return ir.getjoin(1);
	}
	
	
	@GetMapping("/c2")
	public List<InsurEntity> joinco1() {
		return ir.getjoin(2);
	}
	
	
}
