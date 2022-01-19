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
import com.isa2021.model.Zalba;
import com.isa2021.repository.ZalbaRepository;
import com.isa2021.service.ZalbaService;

@RestController
@RequestMapping("/zalba")
public class ZalbaController {
	
	@Autowired 
	private ZalbaService zalbaService;
	
	@GetMapping("")
	public List<Zalba> getAllZalba(){
		return this.zalbaService.zalbaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Zalba> getZalbaById(@PathVariable(value = "id") Long zalbaId) throws ResourceNotFoundException{
		return this.zalbaService.getZalbaById(zalbaId);
	}
	
	@PostMapping("")
	public Zalba createZalba(@RequestBody Zalba zalba) {
		return this.zalbaService.zalbaRepository.save(zalba);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Zalba> updateZalba(@PathVariable(value="id") Long zalbaId, @Valid @RequestBody Zalba zalbaBody) throws ResourceNotFoundException{
		return this.zalbaService.updateZalba(zalbaId, zalbaBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteZalba(@PathVariable(value="id") Long zalbaId) throws ResourceNotFoundException{
		return this.zalbaService.deleteZalba(zalbaId);
	}
}
