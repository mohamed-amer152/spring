package com.spring.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	

	public Courses ()
	{}


	public Courses(String title) {
		super();
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
	
	
	
	
	
}
