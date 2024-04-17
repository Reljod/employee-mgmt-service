package com.example.employeemgmtservice.services;

import com.example.employeemgmtservice.data.CreateEmployeeRequest;
import com.example.employeemgmtservice.data.CreateEmployeeResponse;

public interface EmployeeService {

    public CreateEmployeeResponse create(CreateEmployeeRequest request);
}
