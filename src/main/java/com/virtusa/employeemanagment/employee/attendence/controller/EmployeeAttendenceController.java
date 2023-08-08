package com.virtusa.employeemanagment.employee.attendence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.employeemanagment.employee.attendence.request.EmployeeAttendenceRequest;
import com.virtusa.employeemanagment.employee.attendence.response.EmployeeAttendenceResponse;
import com.virtusa.employeemanagment.employee.attendence.service.EmployeeAttendenceService;





@RestController
public class EmployeeAttendenceController {
	
	@Autowired
	EmployeeAttendenceService employeeAttendenceService;
	
	@PostMapping("/attendence/entry")
	public EmployeeAttendenceResponse entry(@RequestBody EmployeeAttendenceRequest req) {
		return employeeAttendenceService.entry(req);
	}
	
	@PostMapping("/attendence/exit")
	public EmployeeAttendenceResponse exit(@RequestBody EmployeeAttendenceRequest req) {
		return employeeAttendenceService.exit(req);
	}

}
