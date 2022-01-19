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
import com.isa2021.model.InstruktorPecanja;
import com.isa2021.service.InstruktorPecanjaService;

@RestController
@RequestMapping("/instruktori")
public class InstruktorPecanjaController {

	@Autowired
	private InstruktorPecanjaService instruktorPecanjaService;
	
	@GetMapping("")
	public List<InstruktorPecanja> getAllInstruktorPecanja(){
		return this.instruktorPecanjaService.instruktorPecanjaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<InstruktorPecanja> getInstruktorPecanjaById(@PathVariable(value="id") String instruktorId) throws ResourceNotFoundException{
		return this.instruktorPecanjaService.getInstruktorPecanjaById(instruktorId);
	}
	
	@PostMapping("")
	public InstruktorPecanja createInstruktorPecanja(@RequestBody InstruktorPecanja instruktor) {
		return this.instruktorPecanjaService.instruktorPecanjaRepository.save(instruktor);
	}
	@PutMapping("/{id}")
	public ResponseEntity<InstruktorPecanja> updateInstruktorPecanja(@PathVariable(value="id") String instruktorId, @Valid @RequestBody InstruktorPecanja instruktorPecanjaBody) throws ResourceNotFoundException{
		return this.instruktorPecanjaService.updateInstruktorPecanja(instruktorId, instruktorPecanjaBody);
	}
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteInstruktorPecanja(String instruktorId) throws ResourceNotFoundException{
		return this.instruktorPecanjaService.deleteInstruktorPecanja(instruktorId);
	}
}
