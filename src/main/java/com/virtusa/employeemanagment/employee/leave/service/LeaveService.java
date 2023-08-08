package com.virtusa.employeemanagment.employee.leave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;
import com.virtusa.employeemanagment.employee.employee.repository.EmployeeRepository;
import com.virtusa.employeemanagment.employee.leave.entity.LeaveEntity;
import com.virtusa.employeemanagment.employee.leave.repository.LeaveRepository;
import com.virtusa.employeemanagment.employee.leave.request.LeaveRequest;
import com.virtusa.employeemanagment.employee.leave.response.GetLeavesResponse;
import com.virtusa.employeemanagment.employee.leave.response.LeaveResponse;



@Service
public class LeaveService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	LeaveRepository leaveRepository;
	
	public GetLeavesResponse getLeaveBalance(Integer employeeId) {
		
		EmployeeEntity entity = new EmployeeEntity();
		GetLeavesResponse response = new GetLeavesResponse();
		
		entity = employeeRepository.findByEmployeeId(employeeId);
		
		if(entity != null) {
			response.setNo_of_CasualLeaves_Balance(entity.getNo_of_CasualLeaves());
			response.setNo_of_SickLeaves_Balance(entity.getNo_of_SickLeaves());
			response.setMessage("Fetched Successfully");
		}else {
			response.setMessage("Employee does not exist");
		}
		return response;
	}

	public LeaveResponse leaveRequest(LeaveRequest req) {
		
		LeaveEntity leaveEntity = new LeaveEntity();
		LeaveResponse response = new LeaveResponse();
		
		Integer lastId;
		lastId = leaveRepository.getLastId();
		
		if(lastId == null) {
			leaveEntity.setId(1);
		}else {
			leaveEntity.setId(lastId+1);
		}

		leaveEntity.setFrom_date(req.getFrom_date());
		leaveEntity.setMobile_no(req.getMobile_no());
		leaveEntity.setReason(req.getReason());
		leaveEntity.setTo_date(req.getTo_date());
		leaveEntity.setEmployeeId(req.getEmployeeId());
		leaveEntity.setRequestStatus("P");
		
		leaveRepository.save(leaveEntity);
		
		response.setMessage("You have Successfully applied for Leave");
		
		return response;
	}

	public List<LeaveEntity> getLeaveStatus(Integer employeeId) {
	
		List<LeaveEntity> response = null;
		
		response = leaveRepository.findByEmployeeId(employeeId);
		
		return response;
	}

}
