package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Cenovnik;
import com.isa2021.repository.CenovnikRepository;

@Service
public class CenovnikService {

	@Autowired
	public CenovnikRepository cenovnikRepository;
	
	public ResponseEntity<Cenovnik> getCenovnikById(Long cenovnikId) throws ResourceNotFoundException{
		Cenovnik c = this.cenovnikRepository.findById(cenovnikId).orElseThrow(() -> new ResourceNotFoundException("No cenovnik by id: " + cenovnikId));
		return ResponseEntity.ok().body(c);
	}
	
	public ResponseEntity<Cenovnik> updateCenovnik(Long cenovnikId, Cenovnik cenovnikBody) throws ResourceNotFoundException{
		Cenovnik c = this.cenovnikRepository.findById(cenovnikId).orElseThrow(() -> new ResourceNotFoundException("No cenovnik by id: " + cenovnikId));
		c.setCenaPoDanu(cenovnikBody.getCenaPoDanu());
		c.setProcenatPopusta(cenovnikBody.getProcenatPopusta());
		return ResponseEntity.ok().body(c);
	}
	
	public Map<String, Boolean> deleteCenovnik(Long cenovnikId) throws ResourceNotFoundException{
		Cenovnik c = this.cenovnikRepository.findById(cenovnikId).orElseThrow(() -> new ResourceNotFoundException("No cenovnik by id: " + cenovnikId));
		this.cenovnikRepository.delete(c);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
