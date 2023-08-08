   package com.virtusa.employeemanagment.employee.employee.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;
import com.virtusa.employeemanagment.employee.employee.repository.EmployeeRepository;
import com.virtusa.employeemanagment.employee.employee.request.LoginRequest;
import com.virtusa.employeemanagment.employee.employee.response.LoginResponse;
import com.virtusa.employeemanagment.employee.employee.response.LogoutResponse;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public LoginResponse login(LoginRequest req) {
		
		EmployeeEntity entity = new EmployeeEntity();
		LoginResponse response = new LoginResponse();
		
		entity = employeeRepository.findByUserName(req.getUserName());
		
		if(entity == null) {
			response.setMessage("Employee does not exist");
		}else {
			if(!entity.getEmpType().equals("EMPLOYEE")) {
				response.setMessage("You are not a Employee User Type");
			}else if(entity.getPassword().equals(req.getPassword())) {
				response.setMessage("You have Successfully Loggedin");
			}else {
				response.setMessage("Invalid Credentials. Please try Again");
			}
		}
		return response;		
	}

	public LogoutResponse logout(Integer employeeId) {
		LogoutResponse response = new LogoutResponse();
		response.setMessage("You have Successfully Loggedout");
		return response;
	}
}