package com.assignment.Assign19;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class AssignmentController {
	@Autowired
	private TruckJpa tr;
	
	@Autowired
	private CarJpa cr;
	
	@Autowired
	private BikeJpa br;

	@GetMapping("/car")
	public List<CarEntity> joinco() {

		return cr.getjoin2();
	}

	@GetMapping("/truck")
	public List<TruckEntity> joincol() {

		return tr.getjoin();
	}
	
	@GetMapping("/n1")
	public List<BikeEntity> joincol3() {

		return br.getjoin3();
	}

}
