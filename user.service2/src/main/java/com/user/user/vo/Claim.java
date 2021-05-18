package com.user.user.vo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Claim {
	
	private String claimId;
	private String name;
	private String providerName;
	private Integer billAmount;
	private LocalDate dob;
	private LocalDate dateOfAdmission;
	private LocalDate dateOfDischarge;

}
