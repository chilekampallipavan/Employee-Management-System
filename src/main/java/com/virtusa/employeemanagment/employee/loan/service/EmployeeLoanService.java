package com.virtusa.employeemanagment.employee.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.employeemanagment.admin.loan.entity.LoanEntity;
import com.virtusa.employeemanagment.employee.loan.repository.EmployeeLoanRepository;
import com.virtusa.employeemanagment.employee.loan.request.EmployeeLoanRequest;
import com.virtusa.employeemanagment.employee.loan.response.EmployeeLoanResponse;



@Service
public class EmployeeLoanService 
{
     
	@Autowired
	private EmployeeLoanRepository empLoanRepo;
	
	public List<LoanEntity>  getEmployeeLoanStatus(Integer employeeId){
          List<LoanEntity> response =  null;
		
		response = empLoanRepo.findByEmployeeId(employeeId);

		return response;
	}

	public EmployeeLoanResponse employeeLoanApply(EmployeeLoanRequest req) {

		EmployeeLoanResponse response =  new EmployeeLoanResponse();
		LoanEntity entity =  new LoanEntity();
		
		entity.setDeadLine(req.getDeadLine());
		entity.setEmployeeAddress(req.getEmployeeAddress());
		entity.setEmployeeId(req.getEmployeeId());
		entity.setEmployeeMobileNumber(req.getEmployeeMobileNumber());
		entity.setLoanType(req.getLoanType());
		entity.setReason(req.getReason());
		entity.setStatus("P");
		empLoanRepo.save(entity);
		
		response.setMessage("Your Loan Request is pending ");
		return response;
	}	
		
}

