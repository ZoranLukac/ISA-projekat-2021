package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Zalba;
import com.isa2021.repository.ZalbaRepository;

@Service
public class ZalbaService {

	@Autowired
	public ZalbaRepository zalbaRepository;
	
	public ResponseEntity<Zalba> updateZalba(Long zalbaId, Zalba zalbaBody) throws ResourceNotFoundException{
		Zalba z = this.zalbaRepository.findById(zalbaId).orElseThrow(() -> new ResourceNotFoundException("No zalba by id: " + zalbaId));
		z.setId(zalbaBody.getId());
		z.setPodnosilac(zalbaBody.getPodnosilac());
		z.setPredmet(zalbaBody.getPredmet());
		z.setTekstZalbe(zalbaBody.getTekstZalbe());
		return ResponseEntity.ok().body(z);
	}
	
	public ResponseEntity<Zalba> getZalbaById(Long zalbaId) throws ResourceNotFoundException{
		Zalba z = this.zalbaRepository.findById(zalbaId).orElseThrow(() -> new ResourceNotFoundException("No zalba by id: " + zalbaId));
		return ResponseEntity.ok().body(z);
	}
	
	public Map<String, Boolean> deleteZalba(Long zalbaId) throws ResourceNotFoundException{
		Zalba z = this.zalbaRepository.findById(zalbaId).orElseThrow(() -> new ResourceNotFoundException("No zalba by id: " + zalbaId));
		this.zalbaRepository.delete(z);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
