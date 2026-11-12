package com.student.DAO;

import java.sql.Connection;

import com.student.model.Student;

public interface StudentDAOInterface {
	
	
	public abstract void insertStudent(Student s);
	void getStudents();
	void getStudentBYID(int stno);
	String updateStudent(int stno,Student s);
	String deleteStudent(int stno);
}
