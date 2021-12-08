package model;

import java.util.ArrayList;

public class VlasnikBroda extends GenericUser{
	private ArrayList<Brod> listaBrodova = new ArrayList<Brod>();

	
	public VlasnikBroda(String ime, String prezime, String emailAdresa, String brojTelefona, String password,
			Adresa adresa, ArrayList<Rezervacija> listaRezervacija, ArrayList<Brod> listaBrodova) {
		super(ime, prezime, emailAdresa, brojTelefona, password, adresa, listaRezervacija);
		this.listaBrodova = listaBrodova;
	}

	public ArrayList<Brod> getListaBrodova() {
		return listaBrodova;
	}

	public void setListaBrodova(ArrayList<Brod> listaBrodova) {
		this.listaBrodova = listaBrodova;
	}
	
}
