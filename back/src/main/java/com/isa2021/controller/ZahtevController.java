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
import com.isa2021.model.Zahtev;
import com.isa2021.repository.ZahtevRepository;
import com.isa2021.service.ZahtevService;

@RestController
@RequestMapping("/zahtev")
public class ZahtevController {
	
	@Autowired 
	private ZahtevService zahtevService;
	
	@GetMapping("")
	public List<Zahtev> getAllZahtev(){
		return this.zahtevService.zahtevRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Zahtev> getZahtevById(@PathVariable(value = "id") Long zahtevId) throws ResourceNotFoundException{
		return this.zahtevService.getZahtevById(zahtevId);
	}
	
	@PostMapping("")
	public Zahtev createZahtev(@RequestBody Zahtev zahtev) {
		return this.zahtevService.zahtevRepository.save(zahtev);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Zahtev> updateZahtev(@PathVariable(value="id") Long zahtevId, @Valid @RequestBody Zahtev zahtevBody) throws ResourceNotFoundException{
		return this.zahtevService.updateZahtev(zahtevId, zahtevBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteZahtev(@PathVariable(value="id") Long zahtevId) throws ResourceNotFoundException{
		return this.zahtevService.deleteZahtev(zahtevId);
	}
}
