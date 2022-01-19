package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.Zahtev;
import com.isa2021.repository.ZahtevRepository;

@Service
public class ZahtevService {

	@Autowired
	public ZahtevRepository zahtevRepository;
	
	public ResponseEntity<Zahtev> updateZahtev(Long zahtevId, Zahtev zahtevBody) throws ResourceNotFoundException{
		Zahtev z = this.zahtevRepository.findById(zahtevId).orElseThrow(() -> new ResourceNotFoundException("No zahtev by id: " + zahtevId));
		z.setId(zahtevBody.getId());
		z.setTeloZahteva(zahtevBody.getTeloZahteva());
		z.setTipNaloga(zahtevBody.getTipNaloga());
		z.setStatusZahteva(zahtevBody.getStatusZahteva());
		z.setTipZahteva(zahtevBody.getTipZahteva());
		return ResponseEntity.ok().body(z);
	}
	
	public ResponseEntity<Zahtev> getZahtevById(Long zahtevId) throws ResourceNotFoundException{
		Zahtev z = this.zahtevRepository.findById(zahtevId).orElseThrow(() -> new ResourceNotFoundException("No zahtev by id: " + zahtevId));
		return ResponseEntity.ok().body(z);
	}
	
	public Map<String, Boolean> deleteZahtev(Long zahtevId) throws ResourceNotFoundException{
		Zahtev z = this.zahtevRepository.findById(zahtevId).orElseThrow(() -> new ResourceNotFoundException("No zahtev by id: " + zahtevId));
		this.zahtevRepository.delete(z);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
