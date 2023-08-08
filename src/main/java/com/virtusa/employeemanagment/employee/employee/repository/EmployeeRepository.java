package com.virtusa.employeemanagment.employee.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;


@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{

	EmployeeEntity findByUserName(String userName);

	EmployeeEntity findByEmployeeId(Integer employeeId);

}
