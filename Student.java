package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Name of student is");
	}
	public void studentDept() {
		System.out.println("department of student is");
	}
	public void studentId() {
		System.out.println("Id of student is");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.studentDept();
		st.studentId();
		st.studentName();
		st.deptName();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();

	}

}
