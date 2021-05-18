package com.claim.claim.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.claim.claim.model.Claim;

@Repository
public interface ClaimRepository extends MongoRepository<Claim, String>{
	
	Optional<Claim> findById(String userID);

}
