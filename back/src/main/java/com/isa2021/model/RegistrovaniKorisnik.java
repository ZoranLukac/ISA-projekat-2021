package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="korisnik_tbl")
public class RegistrovaniKorisnik extends GenericUser {
	private enum Kategorije{
		BRONZA, SREBRO, ZLATO, PLATINA
	}
	@OneToMany(cascade = CascadeType.ALL, mappedBy="komentator")
	private List<Komentar> listaKomentara = new ArrayList<Komentar>();
	
	@Column(name="kategorija")
	private Kategorije kategorijaKorisnika;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="narucilac")
	@Column(name="rezervacije")
	private List<Rezervacija> listaRezervacija = new ArrayList<Rezervacija>();
	public RegistrovaniKorisnik() {
		super();
	}
	public RegistrovaniKorisnik(List<Komentar> listaKomentara, Kategorije kategorijaKorisnika,
			List<Rezervacija> listaRezervacija) {
		super();
		this.listaKomentara = listaKomentara;
		this.kategorijaKorisnika = kategorijaKorisnika;
		this.listaRezervacija = listaRezervacija;
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
