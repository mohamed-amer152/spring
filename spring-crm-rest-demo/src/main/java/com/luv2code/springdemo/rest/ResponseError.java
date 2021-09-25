package com.luv2code.springdemo.rest;

public class ResponseError {
	
	private int status ;
	private String message ;
	private long time ;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public ResponseError(int status, String message, long time) {
		this.status = status;
		this.message = message;
		this.time = time;
	}
	
	

}
