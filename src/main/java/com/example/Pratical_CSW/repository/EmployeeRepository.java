package com.example.Pratical_CSW.repository;

import com.example.Pratical_CSW.jpa.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
