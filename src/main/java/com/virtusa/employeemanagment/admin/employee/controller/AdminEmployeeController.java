package com.virtusa.employeemanagment.admin.employee.controller;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.employeemanagment.admin.employee.entity.EmployeeEntity;
import com.virtusa.employeemanagment.admin.employee.service.AdminEmployeeService;



@RestController
public class AdminEmployeeController {
	
	@Autowired
	private AdminEmployeeService empSer;
	
	@GetMapping("/employees")
	public Iterable<EmployeeEntity> list(){
		return empSer.getAll();
	}
	
	@GetMapping("/employee/{id}")
	public Optional getemployeedetails(@PathVariable ("id") Integer id){
		return empSer.get(id);
	}
	
	@GetMapping("/employeeByName/{name}")
	public EmployeeEntity getemployee(@PathVariable ("name") String name){
		return empSer.getByName(name);
	}
	
	@PostMapping("/addEmployee")
	public void addemployee(@RequestBody EmployeeEntity employee) {
		 empSer.create(employee);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public void updateEmployee(@PathVariable Integer id,@RequestBody EmployeeEntity employee) {
		//EmployeeEntity emp1=empSer.get(id);
		 empSer.update(employee);
		
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		 empSer.delete(id);
	}
}


	
	
	


