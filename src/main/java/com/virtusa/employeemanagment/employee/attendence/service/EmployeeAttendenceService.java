package com.virtusa.employeemanagment.employee.attendence.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.employeemanagment.employee.attendence.entity.EmployeeAttendenceEntity;
import com.virtusa.employeemanagment.employee.attendence.repository.EmployeeAttendenceRepository;
import com.virtusa.employeemanagment.employee.attendence.request.EmployeeAttendenceRequest;
import com.virtusa.employeemanagment.employee.attendence.response.EmployeeAttendenceResponse;



@Service
public class EmployeeAttendenceService {

	@Autowired
	EmployeeAttendenceRepository employeeAttendenceRepository;

	public EmployeeAttendenceResponse entry(EmployeeAttendenceRequest req) {

		EmployeeAttendenceResponse response = new EmployeeAttendenceResponse();
		EmployeeAttendenceEntity entity = new EmployeeAttendenceEntity();

		SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		Integer lastId;
		lastId = employeeAttendenceRepository.getLastId();

		if (lastId == null) {
			entity.setId(1);
		} else {
			entity.setId(lastId + 1);
		}

		entity.setEmployeeId(req.getEmployeeId());
		entity.setToDate(formatter1.format(new Date()));
		entity.setInComing(formatter2.format(new Date()));

		employeeAttendenceRepository.save(entity);

		response.setMessage("You have Entered Successfully. You can Start Your Work.");

		return response;
	}

	public EmployeeAttendenceResponse exit(EmployeeAttendenceRequest req) {

		EmployeeAttendenceResponse response = new EmployeeAttendenceResponse();
		EmployeeAttendenceEntity entity = new EmployeeAttendenceEntity();
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		entity = employeeAttendenceRepository.findByEmployeeIdAndToDate(req.getEmployeeId(),
				formatter1.format(new Date()).toString());
		
		
		entity.setOutGoing(formatter2.format(new Date()));
		employeeAttendenceRepository.save(entity);
		
		response.setMessage("You have loggedOut Successfully. You can Start Your Work From Tomorrow Morning.");
		return response;
	}

}
