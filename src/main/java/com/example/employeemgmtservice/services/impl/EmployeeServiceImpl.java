package com.example.employeemgmtservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemgmtservice.data.CreateEmployeeRequest;
import com.example.employeemgmtservice.data.CreateEmployeeResponse;
import com.example.employeemgmtservice.repository.jpa.EmployeeRepository;
import com.example.employeemgmtservice.repository.model.Employee;
import com.example.employeemgmtservice.services.EmployeeService;

import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public CreateEmployeeResponse create(CreateEmployeeRequest request) {

        Employee newEmployee = new Employee();
        newEmployee.setCompanyId(UUID.fromString(request.getCompanyId()));
        newEmployee.setStatus("ACTIVE");
        
        Employee employeeResponse = employeeRepository.save(newEmployee);
        return new CreateEmployeeResponse(
            employeeResponse.getStatus(), 
            employeeResponse.getEmployeeId().toString()
        );
    }
}
