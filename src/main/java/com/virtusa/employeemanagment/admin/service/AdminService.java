package com.virtusa.employeemanagment.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;
import com.virtusa.employeemanagment.admin.repository.AdminRepository;
import com.virtusa.employeemanagment.employee.employee.request.LoginRequest;
import com.virtusa.employeemanagment.employee.employee.response.LoginResponse;


@Service
public class AdminService {
	
	
	@Autowired
	AdminRepository adminRepository;
	
	
	public LoginResponse login(LoginRequest req) {
		
		EmployeeEntity entity = new EmployeeEntity();
		LoginResponse response = new LoginResponse();
		
		entity = adminRepository.findByUserName(req.getUserName());
		
		if(entity == null) {
			response.setMessage("does not exist");
		}else {
			if(!entity.getEmpType().equals("ADMIN")) {
				response.setMessage("You are not a Admin User Type");
			}else if(entity.getPassword().equals(req.getPassword())) {
				response.setMessage("You have Successfully Loggedin");
			}else {
				response.setMessage("Invalid Credentials. Please try Again");
			}
		}
		return response;		
	}

}
