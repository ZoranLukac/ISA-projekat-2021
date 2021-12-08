package model;

import java.util.ArrayList;

public class VlasnikVikendice extends GenericUser{
	private ArrayList<Vikendica> listaVikendica = new ArrayList<Vikendica>();

	public VlasnikVikendice(String ime, String prezime, String emailAdresa, String brojTelefona, String password,
			Adresa adresa, ArrayList<Rezervacija> listaRezervacija, ArrayList<Vikendica> listaVikendica) {
		super(ime, prezime, emailAdresa, brojTelefona, password, adresa, listaRezervacija);
		this.listaVikendica = listaVikendica;
	}

	public ArrayList<Vikendica> getListaVikendica() {
		return listaVikendica;
	}

	public void setListaVikendica(ArrayList<Vikendica> listaVikendica) {
		this.listaVikendica = listaVikendica;
	}
	
}
