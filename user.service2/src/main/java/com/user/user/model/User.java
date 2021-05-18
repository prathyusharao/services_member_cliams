package com.user.user.model;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.google.common.base.Objects;


@Document(collection="user")
public class User {
	
	
	@Id
	private String userID;
	private String memberName;
	private String password;
	private String memberEmail;
	private String address;
	private String state;
	private String country;
	private String pan;
	private String contact;
	private LocalDate birthdate;
	private String claimId;
	private boolean loggedIn;

	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
	
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state= state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String email) {
		this.memberEmail = email;
	}
	
	public String getPan() {
		return pan;
	}
	
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
	
	public User(String userID, String memberName, String address, String state, String country, String memberEmail, String pan, String contact,
			LocalDate birthdate, String password, String claimId) {
		super();
		this.userID = userID;
		this.memberName = memberName;
		this.address = address;
		this.state = state;
		this.country = country;
		this.memberEmail = memberEmail;
		this.pan = pan;
		this.contact = contact;
		this.birthdate = birthdate;
		this.password = password;
		this.claimId = claimId;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User( String memberEmail, String memberName,  String password) {
		
		this.memberEmail = memberEmail;
        this.password = password;
        this.memberName = memberName;
       this.loggedIn = false;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equal(memberEmail, user.memberEmail) &&
                Objects.equal(password, user.password);
    }
    
	@Override
	public String toString() {
		return "User [name=" + memberName + ", password=" + password + ", loggedIn=" + loggedIn + ", memberName " + memberName +"]";
	}
  

	
	
	
	

}
