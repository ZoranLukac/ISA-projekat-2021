package com.isa2021.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isa2021.exceptions.ResourceNotFoundException;
import com.isa2021.model.RegistrovaniKorisnik;
import com.isa2021.repository.RegistrovaniKorisnikRepository;

@Service
public class RegistrovaniKorisnikService {
	
	@Autowired
	public RegistrovaniKorisnikRepository registrovaniKorisnikRepository;
	
	public ResponseEntity<RegistrovaniKorisnik> updateRegistrovaniKorisnik(String registrovaniKorisnikId, RegistrovaniKorisnik registrovaniKorisnikBody) throws ResourceNotFoundException{
		RegistrovaniKorisnik rk = this.registrovaniKorisnikRepository.findById(registrovaniKorisnikId).orElseThrow(() -> new ResourceNotFoundException("No registrovani korisnik by id: " + registrovaniKorisnikId));
		rk.setListaKomentara(registrovaniKorisnikBody.getListaKomentara());
		rk.setKategorijaKorisnika(registrovaniKorisnikBody.getKategorijaKorisnika());
		rk.setListaRezervacija(registrovaniKorisnikBody.getListaRezervacija());
		rk.setIme(registrovaniKorisnikBody.getIme());
		rk.setPrezime(registrovaniKorisnikBody.getPrezime());
		rk.setEmailAdresa(registrovaniKorisnikBody.getEmailAdresa());
		rk.setBrojTelefona(registrovaniKorisnikBody.getBrojTelefona());
		rk.setPassword(registrovaniKorisnikBody.getPassword());
		rk.setAdresa(registrovaniKorisnikBody.getAdresa());
		rk.setListaPodnetihZalbi(registrovaniKorisnikBody.getListaPodnetihZalbi());
		rk.setZahtev(registrovaniKorisnikBody.getZahtev());
		return ResponseEntity.ok().body(rk);
	}
	
	public ResponseEntity<RegistrovaniKorisnik> getRegistrovaniKorisnikById(String registrovaniKorisnikId) throws ResourceNotFoundException{
		RegistrovaniKorisnik rk = this.registrovaniKorisnikRepository.findById(registrovaniKorisnikId).orElseThrow(() -> new ResourceNotFoundException("No registrovani korisnik by id: " + registrovaniKorisnikId));
		return ResponseEntity.ok().body(rk);
	}
	
	public Map<String, Boolean> deleteRegistrovaniKorisnik(String registrovaniKorisnikId) throws ResourceNotFoundException{
		RegistrovaniKorisnik rk = this.registrovaniKorisnikRepository.findById(registrovaniKorisnikId).orElseThrow(() -> new ResourceNotFoundException("No registrovani korisnik by id: " + registrovaniKorisnikId));
		this.registrovaniKorisnikRepository.delete(rk);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
}
