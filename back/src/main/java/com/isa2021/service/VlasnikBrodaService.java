package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.VlasnikBroda;
import com.isa2021.repository.VlasnikBrodaRepository;

@Service
public class VlasnikBrodaService {
	
	@Autowired
	public VlasnikBrodaRepository vlasnikBrodaRepository;
	
	public ResponseEntity<VlasnikBroda> updateVlasnikBroda(String vlasnikBrodaId, VlasnikBroda vlasnikBrodaBody) throws ResourceNotFoundException{
		VlasnikBroda vb = this.vlasnikBrodaRepository.findById(vlasnikBrodaId).orElseThrow(() -> new ResourceNotFoundException("No vlasnik broda by id: " + vlasnikBrodaId));
		vb.setListaBrodova(vlasnikBrodaBody.getListaBrodova());
		vb.setListaRezervacija(vlasnikBrodaBody.getListaRezervacija());
		vb.setIme(vlasnikBrodaBody.getIme());
		vb.setPrezime(vlasnikBrodaBody.getPrezime());
		vb.setEmailAdresa(vlasnikBrodaBody.getEmailAdresa());
		vb.setBrojTelefona(vlasnikBrodaBody.getBrojTelefona());
		vb.setPassword(vlasnikBrodaBody.getPassword());
		vb.setAdresa(vlasnikBrodaBody.getAdresa());
		vb.setListaPodnetihZalbi(vlasnikBrodaBody.getListaPodnetihZalbi());
		vb.setZahtev(vlasnikBrodaBody.getZahtev());
		return ResponseEntity.ok().body(vb);
	}
	
	public ResponseEntity<VlasnikBroda> getVlasnikBrodaById(String vlasnikBrodaId) throws ResourceNotFoundException{
		VlasnikBroda vb = this.vlasnikBrodaRepository.findById(vlasnikBrodaId).orElseThrow(() -> new ResourceNotFoundException("No vlasnik broda by id: " + vlasnikBrodaId));
		return ResponseEntity.ok().body(vb);
	}
	
	public Map<String, Boolean> deleteVlasnikBroda(String vlasnikBrodaId) throws ResourceNotFoundException{
		VlasnikBroda vb = this.vlasnikBrodaRepository.findById(vlasnikBrodaId).orElseThrow(() -> new ResourceNotFoundException("No vlasnik broda by id: " + vlasnikBrodaId));
		this.vlasnikBrodaRepository.delete(vb);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
