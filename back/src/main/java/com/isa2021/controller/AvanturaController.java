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
import com.isa2021.model.Avantura;
import com.isa2021.service.AvanturaService;

@RestController
@RequestMapping("/avantura")
public class AvanturaController {

	@Autowired
	private AvanturaService avanturaService;
	
	@GetMapping("")
	public List<Avantura> getAllAvanture(){
		List<? super Avantura> response = this.avanturaService.avanturaRepository.findAll();
		return (List<Avantura>) response;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Avantura> getAvanturaById(@PathVariable(value = "id") String avanturaId) throws ResourceNotFoundException{
		long id = Long.parseLong(avanturaId);
		return this.avanturaService.getAvanturaById(id);
	}
	
	@PostMapping("")
	public Avantura createAvantura(@RequestBody Avantura avantura) {
		return this.avanturaService.avanturaRepository.save(avantura);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Avantura> updateAvantura(@PathVariable(value="id") String avanturaId, @Valid @RequestBody Avantura avanturaBody) throws ResourceNotFoundException{
		return this.avanturaService.updateAvantura(avanturaId, avanturaBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteAvantura(@PathVariable(value="id") String avanturaId) throws ResourceNotFoundException{
		return this.avanturaService.deleteAvantura(avanturaId);
	}
	
}
