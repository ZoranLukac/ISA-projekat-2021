package model;

import java.util.ArrayList;

public class RegistrovaniKorisnik extends GenericUser {
	private enum Kategorije{
		BRONZA, SREBRO, ZLATO, PLATINA
	}
	
	private String kategorijaKorisnika;
	private ArrayList<String> listaPretplata = new ArrayList<String>();
	

	public RegistrovaniKorisnik(String ime, String prezime, String emailAdresa, String brojTelefona, String password,
			Adresa adresa, ArrayList<Rezervacija> listaRezervacija, String kategorijaKorisnika) {
		super(ime, prezime, emailAdresa, brojTelefona, password, adresa, listaRezervacija);
		this.kategorijaKorisnika = kategorijaKorisnika;
	}

	public String getKategorijaKorisnika() {
		return kategorijaKorisnika;
	}

	public void setKategorijaKorisnika(String kategorijaKorisnika) {
		this.kategorijaKorisnika = kategorijaKorisnika;
	}
	
	
	
}
