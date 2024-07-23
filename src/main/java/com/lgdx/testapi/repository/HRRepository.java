package com.lgdx.testapi.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lgdx.testapi.domain.Employee;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class HRRepository {

    private static final String DATA_FILE_PATH = "src/main/resources/hr.json";
    private ObjectMapper objectMapper;

    public HRRepository() {
        this.objectMapper = new ObjectMapper();
    }

    public List<Employee> findAll() {
        try {
            return objectMapper.readValue(new File(DATA_FILE_PATH), new TypeReference<List<Employee>>(){});
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("리스트 읽을 수 없습니다.");
            return new ArrayList<>();
        }
    }

    public Optional<Employee> findById(Long empId) {
        try {
            List<Employee> employees = findAll();
            if (employees != null) {
                return employees.stream()
                        .filter(employee -> employee.getEmployeeId().equals(empId))
                        .findFirst();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public void save(List<Employee> employees) {
        try {
            objectMapper.writeValue(new File(DATA_FILE_PATH), employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(Long empId) {
        List<Employee> employees = findAll();
        if (employees != null) {
            employees.removeIf(employee -> employee.getEmployeeId().equals(empId));
            save(employees);
        }
    }

    public Optional<Employee> create(Employee employee) {
        List<Employee> employees = findAll();
        if (employees != null) {
            employees.add(employee);
            save(employees);
            return findById(employee.getEmployeeId());
        } else {
            return Optional.empty();
        }
    }

    public boolean existsById(long empId) {
        return findById(empId).isPresent();
    }
}
