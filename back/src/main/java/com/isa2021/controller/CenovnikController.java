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
import com.isa2021.model.Cenovnik;
import com.isa2021.service.CenovnikService;

@RestController
@RequestMapping("/cenovnik")
public class CenovnikController {

	@Autowired
	public CenovnikService cenovnikService;
	
	@GetMapping("")
	private List<Cenovnik> getAllCenovnik(){
		return this.cenovnikService.cenovnikRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cenovnik> getCenovnikById(@PathVariable(value="id") Long cenovnikId) throws ResourceNotFoundException{
		return this.cenovnikService.getCenovnikById(cenovnikId);
	}
	
	@PostMapping("")
	public Cenovnik createCenovnik(@RequestBody Cenovnik cenovnik) {
		return this.cenovnikService.cenovnikRepository.save(cenovnik);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cenovnik> updateCenovnik(@PathVariable(value="id") Long cenovnikId, Cenovnik cenovnikBody) throws ResourceNotFoundException{
		return this.cenovnikService.updateCenovnik(cenovnikId, cenovnikBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteCenovnik(@PathVariable(value="id") Long cenovnikId) throws ResourceNotFoundException{
		return this.cenovnikService.deleteCenovnik(cenovnikId);
	}
}
