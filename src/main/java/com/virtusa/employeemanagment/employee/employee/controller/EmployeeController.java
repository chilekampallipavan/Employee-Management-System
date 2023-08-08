 package com.virtusa.employeemanagment.employee.employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.employeemanagment.employee.employee.request.LoginRequest;
import com.virtusa.employeemanagment.employee.employee.response.LoginResponse;
import com.virtusa.employeemanagment.employee.employee.response.LogoutResponse;
import com.virtusa.employeemanagment.employee.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee/login")
	public LoginResponse login(@RequestBody LoginRequest req) {
		return employeeService.login(req);	
	}
	
	@PostMapping("/employee/logout/{employeeId}")
	public LogoutResponse logout(@PathVariable Integer employeeId) {
		return employeeService.logout(employeeId);	
	}
}
