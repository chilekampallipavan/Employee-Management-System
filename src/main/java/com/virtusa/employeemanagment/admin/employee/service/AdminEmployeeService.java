package com.virtusa.employeemanagment.admin.employee.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;
import com.virtusa.employeemanagment.admin.employee.repository.AdminEmployeeRepository;



@Service
public class AdminEmployeeService {
	
	@Autowired
	private AdminEmployeeRepository empRepo;

	public Iterable<EmployeeEntity> getAll()
	{
		return empRepo.findAll();
	}

	public Optional get(Integer id)
	{
		return empRepo.findById(id);
	}
	public EmployeeEntity getByName(String name)
	{
		return empRepo.findByName(name);
	}
	//public List<EmployeeEntity>listAge(int age)
	//{
//		return empRepo.employeesWithAgeOver(age);
	//}
	public void create(EmployeeEntity emp)
	{
		empRepo.save(emp);
	}

	public void update(EmployeeEntity emp)
	{
		empRepo.save(emp);
	}

	public void delete(int id)
	{
		empRepo.deleteById(id);
	}


	}

