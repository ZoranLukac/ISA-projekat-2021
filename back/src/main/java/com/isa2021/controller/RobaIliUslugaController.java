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
import com.isa2021.model.RobaIliUsluga;
import com.isa2021.repository.RobaIliUslugaRepository;
import com.isa2021.service.RobaIliUslugaService;

@RestController
@RequestMapping("/robausluga")
public class RobaIliUslugaController {
	
	@Autowired 
	private RobaIliUslugaService robaIliUslugaService;
	
	@GetMapping("")
	public List<RobaIliUsluga> getAllRobaIliUsluga(){
		return this.robaIliUslugaService.robaIliUslugaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RobaIliUsluga> getRobaIliUslugaById(@PathVariable(value = "id") Long robaUslugaId) throws ResourceNotFoundException{
		return this.robaIliUslugaService.getRobaIliUslugaById(robaUslugaId);
	}
	
	@PostMapping("")
	public RobaIliUsluga createRobaIliUsluga(@RequestBody RobaIliUsluga robaUsluga) {
		return this.robaIliUslugaService.robaIliUslugaRepository.save(robaUsluga);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<RobaIliUsluga> updateRobaIliUsluga(@PathVariable(value="id") Long robaIliUslugaId, @Valid @RequestBody RobaIliUsluga robaIliUslugaBody) throws ResourceNotFoundException{
		return this.robaIliUslugaService.updateRobaIliUsluga(robaIliUslugaId, robaIliUslugaBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteRobaIliUsluga(@PathVariable(value="id") Long robaIliUslugaId) throws ResourceNotFoundException{
		return this.robaIliUslugaService.deleteRobaIliUsluga(robaIliUslugaId);
	}
}
