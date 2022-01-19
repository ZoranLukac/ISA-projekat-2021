package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.VlasnikVikendice;
import com.isa2021.repository.VlasnikVikendiceRepository;

@Service
public class VlasnikVikendiceService {

	@Autowired
	public VlasnikVikendiceRepository vlasnikVikendiceRepository;
	
	public ResponseEntity<VlasnikVikendice> updateVlasnikVikendice(String vlasnikVikendiceId, VlasnikVikendice vlasnikVikendiceBody) throws ResourceNotFoundException{
		VlasnikVikendice vv = this.vlasnikVikendiceRepository.findById(vlasnikVikendiceId).orElseThrow(() -> new ResourceNotFoundException("No vlasnik vikendice by id: " + vlasnikVikendiceId));
		vv.setListaVikendica(vlasnikVikendiceBody.getListaVikendica());
		vv.setListaRezervacija(vlasnikVikendiceBody.getListaRezervacija());
		vv.setIme(vlasnikVikendiceBody.getIme());
		vv.setPrezime(vlasnikVikendiceBody.getPrezime());
		vv.setEmailAdresa(vlasnikVikendiceBody.getEmailAdresa());
		vv.setBrojTelefona(vlasnikVikendiceBody.getBrojTelefona());
		vv.setPassword(vlasnikVikendiceBody.getPassword());
		vv.setAdresa(vlasnikVikendiceBody.getAdresa());
		vv.setListaPodnetihZalbi(vlasnikVikendiceBody.getListaPodnetihZalbi());
		vv.setZahtev(vlasnikVikendiceBody.getZahtev());
		return ResponseEntity.ok().body(vv);
	}
	
	public ResponseEntity<VlasnikVikendice> getVlasnikVikendiceById(String vlasnikVikendiceId) throws ResourceNotFoundException{
		VlasnikVikendice vv = this.vlasnikVikendiceRepository.findById(vlasnikVikendiceId).orElseThrow(() -> new ResourceNotFoundException("No vlasnik vikendice by id: " + vlasnikVikendiceId));
		return ResponseEntity.ok().body(vv);
	}
	
	public Map<String, Boolean> deleteVlasnikVikendice(String vlasnikVikendiceId) throws ResourceNotFoundException{
		VlasnikVikendice vv = this.vlasnikVikendiceRepository.findById(vlasnikVikendiceId).orElseThrow(() -> new ResourceNotFoundException("No vlasnik vikendice by id: " + vlasnikVikendiceId));
		this.vlasnikVikendiceRepository.delete(vv);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
