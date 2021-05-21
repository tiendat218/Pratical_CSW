package com.example.Pratical_CSW.service;

import com.example.Pratical_CSW.jpa.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> listEmployee();
    Employee getEmployeeById(int id);
    boolean saveEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
}
