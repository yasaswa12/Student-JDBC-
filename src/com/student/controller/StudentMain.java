package com.student.controller;

import com.student.DAO.StudentDAO;
import com.student.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s=new Student();
		s.setStno(7);
		s.setStname("shannu");
		s.setMarks(100);
		StudentDAO st=new StudentDAO();
		//st.insertStudent(s);
		st.getStudents();
		//st.getStudentBYID(7);
		//String status=st.updateStudent(7,s);
		//System.out.println(status);
		st.getStudentBYID(3);
		//System.out.println(st.deleteStudent(6));
	}

}
