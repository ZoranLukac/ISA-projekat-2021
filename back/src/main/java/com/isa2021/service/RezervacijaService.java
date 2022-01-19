package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Rezervacija;
import com.isa2021.repository.RezervacijaRepository;

@Service
public class RezervacijaService {
	
	@Autowired
	public RezervacijaRepository rezervacijaRepository;
	
	public ResponseEntity<Rezervacija> updateRezervacija(Long rezervacijaId, Rezervacija rezervacijaBody) throws ResourceNotFoundException{
		Rezervacija r = this.rezervacijaRepository.findById(rezervacijaId).orElseThrow(() -> new ResourceNotFoundException("No rezervacija by id: " + rezervacijaId));
		r.setId(rezervacijaBody.getId());
		r.setStatusRezervacije(rezervacijaBody.getStatusRezervacije());
		r.setNarucilac(rezervacijaBody.getNarucilac());
		r.setProdavac(rezervacijaBody.getProdavac());
		r.setRoba(rezervacijaBody.getRoba());
		r.setDatumOd(rezervacijaBody.getDatumOd());
		r.setDatumDo(rezervacijaBody.getDatumDo());
		r.setCena(rezervacijaBody.getCena());
		return ResponseEntity.ok().body(r);
	}
	
	public ResponseEntity<Rezervacija> getRezervacijaById(Long rezervacijaId) throws ResourceNotFoundException{
		Rezervacija r = this.rezervacijaRepository.findById(rezervacijaId).orElseThrow(() -> new ResourceNotFoundException("No rezervacija by id: " + rezervacijaId));
		return ResponseEntity.ok().body(r);
	}
	
	public Map<String, Boolean> deleteRezervacija(Long rezervacijaId) throws ResourceNotFoundException{
		Rezervacija r = this.rezervacijaRepository.findById(rezervacijaId).orElseThrow(() -> new ResourceNotFoundException("No rezervacija by id: " + rezervacijaId));
		this.rezervacijaRepository.delete(r);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
