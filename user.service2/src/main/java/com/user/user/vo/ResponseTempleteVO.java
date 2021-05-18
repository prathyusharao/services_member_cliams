package com.user.user.vo;

import com.user.user.model.User;

public class ResponseTempleteVO {
	
	private User user;
	private Claim claim;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Claim getClaim() {
		return claim;
	}
	public void setClaim(Claim claim) {
		this.claim = claim;
	}
	
	public ResponseTempleteVO(User user, Claim claim) {
		super();
		this.user = user;
		this.claim = claim;
	}
	public ResponseTempleteVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
