package com.virtusa.employeemanagment.employee.leave.response;

public class GetLeavesResponse {
	
	private int no_of_SickLeaves_Balance;
	private int no_of_CasualLeaves_Balance;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getNo_of_SickLeaves_Balance() {
		return no_of_SickLeaves_Balance;
	}
	public void setNo_of_SickLeaves_Balance(int no_of_SickLeaves_Balance) {
		this.no_of_SickLeaves_Balance = no_of_SickLeaves_Balance;
	}
	public int getNo_of_CasualLeaves_Balance() {
		return no_of_CasualLeaves_Balance;
	}
	public void setNo_of_CasualLeaves_Balance(int no_of_CasualLeaves_Balance) {
		this.no_of_CasualLeaves_Balance = no_of_CasualLeaves_Balance;
	}
}
