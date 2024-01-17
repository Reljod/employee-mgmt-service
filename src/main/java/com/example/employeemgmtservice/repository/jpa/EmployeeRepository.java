package com.example.employeemgmtservice.repository.jpa;

import org.springframework.data.repository.Repository;

import com.example.employeemgmtservice.repository.model.Employee;

public interface EmployeeRepository extends Repository<Employee, Long> {

    Employee save(Employee employee);
}
