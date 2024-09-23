package com.employee_crud_operation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_crud_operation.exception.EmployeeNotFoundException;
import com.employee_crud_operation.models.Employee;
import com.employee_crud_operation.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// Get all employees
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// Get Single employee
	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
	}

	// Create a new employee
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	// Update Employee
	@Override
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));

		employee.setName(employeeDetails.getName());
		employee.setPosition(employeeDetails.getPosition());
		employee.setSalary(employeeDetails.getSalary());

		return employeeRepository.save(employee);
	}

	// Delete Employee
	@Override
	public void deleteEmployee(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
		employeeRepository.delete(employee);
	}

}
