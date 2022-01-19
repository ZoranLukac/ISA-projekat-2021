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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Adresa;
import com.isa2021.service.AdresaService;

@RestController
@RequestMapping("/adrese")
public class AdresaController {

	@Autowired
	private AdresaService adresaService;
	
	@GetMapping("")
	public List<Adresa> getAllAdresa(){
		return this.adresaService.adresaRepository.findAll();
	}
	
//	@GetMapping("/filter")
//	public List<Adresa> filtrirajAdrese(@Valid @RequestBody Adresa adresa){
//		return this.adresaService.adresaRepository.findAdreseByParameters(adresa.getMesto(), adresa.getUlica(), adresa.getBroj(), adresa.getDrzava());
//	}
	
	@GetMapping("/filter")
	public List<Adresa> filtrirajAdrese(@RequestParam(value="mesto") String mesto, @RequestParam(value="ulica") String ulica, @RequestParam(value="broj") int broj, @RequestParam(value="drzava") String drzava ){
		return this.adresaService.adresaRepository.findAdreseByParameters(mesto, ulica, broj, drzava);
	}
	
	@PostMapping("")
	public Adresa createAdresa(@RequestBody Adresa adresa) {
		return this.adresaService.adresaRepository.save(adresa);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Adresa> updateAdresa(@PathVariable(value="id") String adresaId, @Valid @RequestBody Adresa adresaBody) throws ResourceNotFoundException{
		return this.adresaService.updateAdresa(adresaId, adresaBody);
	}
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteAdresa(@PathVariable(value="id") String adresaId) throws ResourceNotFoundException{
		return this.adresaService.deleteAdresa(adresaId);
	}
}
