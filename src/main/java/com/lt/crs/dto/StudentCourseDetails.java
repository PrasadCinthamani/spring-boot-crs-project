package com.lt.crs.dto;

import com.lt.crs.model.Course;
import com.lt.crs.model.Professor;
import com.lt.crs.model.Student;
import com.lt.crs.model.StudentGrade;

/**
 * @author Abdul,Sai kumar,Rohan,Siva,Nikhil
 *
 */
public class StudentCourseDetails {
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	private Student student;
	private Course course;
	private Professor professor;
	public StudentGrade getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(StudentGrade studentGrade) {
		this.studentGrade = studentGrade;
	}
	private StudentGrade studentGrade;

}
