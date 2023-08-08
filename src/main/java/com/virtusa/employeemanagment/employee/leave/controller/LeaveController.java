package com.virtusa.employeemanagment.employee.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.employeemanagment.employee.leave.entity.LeaveEntity;
import com.virtusa.employeemanagment.employee.leave.request.LeaveRequest;
import com.virtusa.employeemanagment.employee.leave.response.GetLeavesResponse;
import com.virtusa.employeemanagment.employee.leave.response.LeaveResponse;
import com.virtusa.employeemanagment.employee.leave.service.LeaveService;


@RestController
public class LeaveController {
	
	@Autowired
	LeaveService leaveService;
	
	@GetMapping("/leave/getLeaves/{employeeId}")
	public GetLeavesResponse getLeaveBalance(@PathVariable Integer employeeId) {
		return leaveService.getLeaveBalance(employeeId);
	}
	
	@PostMapping("/leave/leaveRequest")
	public LeaveResponse leaveRequest(@RequestBody LeaveRequest req) {
		return leaveService.leaveRequest(req);
	}
	
	@GetMapping("/leave/getLeaveStatus/{employeeId}")
	public List<LeaveEntity> getLeaveStatus(@PathVariable Integer employeeId) {
		return leaveService.getLeaveStatus(employeeId);
	}

}
