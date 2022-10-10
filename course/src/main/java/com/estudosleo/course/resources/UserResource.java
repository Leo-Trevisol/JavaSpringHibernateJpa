package com.estudosleo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosleo.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user = new User(1L, "leo", "leo@gmail.com", "9999999", "1234");
		
		return ResponseEntity.ok().body(user);
		
	}
	
	
	
	

}
