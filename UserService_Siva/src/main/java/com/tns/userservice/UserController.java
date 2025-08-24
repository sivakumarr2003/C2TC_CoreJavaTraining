package com.tns.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/userservice")
	public void add(@RequestBody User user)
	{
		service.insertRecord(user);
	}
	
	@GetMapping("/userservice")
	public List<User> ShowAll()
	{
		return service.getAllRecords();
	}
	
	@GetMapping("/userservice/{id}")
	public User getUserById(@PathVariable Integer id)
	{
		return service.getUserById(id);
	}
	
	@DeleteMapping("/userservice/{id}")
	public void deleteUser(@PathVariable Integer id)
	{
		service.deleteUser(id);
	}
	
	@PutMapping("/userservice/{id}")
	public ResponseEntity<String> updateUser(@PathVariable Integer id,@RequestBody User updatedUser)
	{
		service.updateUser(id,updatedUser);
		return ResponseEntity.ok("User updated Successfully");
	}

}
