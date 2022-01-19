package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Komentar;
import com.isa2021.model.Rezervacija;

public class RegistrovaniKorisnikDTO extends GenericUserDTO {
	private enum Kategorije{
		BRONZA, SREBRO, ZLATO, PLATINA
	}
	private List<Komentar> listaKomentara = new ArrayList<Komentar>();
	private Kategorije kategorijaKorisnika;
	private List<Rezervacija> listaRezervacija = new ArrayList<Rezervacija>();
	
	public RegistrovaniKorisnikDTO() {
		super();
	}
	public List<Komentar> getListaKomentara() {
		return listaKomentara;
	}
	public void setListaKomentara(List<Komentar> listaKomentara) {
		this.listaKomentara = listaKomentara;
	}
	public Kategorije getKategorijaKorisnika() {
		return kategorijaKorisnika;
	}
	public void setKategorijaKorisnika(Kategorije kategorijaKorisnika) {
		this.kategorijaKorisnika = kategorijaKorisnika;
	}
	public List<Rezervacija> getListaRezervacija() {
		return listaRezervacija;
	}
	public void setListaRezervacija(List<Rezervacija> listaRezervacija) {
		this.listaRezervacija = listaRezervacija;
	}
}
