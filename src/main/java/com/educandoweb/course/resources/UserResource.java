package com.educandoweb.course.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list = new ArrayList<>();
		
		User user = new User(1L, "Bob", "bob@email.com", "9999999", "1213424");
		User user2 = new User(2L, "Alex", "alex@email.com", "89898989", "3242342");
		
		list.add(user2);
		list.add(user);
		
		return ResponseEntity.ok().body(list);
	}
	
}
