package com.lgdx.testapi.service;

import com.lgdx.testapi.domain.Employee;
import com.lgdx.testapi.repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HRService {

    @Autowired
    private HRRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long empId) {
        return employeeRepository.findById(empId);
    }

    public boolean deleteEmployee(Long empId) {
        if (employeeRepository.existsById(empId)) {
            employeeRepository.deleteById(empId);
            return true;
        } else {
            return false;
        }
    }


    public Optional<Employee> createEmployee(Employee employee) {
        return employeeRepository.create(employee);
    }
}