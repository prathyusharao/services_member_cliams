package com.claim.claim.service;

import java.util.List;

import com.claim.claim.model.Claim;

public interface ClaimService {
	
	Claim submitClaim(Claim claim);
	Claim getClaimById(String userID);
	List<Claim> getAllClaims(String userID);

}
