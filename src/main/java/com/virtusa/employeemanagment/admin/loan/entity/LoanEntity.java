package com.virtusa.employeemanagment.admin.loan.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table( name = "LOAN")
public class LoanEntity 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Integer id;
	
	@Column(name= "EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name= "LOAN_TYPE")
	private String loanType;
	
	@Column(name= "REASON")
	private String reason;
	
	@Column(name= "DEAD_LINE")
	private String deadLine;
	
	@Column(name= "EMP_MOBILE_NUMBER")
	private String employeeMobileNumber;
	
	@Column(name= "EMPLOYEE_ADDRESS")
	private String employeeAddress;
	
	@Column(name= "STATUS")
	private String status;
	
	@Column(name= "AMOUNT")
	private Integer amount;
	
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}

	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
}

