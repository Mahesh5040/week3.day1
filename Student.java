package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Mahesh");
	}
	
	public void studentDept() {
		System.out.println("ECE");
	}
	public void studentId() {
		System.out.println("111512");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptname();
		std.studentName();
		std.studentDept();
		std.studentId();
		
	}
}
