package com.isa2021.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.GenericUser;
import com.isa2021.service.GenericUserService;

@RestController
@RequestMapping("/users")
public class GenericUserController {
	@Autowired
	private GenericUserService genericUserService;
	
	@GetMapping("")
	public List<GenericUser> getAllGenericUser(){
		return this.genericUserService.genericUserRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GenericUser> getGenericUserById(@PathVariable(value="id") String userId) throws ResourceNotFoundException{
		return this.genericUserService.getGenericUserById(userId);
	}
	
	@PostMapping("")
	public GenericUser createGenericUser(@RequestBody GenericUser genericUser) {
		return this.genericUserService.genericUserRepository.save(genericUser);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<GenericUser> updateGenericUser(@PathVariable(value="id") String userId, @Valid @RequestBody GenericUser genericUserBody) throws ResourceNotFoundException{
		return this.genericUserService.updateGenericUser(userId, genericUserBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteGenericUser(@PathVariable(value="id") String userId) throws ResourceNotFoundException{
		return this.genericUserService.deleteGenericUser(userId);
	}
}
