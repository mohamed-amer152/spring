package com.spring.hibernate.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Courses {
	@Id
	@Column(name="id")
	private int id ;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne(cascade = {CascadeType.MERGE ,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="instructor_id")
	private instructor instructor_id ;
	
	@OneToMany(cascade = CascadeType.ALL )
	@JoinColumn(name="course_id" , nullable = false)
	private  List<Reviews> reviewlist ;

	@ManyToMany(fetch = FetchType.LAZY,
			  cascade ={CascadeType.MERGE ,
						CascadeType.DETACH,
						CascadeType.PERSIST,
						CascadeType.REFRESH})
		@JoinTable(name="course_student",
				joinColumns =@JoinColumn(name="course_id"),
				inverseJoinColumns = @JoinColumn(name="student_id")
				)
	private List<Student> studentlist ;
	
	
	public Courses ()
	{}


	public Courses(String title) {
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public instructor getInstructor_id() {
		return instructor_id;
	}


	public void setInstructor_id(instructor instructor_id) {
		this.instructor_id = instructor_id;
	}


	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + "]";
	}


	public java.util.List<Reviews> getReviewlist() {
		return reviewlist;
	}


	public void setReviewlist(java.util.List<Reviews> reviewlist) {
		this.reviewlist = reviewlist;
	}
	
	
	
	
	
	public List<Student> getStudentlist() {
		return studentlist;
	}


	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}


	public void addreviews(Reviews tempreviews)
	{
		if (reviewlist == null) {
			reviewlist = new ArrayList();
			
		}
		
		reviewlist.add(tempreviews);
		
	}
	
	public void addstudent(Student temprestudent)
	{
		if (studentlist == null) {
			studentlist = new ArrayList<Student>();
			
		}
		
		studentlist.add(temprestudent);
		
	}
	
	
}
