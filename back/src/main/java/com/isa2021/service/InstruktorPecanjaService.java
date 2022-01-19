package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.InstruktorPecanja;
import com.isa2021.repository.InstruktorPecanjaRepository;

@Service
public class InstruktorPecanjaService {

	@Autowired
	public InstruktorPecanjaRepository instruktorPecanjaRepository;
	
	public ResponseEntity<InstruktorPecanja> getInstruktorPecanjaById(String instruktorId) throws ResourceNotFoundException{
		InstruktorPecanja ip = this.instruktorPecanjaRepository.findById(instruktorId).orElseThrow(() -> new ResourceNotFoundException("No instruktor pecanja by id: " + instruktorId));
		return ResponseEntity.ok().body(ip);
	}
	
	public ResponseEntity<InstruktorPecanja> updateInstruktorPecanja(String instruktorId, InstruktorPecanja instruktorPecanjaBody) throws ResourceNotFoundException{
		InstruktorPecanja ip = this.instruktorPecanjaRepository.findById(instruktorId).orElseThrow(() -> new ResourceNotFoundException("No instruktor pecanja with id: " + instruktorId));
		ip.setAdresa(instruktorPecanjaBody.getAdresa());
		ip.setBrojTelefona(instruktorPecanjaBody.getBrojTelefona());
		ip.setEmailAdresa(instruktorPecanjaBody.getEmailAdresa());
		ip.setIme(instruktorPecanjaBody.getIme());
		ip.setListaAvantura(instruktorPecanjaBody.getListaAvantura());
		ip.setListaPodnetihZalbi(instruktorPecanjaBody.getListaPodnetihZalbi());
		ip.setListaRezervacija(instruktorPecanjaBody.getListaRezervacija());
		ip.setPassword(instruktorPecanjaBody.getPassword());
		ip.setPrezime(instruktorPecanjaBody.getPrezime());
		ip.setZahtev(instruktorPecanjaBody.getZahtev());
		return ResponseEntity.ok().body(ip);
	}
	
	public Map<String, Boolean> deleteInstruktorPecanja(String instruktorId) throws ResourceNotFoundException{
		InstruktorPecanja ip = this.instruktorPecanjaRepository.findById(instruktorId).orElseThrow(() -> new ResourceNotFoundException("No instruktor pecanja with id: " + instruktorId));
		this.instruktorPecanjaRepository.delete(ip);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
