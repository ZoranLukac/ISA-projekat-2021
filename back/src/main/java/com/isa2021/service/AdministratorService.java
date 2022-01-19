package com.isa2021.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Administrator;
import com.isa2021.repository.AdministratorRepository;

@Service
public class AdministratorService {

	@Autowired
	public AdministratorRepository administratorRepository;
	
	public ResponseEntity<Administrator> updateAdministrator(String administratorId, Administrator administratorBody) throws ResourceNotFoundException{
		Administrator a = this.administratorRepository.findById(administratorId).orElseThrow(() -> new ResourceNotFoundException("No administrator with id: " + administratorId));
		a.setAdresa(administratorBody.getAdresa());
		a.setBrojTelefona(administratorBody.getBrojTelefona());
		a.setEmailAdresa(administratorBody.getEmailAdresa());
		a.setIme(administratorBody.getIme());
		a.setPrezime(administratorBody.getPrezime());
		a.setPassword(administratorBody.getPassword());
		a.setListaKomentara(administratorBody.getListaKomentara());
		a.setListaZahteva(administratorBody.getListaZahteva());
		a.setListaZalbi(administratorBody.getListaZalbi());
		return ResponseEntity.ok(this.administratorRepository.save(a));
	}
	
	public ResponseEntity<Administrator> getAdministratorById(String adminId) throws ResourceNotFoundException{
		Administrator a = this.administratorRepository.findById(adminId).orElseThrow(() -> new ResourceNotFoundException("No administrator with id: " + adminId));
		return ResponseEntity.ok().body(a);
	}
	public Map<String, Boolean> deleteAdministrator(String administratorId) throws ResourceNotFoundException{
		Administrator admin= this.administratorRepository.findById(administratorId).orElseThrow(() -> new ResourceNotFoundException("No administrator with id: " + administratorId));
		this.administratorRepository.delete(admin);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
