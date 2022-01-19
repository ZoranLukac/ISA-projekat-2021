package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Cenovnik;
import com.isa2021.model.Komentar;
import com.isa2021.model.Pravilo;
import com.isa2021.model.PravnoLice;
import com.isa2021.model.Zalba;

public class RobaIliUslugaDTO {
	private long id;
	private String naziv;
	private PravnoLice vlasnik;
	private List<Komentar> listaKomentara = new ArrayList<Komentar>(); 
	private List<Zalba> listaZalbi = new ArrayList<Zalba>();
	private List<String> usloviOtkazivanjaRezervacije = new ArrayList<String>();
	private List<Pravilo> listaPravila = new ArrayList<Pravilo>();
	private Cenovnik cenovnik;
	public RobaIliUslugaDTO() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public PravnoLice getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(PravnoLice vlasnik) {
		this.vlasnik = vlasnik;
	}
	public List<Komentar> getListaKomentara() {
		return listaKomentara;
	}
	public void setListaKomentara(List<Komentar> listaKomentara) {
		this.listaKomentara = listaKomentara;
	}
	public List<Zalba> getListaZalbi() {
		return listaZalbi;
	}
	public void setListaZalbi(List<Zalba> listaZalbi) {
		this.listaZalbi = listaZalbi;
	}
	public List<String> getUsloviOtkazivanjaRezervacije() {
		return usloviOtkazivanjaRezervacije;
	}
	public void setUsloviOtkazivanjaRezervacije(List<String> usloviOtkazivanjaRezervacije) {
		this.usloviOtkazivanjaRezervacije = usloviOtkazivanjaRezervacije;
	}
	public List<Pravilo> getListaPravila() {
		return listaPravila;
	}
	public void setListaPravila(List<Pravilo> listaPravila) {
		this.listaPravila = listaPravila;
	}
	public Cenovnik getCenovnik() {
		return cenovnik;
	}
	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}
}
