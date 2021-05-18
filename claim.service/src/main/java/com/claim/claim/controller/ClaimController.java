package com.claim.claim.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claim.claim.model.Claim;
import com.claim.claim.service.ClaimService;




@RestController
@RequestMapping("/claims")
@CrossOrigin(origins = "http://localhost:3000")

public class ClaimController {
	
	@Autowired
    ClaimService claimService;

	@PostMapping("/addClaim")
	public ResponseEntity submitClaim(@RequestBody Claim claim) {
		
		try {
			claimService.submitClaim(claim);
		    return new ResponseEntity<Claim>(claim, HttpStatus.OK);
		
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} 
	
	

	
	@GetMapping("/{userID}")  
	private ResponseEntity<List<Claim>>getAllClaims(@PathVariable String userID) { 
		
		List<Claim> claim = claimService.getAllClaims(userID);
				
		
		if( claim.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();		
		}
	
	    return ResponseEntity.of(Optional.of(claim));
	
	}  
	
	   
}
