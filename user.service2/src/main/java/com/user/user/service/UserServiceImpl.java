package com.user.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.user.model.User;
import com.user.user.repository.UserRepository;
import com.user.user.vo.Claim;
import com.user.user.vo.ResponseTempleteVO;

@Service
public class UserServiceImpl implements UserService {
	

	@Autowired
	private UserRepository repository;
	
	

	@Override
	public User saveUser(User user) {
		
		return repository.save(user);
	}

	@Override
	public User getUserById(String id) {
		
	    Optional<User> user = repository.findById(id);
	    
	    if(user.isPresent()) {
	    	
	         return user.get(); 
	         
	     }else {
	       return null;
	     }
	}

	@Override
	public ResponseEntity updateUser(String userId, User user) {
		
		 Optional<User> userOptional = repository.findById(userId);
		 
	     if(!userOptional.isPresent())
	    	 return ResponseEntity.notFound().build();	
	     
	     user.setUserID(userId);
	     
	     repository.save(user);
	     
	     return ResponseEntity.noContent().build();	     

	}

	

}
