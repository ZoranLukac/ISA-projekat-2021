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
import com.isa2021.model.Pravilo;
import com.isa2021.service.PraviloService;

@RestController
@RequestMapping("/pravila")
public class PraviloController {

	@Autowired
	private PraviloService praviloService;
	
	@GetMapping("")
	public List<Pravilo> getAllPravila(){
		List<Pravilo> response = this.praviloService.praviloRepository.findAll();
		return response;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pravilo> getPraviloById(@PathVariable(value="id") Long praviloId) throws ResourceNotFoundException{
		return this.praviloService.getPraviloById(praviloId);
	}
	
	@PostMapping("")
	public Pravilo createPravilo(@RequestBody Pravilo pravilo) {
		return this.praviloService.praviloRepository.save(pravilo);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Pravilo> updatePravilo(@PathVariable(value="id") Long praviloId, @Valid @RequestBody Pravilo praviloBody) throws ResourceNotFoundException{
		return this.praviloService.updatePravilo(praviloId, praviloBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deletePravilo(@PathVariable(value="id") Long praviloId) throws ResourceNotFoundException{
		return this.praviloService.deletePravilo(praviloId);
	}
}
