package com.icon.service;

import com.icon.Employee.EmployeeEntity;
import com.icon.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepository;

    // CREATE
    public EmployeeEntity createEmployee(EmployeeEntity emp) {
        return empRepository.save(emp);
    }

    // READ
    public List<EmployeeEntity> getEmployees() {
        return empRepository.findAll();
    }

    // DELETE
    public void deleteEmployee(Long empId) {
        empRepository.deleteById(empId);
    }
    // UPDATE
    public EmployeeEntity updateEmployee(Long empId, EmployeeEntity employeeDetails) {
        EmployeeEntity emp = empRepository.findById(empId).get();
        emp.setFirstName(employeeDetails.getFirstName());
        emp.setLastName(employeeDetails.getLastName());
        emp.setEmailId(employeeDetails.getEmailId());

        return empRepository.save(emp);
    }
}
