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
import com.isa2021.model.RegistrovaniKorisnik;
import com.isa2021.repository.RegistrovaniKorisnikRepository;
import com.isa2021.service.RegistrovaniKorisnikService;

@RestController
@RequestMapping("/registrovanikorisnik")
public class RegistrovaniKorisnikController {
	
	@Autowired 
	private RegistrovaniKorisnikService registrovaniKorisnikService;
	
	@GetMapping("")
	public List<RegistrovaniKorisnik> getAllRegistrovaniKorisnik(){
		return this.registrovaniKorisnikService.registrovaniKorisnikRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RegistrovaniKorisnik> getRegistrovaniKorisnikById(@PathVariable(value = "id") String regKorisnikId) throws ResourceNotFoundException{
		return this.registrovaniKorisnikService.getRegistrovaniKorisnikById(regKorisnikId);
	}
	
	@PostMapping("")
	public RegistrovaniKorisnik createRegistrovaniKorisnik(@RequestBody RegistrovaniKorisnik regKorisnik) {
		return this.registrovaniKorisnikService.registrovaniKorisnikRepository.save(regKorisnik);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<RegistrovaniKorisnik> updateRegistrovaniKorisnik(@PathVariable(value="id") String registrovaniKorisnikId, @Valid @RequestBody RegistrovaniKorisnik registrovaniKorisnikBody) throws ResourceNotFoundException{
		return this.registrovaniKorisnikService.updateRegistrovaniKorisnik(registrovaniKorisnikId, registrovaniKorisnikBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteRegistrovaniKorisnik(@PathVariable(value="id") String registrovaniKorisnikId) throws ResourceNotFoundException{
		return this.registrovaniKorisnikService.deleteRegistrovaniKorisnik(registrovaniKorisnikId);
	}
}
