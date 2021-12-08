package model;

import java.util.ArrayList;

public class GenericUser {
	private String ime;
	private String prezime;
	private String emailAdresa;
	private String brojTelefona;
	private String password;
	private Adresa adresa;
	private ArrayList<Rezervacija> listaRezervacija = new ArrayList<Rezervacija>();
	
	public GenericUser(String ime, String prezime, String emailAdresa, String brojTelefona, String password,
			Adresa adresa, ArrayList<Rezervacija> listaRezervacija) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.emailAdresa = emailAdresa;
		this.brojTelefona = brojTelefona;
		this.password = password;
		this.adresa = adresa;
		this.listaRezervacija = listaRezervacija;
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
	public String getEmailAdresa() {
		return emailAdresa;
	}
	public void setEmailAdresa(String emailAdresa) {
		this.emailAdresa = emailAdresa;
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
	public ArrayList<Rezervacija> getListaRezervacija() {
		return listaRezervacija;
	}
	public void setListaRezervacija(ArrayList<Rezervacija> listaRezervacija) {
		this.listaRezervacija = listaRezervacija;
	}
	
	
}
