package com.virtusa.employeemanagment.employee.leave.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.employeemanagment.employee.leave.entity.LeaveEntity;



@Repository
public interface LeaveRepository extends CrudRepository<LeaveEntity, Integer>{


	@Query("SELECT MAX(id) FROM LeaveEntity")
	Integer getLastId();

	List<LeaveEntity> findByEmployeeId(Integer employeeId);

}
