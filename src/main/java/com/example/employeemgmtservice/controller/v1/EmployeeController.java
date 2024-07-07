package com.example.employeemgmtservice.controller.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemgmtservice.data.CreateEmployeeRequest;
import com.example.employeemgmtservice.data.CreateEmployeeResponse;
import com.example.employeemgmtservice.services.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "${apiPrefix}/v1/employee")
public class EmployeeController {

	private final EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<CreateEmployeeResponse> createEmployee(
			@RequestBody CreateEmployeeRequest request) {
		CreateEmployeeResponse response = employeeService.create(request);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
