package model;

import java.util.List;

public class Course {

	private List<Student> students;
	private String name;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(List<Student> students, String name) {
		super();
		this.students = students;
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public String getName() {
		return name;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setName(String name) {
		this.name = name;
	}
}