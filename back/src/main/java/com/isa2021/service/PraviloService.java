package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Pravilo;
import com.isa2021.repository.PraviloRepository;

@Service
public class PraviloService {

	@Autowired
	public PraviloRepository praviloRepository;
	
	public ResponseEntity<Pravilo> updatePravilo(Long praviloId, Pravilo praviloBody) throws ResourceNotFoundException{
		Pravilo p = this.praviloRepository.findById(praviloId).orElseThrow(() -> new ResourceNotFoundException("No pravilo by id: " + praviloId));
		p.setDozvoljeno(praviloBody.isDozvoljeno());
		p.setOpisPravila(praviloBody.getOpisPravila());
		return ResponseEntity.ok().body(p);
	}
	
	public ResponseEntity<Pravilo> getPraviloById(Long praviloId) throws ResourceNotFoundException{
		Pravilo p = this.praviloRepository.findById(praviloId).orElseThrow(() -> new ResourceNotFoundException("No pravilo by id: " + praviloId));
		return ResponseEntity.ok().body(p);
	}
	
	public Map<String, Boolean> deletePravilo(Long praviloId) throws ResourceNotFoundException{
		Pravilo p = this.praviloRepository.findById(praviloId).orElseThrow(() -> new ResourceNotFoundException("No pravilo by id: " + praviloId));
		this.praviloRepository.delete(p);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
