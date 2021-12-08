package model;

import java.util.ArrayList;

public class Administrator {

	private String ime;
	private String prezime;
	private String emailAdresa;
	private String brojTelefona;
	private String password;
	private Adresa adresa;
	private ArrayList<Zahtev> listaZahteva = new ArrayList<Zahtev>();
	private ArrayList<Komentar> listaKomentara = new ArrayList<Komentar>();
	
	
	
	
	public Administrator(String ime, String prezime, String emailAdresa, String brojTelefona, String password,
			Adresa adresa, ArrayList<Zahtev> listaZahteva, ArrayList<Komentar> listaKomentara) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.emailAdresa = emailAdresa;
		this.brojTelefona = brojTelefona;
		this.password = password;
		this.adresa = adresa;
		this.listaZahteva = listaZahteva;
		this.listaKomentara = listaKomentara;
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
	public ArrayList<Zahtev> getListaZahteva() {
		return listaZahteva;
	}
	public void setListaZahteva(ArrayList<Zahtev> listaZahteva) {
		this.listaZahteva = listaZahteva;
	}
	public ArrayList<Komentar> getListaKomentara() {
		return listaKomentara;
	}
	public void setListaKomentara(ArrayList<Komentar> listaKomentara) {
		this.listaKomentara = listaKomentara;
	}
	
	
}
