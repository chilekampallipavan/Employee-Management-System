package com.virtusa.employeemanagment.admin.loan.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.employeemanagment.admin.loan.entity.LoanEntity;


@Repository
public interface AdminLoanRepository extends CrudRepository<LoanEntity,Integer>
{

	List<LoanEntity> findByStatus(String status);

	LoanEntity findByIdAndEmployeeId(Integer id, Integer employeeId);

}
