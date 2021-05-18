package com.user.user.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user.model.User;
import com.user.user.repository.UserRepository;
import com.user.user.service.UserService;
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
    UserService userService;
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/add")
	public ResponseEntity registerUser(@RequestBody User user) {
		try {
		
			userService.saveUser(user);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} 
	
    @PostMapping("/login")
	public ResponseEntity<User> loginUser(@Valid @RequestBody User user) {
	    List<User> users = repository.findAll();
	    
	    for (User other : users) {
	    	
	         if (other.equals(user)) {
	        	 
	            user.setLoggedIn(true);
	            user.setMemberName( other.getMemberName());
	            user.setBirthdate(other.getBirthdate());
	            user.setUserID(other.getUserID());
	            user.setCountry(other.getCountry());
	            user.setState(other.getState());
	            user.setAddress(other.getAddress());
	            user.setContact(other.getContact());
	            user.setPan(other.getPan());
	            
	            return new ResponseEntity<User>(user, HttpStatus.OK);
	          }
	     }
	        return new ResponseEntity<User>( HttpStatus.UNAUTHORIZED);
	  }
	
	
    @GetMapping("/{id}")
    public User findMemberById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity updateMemberById(@PathVariable String id, @RequestBody User user){
    	try {
             userService.updateUser(id, user);
             return ResponseEntity.ok().body(user);
        } catch (Exception e) {
        	
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        	
        }
    
 

}
