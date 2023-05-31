package com.gemini.controller;

import com.gemini.entities.Employee;
import com.gemini.service.BasicService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/v1/basic")
public class BasicController {

    @Autowired
    private BasicService basicService;

    /**
     * Get All Employees API
     * @return
     */
    @Operation(operationId = "getAllEmployees", summary = "Get a list of all the employees")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Employees"),
            @ApiResponse(responseCode = "5XX", description = "Mayday Mayday Mayday!!")})
    @GetMapping(produces = "application/json")
    public List<Employee> getAllEmployees() {
        return basicService.getAllEmployees();
    }

    /**
     * Get All Employees API
     * @return
     */
    @Operation(operationId = "getEmployee", summary = "Get employee with employee id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the Employee"),
            @ApiResponse(responseCode = "400", description = "Employee with given id not found"),
            @ApiResponse(responseCode = "5XX", description = "Mayday Mayday Mayday!!")})
    @GetMapping(value = "{employeeId}", produces = "application/json")
    public Employee getEmployee(@Parameter(description = "Employee Id of the employee")
                                    @PathVariable final int employeeId) {
        return basicService.getEmployee(employeeId);
    }

    /**
     * Get All Employees API
     * @return
     */
    @Operation(operationId = "saveEmployee", summary = "Add new employee into the list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Successfully Added the Employees"),
            @ApiResponse(responseCode = "5XX", description = "Mayday Mayday Mayday!!")})
    @PostMapping(produces = "application/json")
    public ResponseEntity<Object> saveEmployee(@Parameter(description = "Employee details")
                                                   @RequestBody final Employee employee) {
        basicService.saveEmployee(employee);
        return ResponseEntity.noContent().build();
    }
}
