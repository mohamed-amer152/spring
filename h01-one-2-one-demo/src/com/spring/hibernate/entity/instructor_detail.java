package com.spring.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class instructor_detail {
	
	// antotae the class as entity 
	
	//create fileds 
	
	// anotate fileds to mapped the db
	
	// create costroctors
	
	// getter and seteer 
	
	
	// tostring method
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id ;
	@Column(name="youtube_channel")
	private String 	youtube_channel ;
	@Column(name="hobby")
	private String hobby ;
	
	
	public  instructor_detail()
	{}


	public instructor_detail(String youtube_channel, String hobby) {
		this.youtube_channel = youtube_channel;
		this.hobby = hobby;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getYoutube_channel() {
		return youtube_channel;
	}


	public void setYoutube_channel(String youtube_channel) {
		this.youtube_channel = youtube_channel;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	@Override
	public String toString() {
		return "instructor_detail [id=" + id + ", youtube_channel=" + youtube_channel + ", hobby=" + hobby + "]";
	}
	
	
	

}
