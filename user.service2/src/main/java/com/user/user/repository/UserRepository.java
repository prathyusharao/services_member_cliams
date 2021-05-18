package com.user.user.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.user.model.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{
	
	Optional<User> findById(String id);

	//User findByUserId(String id);

}
