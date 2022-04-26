package com.te.Basic.collection;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;
	int studentAge;
	int studentMarks;
	
	public Student(int studentId, String studentName, String studentAddress, int studentAge, int studentMarks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "S[studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentAge=" + studentAge + ", studentMarks=" + studentMarks + "]";
	}
	
}
