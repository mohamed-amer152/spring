package com.mohamed.rest.error;

public class ResponseError {
	
	private String message ;
	private int staus ;
	private long time ;
	
	public ResponseError() {}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	


	public int getStaus() {
		return staus;
	}

	public void setStaus(int staus) {
		this.staus = staus;
	}

	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}



}
