package com.virtusa.employeemanagment.employee.attendence.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_ATTENDENCE")
public class EmployeeAttendenceEntity {
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="IN_COMING")
	private String inComing;
	
	@Column(name="OUT_GOING")
	private String outGoing;
	
	@Column(name="TO_DATE")
	private String toDate;

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

	public String getInComing() {
		return inComing;
	}

	public void setInComing(String inComing) {
		this.inComing = inComing;
	}

	public String getOutGoing() {
		return outGoing;
	}

	public void setOutGoing(String outGoing) {
		this.outGoing = outGoing;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
