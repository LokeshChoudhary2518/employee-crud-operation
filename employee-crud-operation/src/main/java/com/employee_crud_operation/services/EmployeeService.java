package com.employee_crud_operation.services;

import java.util.List;
import java.util.Optional;

import com.employee_crud_operation.models.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long id);

	public Employee createEmployee(Employee employee);

	public Employee updateEmployee(Long id, Employee employeeDetails);

	public void deleteEmployee(Long id);
}
