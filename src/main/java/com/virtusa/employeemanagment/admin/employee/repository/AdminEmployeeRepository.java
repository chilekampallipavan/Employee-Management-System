package com.virtusa.employeemanagment.admin.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;




public interface AdminEmployeeRepository extends CrudRepository<EmployeeEntity,Integer>{
	public EmployeeEntity findByName(String name);
	
}
