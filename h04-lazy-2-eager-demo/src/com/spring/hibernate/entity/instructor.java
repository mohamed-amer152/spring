package com.spring.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private int id;
	
	@Column(name ="first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name;
	
	@Column(name ="email")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private instructor_detail instructor_detail_id;
	
	//      we will use the lazy fetch

	@OneToMany(mappedBy = "instructor_id",
			cascade = {CascadeType.MERGE ,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Courses> courslist ;
	

	public instructor(String first_name, String last_name, String email) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}


	public instructor() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public instructor_detail getInstructor_detail_id() {
		return instructor_detail_id;
	}


	public void setInstructor_detail_id(instructor_detail instructor_detail_id) {
		this.instructor_detail_id = instructor_detail_id;
	}

	
	

	public List<Courses> getCourslist() {
		return courslist;
	}


	public void setCourslist(List<Courses> courslist) {
		this.courslist = courslist;
	}


	@Override
	public String toString() {
		return "instructor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ "]";
	}
	
	
	
	
	public void addlist(Courses tempcourse)
	{
		if (courslist != null) {
			courslist = new  ArrayList<Courses>();
			
			courslist.add(tempcourse);
			
			tempcourse.setInstructor_id(this);
			
			courslist.clear();
		}
		
		
	}
	
	
	
}
