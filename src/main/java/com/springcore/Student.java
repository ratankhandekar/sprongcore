package com.springcore;

public class Student {
	
	private int studentid;
	private String StudentName;
	private String StudentAddress;
	
	
	
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
	
	public Student(int studentid, String studentName, String studentAddress) {
		super();
		this.studentid = studentid;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	

}
