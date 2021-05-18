package com.user.user.service;
import org.springframework.http.ResponseEntity;
import com.user.user.model.User;
import com.user.user.repository.UserRepository;
import com.user.user.vo.ResponseTempleteVO;


public interface UserService {
	
	User saveUser(User user);
	User getUserById(String id);
	ResponseEntity updateUser(String id, User user);
	

}
