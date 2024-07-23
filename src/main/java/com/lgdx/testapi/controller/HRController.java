package com.lgdx.testapi.controller;

import com.lgdx.testapi.domain.Employee;
import com.lgdx.testapi.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/emps")
public class HRController {

    @Autowired
    private HRService hrService;

    // 모든 인사 조회하기
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = hrService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    // 특정 인사 조회하기
    @GetMapping("/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long empId) {
        Optional<Employee> employee = hrService.getEmployeeById(empId);
        return employee.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 특정 인사 삭제하기
    @DeleteMapping("/{empId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long empId) {
        boolean isDeleted = hrService.deleteEmployee(empId);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    // 특정 인사 등록하기
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Optional<Employee> createdEmployee = hrService.createEmployee(employee);
        return ResponseEntity.ok(createdEmployee.get());
    }
}
