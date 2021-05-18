package com.claim.claim.model;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="claim")
public class Claim {
	
	@Id
	private String id;
	private String memberName;
	private String provider;
	private Integer totalBill;
	private LocalDate birthdate;
	private LocalDate dateOfAdmission;
	private LocalDate dateOfDischarge;
	private String claimId;
	private String userID;
	
	
	
	public String getclaimId() {
		return claimId;
	}
	
	public void setclaimId(String claimId) {
		this.claimId = claimId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String name) {
		this.memberName = name;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public Integer getTotalBill() {
		return totalBill;
	}
	
	public void setTotalBill(Integer billAmount) {
		this.totalBill = billAmount;
	}
	
	public LocalDate getDob() {
		return birthdate;
	}
	
	public void setDob(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public LocalDate getDateOfDischarge() {
		return dateOfDischarge;
	}
	
	public void setDateOfDischarge(LocalDate dateOfDischarge) {
		this.dateOfDischarge = dateOfDischarge;
	}
	
	
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public Claim(String claimId, String memberName, String provider, Integer totalBill, LocalDate dob,
			LocalDate dateOfAdmission, LocalDate dateOfDischarge, String userID) {
		super();
		this.claimId = claimId;
		this.memberName = memberName;
		this.provider = provider;
		this.totalBill = totalBill;
		this.birthdate = birthdate;
		this.dateOfAdmission = dateOfAdmission;
		this.dateOfDischarge = dateOfDischarge;
		this.userID = userID;
	}
	
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", memberName=" + memberName + ", providerName=" + provider + ", totalBill=" + totalBill
				+ ", birthdate=" + birthdate + ", dateOfAdmission=" + dateOfAdmission + ", dateOfDischarge=" + dateOfDischarge
				+ "]";
	}
	
	

	

}
