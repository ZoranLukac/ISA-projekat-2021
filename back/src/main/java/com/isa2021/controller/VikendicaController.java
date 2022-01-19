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
import com.isa2021.model.Vikendica;
import com.isa2021.repository.VikendicaRepository;
import com.isa2021.service.VikendicaService;

@RestController
@RequestMapping("/vikendica")
public class VikendicaController {
	
	@Autowired 
	private VikendicaService vikendicaService;
	
	@GetMapping("")
	public List<Vikendica> getAllVikendica(){
		return this.vikendicaService.vikendicaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vikendica> getVikendicaById(@PathVariable(value = "id") Long vikendId) throws ResourceNotFoundException{
		return this.vikendicaService.getVikendicaById(vikendId);
	}
	
	@PostMapping("")
	public Vikendica createVikendica(@RequestBody Vikendica vikend) {
		return this.vikendicaService.vikendicaRepository.save(vikend);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Vikendica> updateVikendica(@PathVariable(value="id") Long vikendicaId, @Valid @RequestBody Vikendica vikendicaBody) throws ResourceNotFoundException{
		return this.vikendicaService.updateVikendica(vikendicaId, vikendicaBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteVikendica(@PathVariable(value="id") Long vikendicaId) throws ResourceNotFoundException{
		return this.vikendicaService.deleteVikendica(vikendicaId);
	}
}
