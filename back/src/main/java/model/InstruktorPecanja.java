package model;

import java.util.ArrayList;

public class InstruktorPecanja extends GenericUser{
	private ArrayList<Avantura> listaAvantura = new ArrayList<Avantura>();

	
	public InstruktorPecanja(String ime, String prezime, String emailAdresa, String brojTelefona, String password,
			Adresa adresa, ArrayList<Rezervacija> listaRezervacija, ArrayList<Avantura> listaAvantura) {
		super(ime, prezime, emailAdresa, brojTelefona, password, adresa, listaRezervacija);
		this.listaAvantura = listaAvantura;
	}

	public ArrayList<Avantura> getListaAvantura() {
		return listaAvantura;
	}

	public void setListaAvantura(ArrayList<Avantura> listaAvantura) {
		this.listaAvantura = listaAvantura;
	}
	
}
