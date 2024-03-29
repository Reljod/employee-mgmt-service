package com.example.employeemgmtservice.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemgmtservice.data.CreateEmployeeResponse;
import com.example.employeemgmtservice.services.EmployeeService;

@RestController
@RequestMapping(path = "${apiPrefix}/v1/employee")
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

    @PostMapping
	public ResponseEntity<CreateEmployeeResponse> index() {
		CreateEmployeeResponse response = employeeService.create();
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
}
