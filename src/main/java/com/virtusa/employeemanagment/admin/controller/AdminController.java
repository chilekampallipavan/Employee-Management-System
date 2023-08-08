package com.virtusa.employeemanagment.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.employeemanagment.admin.service.AdminService;
import com.virtusa.employeemanagment.employee.employee.request.LoginRequest;
import com.virtusa.employeemanagment.employee.employee.response.LoginResponse;



@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
		
	@PostMapping("/admin/login")
	public LoginResponse login(@RequestBody LoginRequest req) {
		return adminService.login(req);
	}
		
	 
}
