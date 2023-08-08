package com.virtusa.employeemanagment.admin.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.employeemanagment.admin.loan.entity.LoanEntity;
import com.virtusa.employeemanagment.admin.loan.response.AdminLoanApproveResponse;
import com.virtusa.employeemanagment.admin.loan.service.AdminLoanService;




@RestController
public class AdminLoanController
{
	@Autowired
	private AdminLoanService loanSer;
	
	@GetMapping("/loanBank/{status}")
	public List<LoanEntity> getLoan(@PathVariable ("status") String status){
		return loanSer.getLoan(status);
	}
	
	@PostMapping("/loanBank/{id}/{employeeId}")
	public AdminLoanApproveResponse approveLoan(@PathVariable ("id") Integer id,@PathVariable ("employeeId") Integer employeeId){
		return loanSer.approveLoan(id,employeeId);
	}
	
}
