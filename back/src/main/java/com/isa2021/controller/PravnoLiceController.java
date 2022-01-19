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
import com.isa2021.model.PravnoLice;
import com.isa2021.repository.PravnoLiceRepository;
import com.isa2021.service.PravnoLiceService;

@RestController
@RequestMapping("/pravnolice")
public class PravnoLiceController {

	@Autowired 
	private PravnoLiceService pravnoLiceService;
	
	@GetMapping("")
	public List<PravnoLice> getAllAdministrators(){
		return this.pravnoLiceService.pravnoLiceRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PravnoLice> getPravnoLiceById(@PathVariable(value = "id") String pravnoLiceId) throws ResourceNotFoundException{
		return this.pravnoLiceService.getPravnoLiceById(pravnoLiceId);
	}
	
	@PostMapping("")
	public PravnoLice createPravnoLice(@RequestBody PravnoLice pravnoLice) {
		return this.pravnoLiceService.pravnoLiceRepository.save(pravnoLice);
	}

	@PutMapping("/{id}")
	public ResponseEntity<PravnoLice> updatePravnoLice(@PathVariable(value="id") String pravnoLiceId, @Valid @RequestBody PravnoLice pravnoLiceBody) throws ResourceNotFoundException{
		return this.pravnoLiceService.updatePravnoLice(pravnoLiceId, pravnoLiceBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deletePravnoLice(@PathVariable(value="id") String pravnoLiceId) throws ResourceNotFoundException{
		return this.pravnoLiceService.deletePravnoLice(pravnoLiceId);
	}
}
