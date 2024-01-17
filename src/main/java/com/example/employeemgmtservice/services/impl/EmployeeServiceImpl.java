package com.example.employeemgmtservice.services.impl;

import org.springframework.stereotype.Service;

import com.example.employeemgmtservice.data.CreateEmployeeResponse;
import com.example.employeemgmtservice.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    public CreateEmployeeResponse create() {
        return new CreateEmployeeResponse("ACTIVE", "2024-00001");
    }
}
