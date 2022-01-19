package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Vikendica;
import com.isa2021.repository.VikendicaRepository;

@Service
public class VikendicaService {

	@Autowired
	public VikendicaRepository vikendicaRepository;
	
	public ResponseEntity<Vikendica> updateVikendica(Long vikendicaId, Vikendica vikendicaBody) throws ResourceNotFoundException{
		Vikendica v = this.vikendicaRepository.findById(vikendicaId).orElseThrow(() -> new ResourceNotFoundException("No vikendica by id: " + vikendicaId));
		v.setAdresa(vikendicaBody.getAdresa());
		v.setPromoOpisVikendice(vikendicaBody.getPromoOpisVikendice());
		v.setBrojSoba(vikendicaBody.getBrojSoba());
		v.setBrojKrevetaPoSobi(vikendicaBody.getBrojKrevetaPoSobi());
		v.setSlikeEnterijera(vikendicaBody.getSlikeEnterijera());
		v.setSlikeEksterijera(vikendicaBody.getSlikeEksterijera());
		v.setDodatneUsluge(vikendicaBody.getDodatneUsluge());
		v.setId(vikendicaBody.getId());
		v.setNaziv(vikendicaBody.getNaziv());
		v.setVlasnik(vikendicaBody.getVlasnik());
		v.setListaKomentara(vikendicaBody.getListaKomentara());
		v.setUsloviOtkazivanjaRezervacije(vikendicaBody.getUsloviOtkazivanjaRezervacije());
		v.setListaPravila(vikendicaBody.getListaPravila());
		v.setCenovnik(vikendicaBody.getCenovnik());
		return ResponseEntity.ok().body(v);
	}
	
	public ResponseEntity<Vikendica> getVikendicaById(Long vikendicaId) throws ResourceNotFoundException{
		Vikendica v = this.vikendicaRepository.findById(vikendicaId).orElseThrow(() -> new ResourceNotFoundException("No vikendica by id: " + vikendicaId));
		return ResponseEntity.ok().body(v);
	}
	
	public Map<String, Boolean> deleteVikendica(Long vikendicaId) throws ResourceNotFoundException{
		Vikendica v = this.vikendicaRepository.findById(vikendicaId).orElseThrow(() -> new ResourceNotFoundException("No vikendica by id: " + vikendicaId));
		this.vikendicaRepository.delete(v);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
