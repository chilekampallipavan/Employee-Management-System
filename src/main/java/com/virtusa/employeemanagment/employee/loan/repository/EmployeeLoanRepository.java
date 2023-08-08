package com.virtusa.employeemanagment.employee.loan.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.employeemanagment.admin.loan.entity.LoanEntity;



public interface EmployeeLoanRepository extends CrudRepository<LoanEntity,Integer>{

	List<LoanEntity> findByEmployeeId(Integer employeeId);


}
