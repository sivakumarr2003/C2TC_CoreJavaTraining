package com.tns.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService 
{
	
	@Autowired
	private UserRepository repo;
	
	//Get all the records from the table
	public void insertRecord(User user)
	{
		repo.save(user);
	}
	
	//Show all the records from the table in database
	public List<User> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public User getUserById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteUser(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateUser(Integer id,User updateUser)
	{
		User existingUser=repo.findById(id).orElse(null);
		if(existingUser!=null)
		{
			existingUser.setUserid(updateUser.getUserid());
			existingUser.setUsername(updateUser.getUsername());
			existingUser.setAddress(updateUser.getAddress());
			existingUser.setEmail(updateUser.getEmail());
			existingUser.setPassword(updateUser.getPassword());
			existingUser.setSalary(updateUser.getSalary());
			repo.save(existingUser);
		}
	}
	
	

}
