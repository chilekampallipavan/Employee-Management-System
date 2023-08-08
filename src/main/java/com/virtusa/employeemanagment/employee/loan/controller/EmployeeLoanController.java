package com.virtusa.employeemanagment.employee.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.employeemanagment.admin.loan.entity.LoanEntity;
import com.virtusa.employeemanagment.employee.loan.request.EmployeeLoanRequest;
import com.virtusa.employeemanagment.employee.loan.response.EmployeeLoanResponse;
import com.virtusa.employeemanagment.employee.loan.service.EmployeeLoanService;



@RestController
public class EmployeeLoanController 
{
	
	@Autowired
	private EmployeeLoanService empLoanSer;
	
	@GetMapping("/loanBank/{employeeId}")
	public List<LoanEntity> getEmployeeLoanStatus(@PathVariable Integer employeeId){
		return empLoanSer.getEmployeeLoanStatus(employeeId);
	}
	
	@PostMapping("/loanBank/employeeLoanApply")
	public EmployeeLoanResponse employeeLoanApply(@RequestBody EmployeeLoanRequest req)
	{
		return empLoanSer.employeeLoanApply(req);
	}

}
