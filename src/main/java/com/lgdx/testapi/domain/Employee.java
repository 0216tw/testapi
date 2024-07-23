package com.lgdx.testapi.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class Employee {

    @JsonProperty("employee_id")
    private Long employeeId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("hire_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hireDate;

    @JsonProperty("job_id")
    private String jobId;

    private String salary;
    @JsonProperty("commission_pct")
    private String commissionPct ;

    @JsonProperty("manager_id")
    private String managerId;
    @JsonProperty("department_id")
    private String departentId;
    public Employee() {}


    public Employee(Long employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate, String jobId, String salary, String commissionPct, String managerId, String departentId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary;
        this.commissionPct = commissionPct;
        this.managerId = managerId;
        this.departentId = departentId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(String commissionPct) {
        this.commissionPct = commissionPct;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getDepartentId() {
        return departentId;
    }

    public void setDepartentId(String departentId) {
        this.departentId = departentId;
    }
}
