package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.RobaIliUsluga;
import com.isa2021.repository.RobaIliUslugaRepository;

@Service
public class RobaIliUslugaService {
	
	@Autowired
	public RobaIliUslugaRepository robaIliUslugaRepository;
	
	public ResponseEntity<RobaIliUsluga> updateRobaIliUsluga(Long robaIliUslugaId, RobaIliUsluga robaIliUslugaBody) throws ResourceNotFoundException {
		RobaIliUsluga riu = this.robaIliUslugaRepository.findById(robaIliUslugaId).orElseThrow(() -> new ResourceNotFoundException("No roba ili usluga by id: " + robaIliUslugaId));
		riu.setId(robaIliUslugaBody.getId());
		riu.setNaziv(robaIliUslugaBody.getNaziv());
		riu.setVlasnik(robaIliUslugaBody.getVlasnik());
		riu.setListaKomentara(robaIliUslugaBody.getListaKomentara());
		riu.setUsloviOtkazivanjaRezervacije(robaIliUslugaBody.getUsloviOtkazivanjaRezervacije());
		riu.setListaPravila(robaIliUslugaBody.getListaPravila());
		riu.setCenovnik(robaIliUslugaBody.getCenovnik());
		return ResponseEntity.ok().body(riu);
	}
	
	public ResponseEntity<RobaIliUsluga> getRobaIliUslugaById(Long robaIliUslugaId) throws ResourceNotFoundException {
		RobaIliUsluga riu = this.robaIliUslugaRepository.findById(robaIliUslugaId).orElseThrow(() -> new ResourceNotFoundException("No roba ili usluga by id: " + robaIliUslugaId));
		return ResponseEntity.ok().body(riu);
	}
	
	public Map<String, Boolean> deleteRobaIliUsluga(Long robaIliUslugaId) throws ResourceNotFoundException {
		RobaIliUsluga riu = this.robaIliUslugaRepository.findById(robaIliUslugaId).orElseThrow(() -> new ResourceNotFoundException("No roba ili usluga by id: " + robaIliUslugaId));
		this.robaIliUslugaRepository.delete(riu);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return null;
	}
}
