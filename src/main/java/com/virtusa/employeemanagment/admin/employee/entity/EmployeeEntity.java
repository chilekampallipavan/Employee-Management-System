package com.virtusa.employeemanagment.admin.employee.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RECORD_ID")
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="TYPE")
	private String empType;
	
	@Column(name="MAIL")
	private String mail;
	
	@Column(name="SALARY")
	private double salary;
	
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="SICKLEAVES")
	private int no_of_SickLeaves;
	
	@Column(name="CASUALLEAVES")
	private int no_of_CasualLeaves;
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNo_of_SickLeaves() {
		return no_of_SickLeaves;
	}

	public void setNo_of_SickLeaves(int no_of_SickLeaves) {
		this.no_of_SickLeaves = no_of_SickLeaves;
	}

	public int getNo_of_CasualLeaves() {
		return no_of_CasualLeaves;
	}

	public void setNo_of_CasualLeaves(int no_of_CasualLeaves) {
		this.no_of_CasualLeaves = no_of_CasualLeaves;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

}





