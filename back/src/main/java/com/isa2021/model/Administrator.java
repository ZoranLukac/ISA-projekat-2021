package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name = "ADMIN_TBL")
public class Administrator extends GenericUser {
//	//OneToMany anotacija jer zahtev ne cuva podatke o adminu koji ga obradjuje
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "admin_zahtevi", referencedColumnName = "emailAdresa")
	@ElementCollection
	private List<Zahtev> listaZahteva = new ArrayList<Zahtev>();
//	//OneToMany anotacija jer komentar ne cuva podatke o adminu koji ga je odobrio
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "admin_komentari", referencedColumnName = "emailAdresa")
	@ElementCollection
	private List<Komentar> listaKomentara = new ArrayList<Komentar>();
//	//OneToMany anotacija jer zalba ne cuva podatke o adminu koji ju je obradio
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="admin_zalbe", referencedColumnName="emailAdresa")
	@ElementCollection
	private List<Zalba> listaZalbi = new ArrayList<Zalba>();
	
	public Administrator() {
		super();
	}

	public Administrator(List<Zahtev> listaZahteva, List<Komentar> listaKomentara, List<Zalba> listaZalbi) {
		super();
		this.listaZahteva = listaZahteva;
		this.listaKomentara = listaKomentara;
		this.listaZalbi = listaZalbi;
	}

	public List<Zahtev> getListaZahteva() {
		return listaZahteva;
	}

	public void setListaZahteva(List<Zahtev> listaZahteva) {
		this.listaZahteva = listaZahteva;
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

	
	
}
