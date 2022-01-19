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
import com.isa2021.model.Rezervacija;
import com.isa2021.repository.RezervacijaRepository;
import com.isa2021.service.RezervacijaService;

@RestController
@RequestMapping("/rezervacija")
public class RezervacijaController {
	
	@Autowired 
	private RezervacijaService rezervacijaService;
	
	@GetMapping("")
	public List<Rezervacija> getAllRezervacija(){
		return this.rezervacijaService.rezervacijaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Rezervacija> getRezervacijaById(@PathVariable(value = "id") Long rezervId) throws ResourceNotFoundException{
		return this.rezervacijaService.getRezervacijaById(rezervId);
	}
	
	@PostMapping("")
	public Rezervacija createRezervacija(@RequestBody Rezervacija rezerv) {
		return this.rezervacijaService.rezervacijaRepository.save(rezerv);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Rezervacija> updateRezervacija(@PathVariable(value="id") Long rezervacijaId, @Valid @RequestBody Rezervacija rezervacijaBody) throws ResourceNotFoundException{
		return this.rezervacijaService.updateRezervacija(rezervacijaId, rezervacijaBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteRezervacija(@PathVariable(value="id") Long rezervacijaId) throws ResourceNotFoundException{
		return this.rezervacijaService.deleteRezervacija(rezervacijaId);
	}
}
