package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Komentar;
import com.isa2021.repository.KomentarRepository;

@Service
public class KomentarService {

	@Autowired
	public KomentarRepository komentarRepository;
	
	public ResponseEntity<Komentar> getKomentarById(Long komentarId) throws ResourceNotFoundException{
		Komentar k = this.komentarRepository.findById(komentarId).orElseThrow(() -> new ResourceNotFoundException("No komentar by id: " + komentarId));
		return ResponseEntity.ok().body(k);
	}
	
	public ResponseEntity<Komentar> updateKomentar(Long komentarId, Komentar komentarBody) throws ResourceNotFoundException{
		Komentar k = this.komentarRepository.findById(komentarId).orElseThrow(() -> new ResourceNotFoundException("No komentar by id: " + komentarId));
		k.setKomentator(komentarBody.getKomentator());
		k.setOcena(komentarBody.getOcena());
		k.setPredmet(komentarBody.getPredmet());
		k.setStatusKomentara(komentarBody.getStatusKomentara());
		k.setTekstKomentara(komentarBody.getTekstKomentara());
		return ResponseEntity.ok().body(k);
	}
	
	public Map<String, Boolean> deleteKomentar(Long komentarId) throws ResourceNotFoundException{
		Komentar k = this.komentarRepository.findById(komentarId).orElseThrow(() -> new ResourceNotFoundException("No komentar by id: " + komentarId));
		this.komentarRepository.delete(k);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
		
	}
}
