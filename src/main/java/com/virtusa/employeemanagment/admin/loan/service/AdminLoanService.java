package com.virtusa.employeemanagment.admin.loan.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.employeemanagment.admin.loan.entity.LoanEntity;
import com.virtusa.employeemanagment.admin.loan.repository.AdminLoanRepository;
import com.virtusa.employeemanagment.admin.loan.response.AdminLoanApproveResponse;



@Service
public class AdminLoanService
{

	@Autowired
	private AdminLoanRepository loanRepo;

	public List<LoanEntity> getLoan(String status) {
		
		List<LoanEntity> response =  null;
		
		response = loanRepo.findByStatus(status);

		return response;
	}

	public AdminLoanApproveResponse approveLoan(Integer id,Integer employeeId) {

		AdminLoanApproveResponse response =  new AdminLoanApproveResponse();
		LoanEntity entity =  new LoanEntity();
		
		entity = loanRepo.findByIdAndEmployeeId(id,employeeId);
		
		entity.setStatus("A");
		loanRepo.save(entity);
		
		response.setMessage("You have Approved Loan Request Successfully");
		return response;
	}
	
	
}
