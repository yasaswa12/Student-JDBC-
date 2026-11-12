package com.student.model;

public class Student {
public Student(){
		
	}
	
	public Student(int stno, String stname, int marks) {
		super();
		this.stno = stno;
		this.stname = stname;
		this.marks = marks;
	}
	private int stno;
	private String stname;
	private int marks;
	
	public int getStno() {
		return stno;
	}

	public void setStno(int stno) {
		this.stno = stno;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
