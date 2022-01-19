package com.isa2021.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Administrator;
import com.isa2021.repository.AdministratorRepository;
import com.isa2021.service.AdministratorService;

@RestController
@RequestMapping("/admin")
public class AdministratorController {

//	@Autowired
//	private AdministratorRepository administratorRepository;
	@Autowired 
	private AdministratorService administratorService;
	
	//get all admin
	@GetMapping("")
	public List<Administrator> getAllAdministrators(){
		return this.administratorService.administratorRepository.findAll();
		//return this.administratorService.administratorRepository.findAll();
	}
	//get admin by id
	@GetMapping("/{id}")
	public ResponseEntity<Administrator> getAdministratorById(@PathVariable(value = "id") String adminId) throws ResourceNotFoundException{
		return this.administratorService.getAdministratorById(adminId);
	}
	
	//save admin
	@PostMapping("")
	public Administrator createAdministrator(@RequestBody Administrator admin) {
		return this.administratorService.administratorRepository.save(admin);
	}
	//update admin
	@PutMapping("/{id}")
	public ResponseEntity<Administrator> updateAdministrator(@PathVariable(value="id") String administratorId, @Valid @RequestBody Administrator administratorBody) throws ResourceNotFoundException{
		return this.administratorService.updateAdministrator(administratorId, administratorBody);
	}
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteAdministrator(@PathVariable(value="id") String administratorId) throws ResourceNotFoundException{
		return this.administratorService.deleteAdministrator(administratorId);
	}
	
}
