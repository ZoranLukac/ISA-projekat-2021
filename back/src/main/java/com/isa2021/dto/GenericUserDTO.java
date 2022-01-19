package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Adresa;
import com.isa2021.model.Zahtev;
import com.isa2021.model.Zalba;

public class GenericUserDTO{
	private String emailAdresa;
	private String ime;
	private String prezime;
	private String brojTelefona;
	private String password;
	private Adresa adresa;
	private List<Zalba> listaPodnetihZalbi = new ArrayList<Zalba>();
	private Zahtev zahtev;
	public GenericUserDTO() {
		super();
	}
	public String getEmailAdresa() {
		return emailAdresa;
	}
	public void setEmailAdresa(String emailAdresa) {
		this.emailAdresa = emailAdresa;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBrojTelefona() {
		return brojTelefona;
	}
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public List<Zalba> getListaPodnetihZalbi() {
		return listaPodnetihZalbi;
	}
	public void setListaPodnetihZalbi(List<Zalba> listaPodnetihZalbi) {
		this.listaPodnetihZalbi = listaPodnetihZalbi;
	}
	public Zahtev getZahtev() {
		return zahtev;
	}
	public void setZahtev(Zahtev zahtev) {
		this.zahtev = zahtev;
	}
}
