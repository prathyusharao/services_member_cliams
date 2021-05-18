package com.claim.claim.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.claim.model.Claim;
import com.claim.claim.repository.ClaimRepository;


@Service
public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	private ClaimRepository repository;
	
	@Override
	public Claim submitClaim(Claim claim) {
		
		return repository.save(claim);
	}
	

	@Override
	public Claim getClaimById(String UserID) {
		
	    Optional<Claim> claims = repository.findById(UserID);
	    
	    if(claims.isPresent()) {
	    	
	         return claims.get(); 
	         
	     }else {
	       return null;
	     }
	}
	
	public List<Claim> getAllClaims(String userID)   
	{  
	List<Claim> claims = new ArrayList<Claim>();  
	repository.findAll().forEach(claims1 -> claims.add(claims1));  
	
	return claims;
	}  


}
