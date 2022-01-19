package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Brod;
import com.isa2021.repository.BrodRepository;

@Service
public class BrodService {

	@Autowired
	public BrodRepository brodRepository;
	
	public ResponseEntity<Brod> getBrodById(Long brodId) throws ResourceNotFoundException{
		Brod b = this.brodRepository.findById(brodId).orElseThrow(() -> new ResourceNotFoundException("No brod with id: " + brodId));
		return ResponseEntity.ok().body(b);
	}
	
	public ResponseEntity<Brod> updateBrod(Long brodId, Brod brodBody) throws ResourceNotFoundException{
		Brod b = this.brodRepository.findById(brodId).orElseThrow(() -> new ResourceNotFoundException("No brod with id: " + brodId));
		b.setBrojMotora(brodBody.getBrojMotora());
		b.setCenovnik(brodBody.getCenovnik());
		b.setDuzinaBroda(brodBody.getDuzinaBroda());
		b.setKapacitet(brodBody.getKapacitet());
		b.setListaDodatneOpremeZaPecanje(brodBody.getListaDodatneOpremeZaPecanje());
		b.setListaKomentara(brodBody.getListaKomentara());
		b.setListaPravila(brodBody.getListaPravila());
		b.setMaxBrzina(brodBody.getMaxBrzina());
		b.setNavigacionaOprema(brodBody.getNavigacionaOprema());
		b.setNaziv(brodBody.getNaziv());
		b.setPromoOpis(brodBody.getPromoOpis());
		b.setSlikeEksterijera(brodBody.getSlikeEksterijera());
		b.setSlikeEnterijera(brodBody.getSlikeEnterijera());
		b.setSnagaMotoraUKw(brodBody.getSnagaMotoraUKw());
		b.setTipPlovila(brodBody.getTipPlovila());
		b.setUsloviOtkazivanjaRezervacije(brodBody.getUsloviOtkazivanjaRezervacije());
		b.setVlasnik(brodBody.getVlasnik());
		return ResponseEntity.ok().body(b);
	}
	
	public Map<String, Boolean> deleteBrod(Long brodId) throws ResourceNotFoundException{
		Brod brod = this.brodRepository.findById(brodId).orElseThrow(() -> new ResourceNotFoundException("No brod with id: " + brodId));
		this.brodRepository.delete(brod);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
