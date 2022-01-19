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
import com.isa2021.model.VlasnikVikendice;
import com.isa2021.repository.VlasnikVikendiceRepository;
import com.isa2021.service.VlasnikVikendiceService;

@RestController
@RequestMapping("/vlasnikvikendice")
public class VlasnikVikendiceController {
	
	@Autowired 
	private VlasnikVikendiceService vlasnikVikendiceService;
	
	@GetMapping("")
	public List<VlasnikVikendice> getAllVlasnikVikendice(){
		return this.vlasnikVikendiceService.vlasnikVikendiceRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VlasnikVikendice> getVlasnikVikendiceById(@PathVariable(value = "id") String vlasnikVikId) throws ResourceNotFoundException{
		return this.vlasnikVikendiceService.getVlasnikVikendiceById(vlasnikVikId);
	}
	
	@PostMapping("")
	public VlasnikVikendice createVlasnikVikendice(@RequestBody VlasnikVikendice vlasnikVik) {
		return this.vlasnikVikendiceService.vlasnikVikendiceRepository.save(vlasnikVik);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<VlasnikVikendice> updateVlasnikVikendice(@PathVariable(value="id") String vlasnikVikendiceId, @Valid @RequestBody VlasnikVikendice vlasnikVikendiceBody) throws ResourceNotFoundException{
		return this.vlasnikVikendiceService.updateVlasnikVikendice(vlasnikVikendiceId, vlasnikVikendiceBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteVlasnikVikendice(@PathVariable(value="id") String vlasnikVikendiceId) throws ResourceNotFoundException{
		return this.vlasnikVikendiceService.deleteVlasnikVikendice(vlasnikVikendiceId);
	}
}
