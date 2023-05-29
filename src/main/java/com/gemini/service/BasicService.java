package com.gemini.service;

import com.gemini.dao.EmployeeDao;
import com.gemini.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicService {
    @Autowired
    private EmployeeDao employeeDao;

    /**
     * Get all employees return the employees list
     * @return
     */
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    /**
     * Get employee will return the employee with emp id
     * @param employeeId
     * @return
     */
    public Employee getEmployee(final int employeeId) {
        return employeeDao.findById(employeeId).orElseThrow(
                () -> new IllegalArgumentException("Employee Id: " + employeeId + " not found")
        );
    }

    /**
     * Add a new employee in the list
     * @param employee
     */
    public void saveEmployee(final Employee employee) {
        employeeDao.save(employee);
    }
}
