package com.isa2021.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.PravnoLice;
import com.isa2021.repository.PravnoLiceRepository;

@Service
public class PravnoLiceService {
	@Autowired
	public PravnoLiceRepository pravnoLiceRepository;
	
	public ResponseEntity<PravnoLice> updatePravnoLice(String pravnoLiceId, PravnoLice pravnoLiceBody) throws ResourceNotFoundException {
		PravnoLice pl = this.pravnoLiceRepository.findById(pravnoLiceId).orElseThrow(() -> new ResourceNotFoundException("No pravno lice with id: " + pravnoLiceId));
		pl.setListaRezervacija(pravnoLiceBody.getListaRezervacija());
		pl.setIme(pravnoLiceBody.getIme());
		pl.setPrezime(pravnoLiceBody.getPrezime());
		pl.setEmailAdresa(pravnoLiceBody.getEmailAdresa());
		pl.setBrojTelefona(pravnoLiceBody.getBrojTelefona());
		pl.setPassword(pravnoLiceBody.getPassword());
		pl.setAdresa(pravnoLiceBody.getAdresa());
		pl.setListaPodnetihZalbi(pravnoLiceBody.getListaPodnetihZalbi());
		pl.setZahtev(pravnoLiceBody.getZahtev());
		
		return ResponseEntity.ok().body(pl);
	}
	
	public ResponseEntity<PravnoLice> getPravnoLiceById(String pravnoLiceId) throws ResourceNotFoundException{
		PravnoLice pl = this.pravnoLiceRepository.findById(pravnoLiceId).orElseThrow(() -> new ResourceNotFoundException("No pravno lice with id: " + pravnoLiceId));
		return ResponseEntity.ok().body(pl);
	}
	
	public Map<String, Boolean> deletePravnoLice(String pravnoLiceId) throws ResourceNotFoundException{
		PravnoLice pl = this.pravnoLiceRepository.findById(pravnoLiceId).orElseThrow(() -> new ResourceNotFoundException("No pravno lice with id: " + pravnoLiceId));
		this.pravnoLiceRepository.delete(pl);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
