package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Avantura;
import com.isa2021.repository.AvanturaRepository;

@Service
public class AvanturaService {

	@Autowired
	public AvanturaRepository avanturaRepository;
	
	public ResponseEntity<Avantura> updateAvantura(String avanturaId, Avantura avanturaBody) throws ResourceNotFoundException{
		long id = Long.parseLong(avanturaId);
		Avantura a = (Avantura) this.avanturaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No avantura with id: " + avanturaId));
		a.setBioInstruktora(avanturaBody.getBioInstruktora());
		a.setCenovnik(avanturaBody.getCenovnik());
		a.setDoDatuma(avanturaBody.getDoDatuma());
		a.setOdDatuma(avanturaBody.getDoDatuma());
		//ovo verovatno ne treba da stoji ovde
		a.setListaKomentara(avanturaBody.getListaKomentara());
		a.setListaPravila(avanturaBody.getListaPravila());
		a.setListaUcesnika(a.getListaUcesnika());
		a.setMaxUcesnika(avanturaBody.getMaxUcesnika());
		a.setNaziv(avanturaBody.getNaziv());
		a.setSlikeAmbijenta(avanturaBody.getSlikeAmbijenta());
		a.setSpisakOpremeUzAvanturu(avanturaBody.getSpisakOpremeUzAvanturu());
		a.setUsloviOtkazivanjaRezervacije(avanturaBody.getUsloviOtkazivanjaRezervacije());
		a.setVlasnik(avanturaBody.getVlasnik());
		return ResponseEntity.ok().body(a);
	}
	
	public ResponseEntity<Avantura> getAvanturaById(Long avanturaId) throws ResourceNotFoundException{
		Avantura a = (Avantura) this.avanturaRepository.findById(avanturaId).orElseThrow(() -> new ResourceNotFoundException("No avantura with id: " + avanturaId));
		return ResponseEntity.ok().body(a);
	}
	
	public Map<String, Boolean> deleteAvantura(String avanturaId) throws ResourceNotFoundException{
		Avantura avantura = (Avantura) this.avanturaRepository.findById(Long.parseLong(avanturaId)).orElseThrow(() -> new ResourceNotFoundException("No avantura with id: " + avanturaId));
		this.avanturaRepository.delete(avantura);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
