package com.virtusa.employeemanagment.employee.leave.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LEAVES")
public class LeaveEntity {
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="REASON")
	private String reason;
	
	@Column(name="FROM_DATE")
	private String from_date;
	
	@Column(name="TO_DATE")
	private String to_date;
	
	@Column(name="MOBILE_NO")
	private String mobile_no;
	
	@Column(name="LEAVE_REQUEST_STATUS")
	private String requestStatus;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
}
