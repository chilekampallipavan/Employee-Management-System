package com.virtusa.employeemanagment.employee.attendence.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.employeemanagment.employee.attendence.entity.EmployeeAttendenceEntity;



@Repository
public interface EmployeeAttendenceRepository extends CrudRepository<EmployeeAttendenceEntity, Integer>{

	@Query("SELECT MAX(id) FROM EmployeeAttendenceEntity") 
	Integer getLastId();

	EmployeeAttendenceEntity findByEmployeeIdAndToDate(Integer employeeId, String toDate);


}
