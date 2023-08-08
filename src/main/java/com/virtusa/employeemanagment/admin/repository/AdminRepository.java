 package com.virtusa.employeemanagment.admin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;



@Repository
public interface AdminRepository extends CrudRepository<EmployeeEntity, Integer>{

	EmployeeEntity findByUserName(String userName);

}