package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.GenericUser;
import com.isa2021.repository.GenericUserRepository;

@Service
public class GenericUserService {

	@Autowired
	public GenericUserRepository genericUserRepository;
	
	public ResponseEntity<GenericUser> getGenericUserById(String userId) throws ResourceNotFoundException{
		GenericUser gu = this.genericUserRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("No generic user with id: " + userId));
		return ResponseEntity.ok().body(gu);
	}
	
	public ResponseEntity<GenericUser> updateGenericUser(String userId, GenericUser genericUserBody) throws ResourceNotFoundException{
		GenericUser gu = this.genericUserRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("No generic user with id: " + userId));
		gu.setAdresa(genericUserBody.getAdresa());
		gu.setBrojTelefona(genericUserBody.getBrojTelefona());
		gu.setEmailAdresa(genericUserBody.getEmailAdresa());
		gu.setIme(genericUserBody.getIme());
		gu.setListaPodnetihZalbi(genericUserBody.getListaPodnetihZalbi());
		gu.setPassword(genericUserBody.getPassword());
		gu.setPrezime(genericUserBody.getPrezime());
		gu.setZahtev(genericUserBody.getZahtev());
		return ResponseEntity.ok().body(gu);
	}
	
	public Map<String, Boolean> deleteGenericUser(String userId) throws ResourceNotFoundException{
		GenericUser gu = this.genericUserRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("No generic user with id: " + userId));
		this.genericUserRepository.delete(gu);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
