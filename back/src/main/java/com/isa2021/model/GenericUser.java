package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user_tbl")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class GenericUser {
	@Id
	@Column(name="email", unique = true)
	private String emailAdresa;
	@Column(name="ime")
	private String ime;
	@Column(name="prezime")
	private String prezime;
	
	@Column(name="broj_telefona")
	private String brojTelefona;
	@Column(name="password")
	private String password;
	
	//jednosmerna asocijacija jer adresa ne cuva podatke o korisniku
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Adresa adresa;
	
	//lista zalbi koje podnosi korisnik, jedan korisnik moze podneti N zalbi
	@OneToMany(cascade=CascadeType.ALL, mappedBy="podnosilac")
	private List<Zalba> listaPodnetihZalbi = new ArrayList<Zalba>();
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="teloZahteva")
	private Zahtev zahtev;

	public GenericUser() {
		super();
	}

	public GenericUser(String ime, String prezime, String emailAdresa, String brojTelefona, String password,
			Adresa adresa, List<Zalba> listaPodnetihZalbi, Zahtev zahtev) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.emailAdresa = emailAdresa;
		this.brojTelefona = brojTelefona;
		this.password = password;
		this.adresa = adresa;
		this.listaPodnetihZalbi = listaPodnetihZalbi;
		this.zahtev = zahtev;
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
