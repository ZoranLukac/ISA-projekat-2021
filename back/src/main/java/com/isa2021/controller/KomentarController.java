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
import com.isa2021.model.Komentar;
import com.isa2021.service.KomentarService;

@RestController
@RequestMapping("/komentari")
public class KomentarController {

	@Autowired
	private KomentarService komentarService;
	
	@GetMapping("")
	public List<Komentar> getAllKomentari(){
		return this.komentarService.komentarRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Komentar> getKomentarById(@PathVariable(value="id") Long komentarId) throws ResourceNotFoundException{
		return this.komentarService.getKomentarById(komentarId);
	}
	
	@PostMapping("")
	public Komentar createKomentar(@RequestBody Komentar komentar) {
		return this.komentarService.komentarRepository.save(komentar);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Komentar> updateKomentar(@PathVariable(value="id") Long komentarId, @Valid @RequestBody Komentar komentarBody) throws ResourceNotFoundException{
		return this.komentarService.updateKomentar(komentarId, komentarBody);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteKomentar(@PathVariable(value="id") Long komentarId) throws ResourceNotFoundException{
		return this.komentarService.deleteKomentar(komentarId);
	}
	
	
}
