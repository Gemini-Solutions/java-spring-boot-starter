package com.gemini.service;

import com.gemini.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicService {
    private List<Employee> employees = new ArrayList<>();

    /**
     * Get all employees return the employees list
     * @return
     */
    public List<Employee> getAllEmployees() {
        return employees;
    }

    /**
     * Get employee will return the employee with emp id
     * @param employeeId
     * @return
     */
    public Employee getEmployee(final int employeeId) {
        return employees.stream().filter(emp -> emp.getId() == employeeId).findFirst().orElseThrow(
                () -> new IllegalArgumentException("Employee Id: " + employeeId + " not found")
        );
    }

    /**
     * Add a new employee in the list
     * @param employee
     */
    public void saveEmployee(final Employee employee) {
        employees.add(employee);
    }
}
