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
import com.isa2021.model.Administrator;
import com.isa2021.repository.AdministratorRepository;

@RestController
@RequestMapping("/admin")
public class AdministratorController {

	@Autowired
	private AdministratorRepository administratorRepository;
	
	//get all
	@GetMapping("")
	public List<Administrator> getAllAdministrators(){
		return this.administratorRepository.findAll();
	}
	//get admin by id
	@GetMapping("/{id}")
	public ResponseEntity<Administrator> getAdministratorById(@PathVariable(value = "id") String adminId) throws ResourceNotFoundException{
		Administrator administrator = administratorRepository.findById(adminId).orElseThrow(() -> new ResourceNotFoundException("No administrator with id: " + adminId));
		return ResponseEntity.ok().body(administrator);
	}
	
	//save admin
	@PostMapping("")
	public Administrator createAdministrator(@RequestBody Administrator admin) {
		return this.administratorRepository.save(admin);
	}
	//update admin
	@PutMapping("/{id}")
	public ResponseEntity<Administrator> updateAdministrator(@PathVariable(value="id") String administratorId, @Valid @RequestBody Administrator administratorBody) throws ResourceNotFoundException{
		Administrator admin = this.administratorRepository.findById(administratorId).orElseThrow(() -> new ResourceNotFoundException("No administrator with id: " + administratorId));
		admin.setAdresa(administratorBody.getAdresa());
		admin.setBrojTelefona(administratorBody.getBrojTelefona());
		admin.setEmailAdresa(administratorBody.getEmailAdresa());
		admin.setIme(administratorBody.getIme());
		admin.setPrezime(administratorBody.getPrezime());
		admin.setPassword(administratorBody.getPassword());
		admin.setListaKomentara(administratorBody.getListaKomentara());
		admin.setListaZahteva(administratorBody.getListaZahteva());
		admin.setListaZalbi(administratorBody.getListaZalbi());
		return ResponseEntity.ok(this.administratorRepository.save(admin));
	}
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteAdministrator(@PathVariable(value="id") String administratorId) throws ResourceNotFoundException{
		Administrator admin = this.administratorRepository.findById(administratorId).orElseThrow(() -> new ResourceNotFoundException("No administrator with id: " + administratorId));
		this.administratorRepository.delete(admin);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
}
