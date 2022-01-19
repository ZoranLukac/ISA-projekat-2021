package com.isa2021.controller;

import java.util.List;
import java.util.Map;

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
import com.isa2021.model.Brod;
import com.isa2021.service.BrodService;

@RestController
@RequestMapping("/brodovi")
public class BrodController {

	@Autowired
	private BrodService brodService;
	
	@GetMapping("")
	public List<Brod> getAllBrod(){
		return this.brodService.brodRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Brod> getBrodById(@PathVariable(value="id") Long brodId) throws ResourceNotFoundException{
		return this.brodService.getBrodById(brodId);
	}
	
	@PostMapping("")
	public Brod createBrod(@RequestBody Brod brod) {
		return this.brodService.brodRepository.save(brod);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Brod> updateBrod(@PathVariable(value="id") Long brodId, Brod brodBody) throws ResourceNotFoundException{
		return this.brodService.updateBrod(brodId, brodBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteBrod(@PathVariable(value="id") Long brodId) throws ResourceNotFoundException{
		return this.brodService.deleteBrod(brodId);
	}
}
