package com.employee_crud_operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_crud_operation.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
