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
import com.isa2021.model.VlasnikBroda;
import com.isa2021.repository.VlasnikBrodaRepository;
import com.isa2021.service.VlasnikBrodaService;

@RestController
@RequestMapping("/vlasnikbroda")
public class VlasnikBrodaController {
	
	@Autowired 
	private VlasnikBrodaService vlasnikBrodaService;
	
	@GetMapping("")
	public List<VlasnikBroda> getAllVlasnikBroda(){
		return this.vlasnikBrodaService.vlasnikBrodaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VlasnikBroda> getVlasnikBrodaById(@PathVariable(value = "id") String vlasnikBrId) throws ResourceNotFoundException{
		return this.vlasnikBrodaService.getVlasnikBrodaById(vlasnikBrId);
	}
	
	@PostMapping("")
	public VlasnikBroda createVlasnikBroda(@RequestBody VlasnikBroda vlasnikBr) {
		return this.vlasnikBrodaService.vlasnikBrodaRepository.save(vlasnikBr);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<VlasnikBroda> updateVlasnikBroda(@PathVariable(value="id") String vlasnikBrodaId, @Valid @RequestBody VlasnikBroda vlasnikBrodaBody) throws ResourceNotFoundException{
		return this.vlasnikBrodaService.updateVlasnikBroda(vlasnikBrodaId, vlasnikBrodaBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteVlasnikBroda(@PathVariable(value="id") String vlasnikBrodaId) throws ResourceNotFoundException{
		return this.vlasnikBrodaService.deleteVlasnikBroda(vlasnikBrodaId);
	}
}
