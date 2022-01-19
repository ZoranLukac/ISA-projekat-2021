package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Adresa;
import com.isa2021.repository.AdresaRepository;

@Service
public class AdresaService {

	@Autowired
	public AdresaRepository adresaRepository;
	
	public ResponseEntity<Adresa> updateAdresa(String adresaId, Adresa adresaBody) throws ResourceNotFoundException{
		long id = Long.parseLong(adresaId);
		Adresa a = this.adresaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No adresa with id: " + id));
		a.setBroj(adresaBody.getBroj());
		a.setDrzava(adresaBody.getDrzava());
		a.setMesto(adresaBody.getMesto());
		a.setUlica(adresaBody.getUlica());
		return ResponseEntity.ok().body(a);
	}
	
	public Map<String, Boolean> deleteAdresa(String adresaId) throws ResourceNotFoundException{
		Adresa a = this.adresaRepository.findById(Long.parseLong(adresaId)).orElseThrow(() -> new ResourceNotFoundException("No adresa with id: " + adresaId));
		this.adresaRepository.delete(a);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return response;
	}
	
}
