package com.isa2021.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rezervacija_tbl")
public class Rezervacija {

	private enum StatusRezervacije{
		REZERVISANO, ISPUNJENO, OTKAZANO
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rezervacije")
	private long id;
	@Column(name="status")
	private StatusRezervacije statusRezervacije;
	
	//id narucioca usluge/robe
	@ManyToOne(fetch=FetchType.LAZY)
	private RegistrovaniKorisnik narucilac;
	//id vlasnika usluge/robe
	@ManyToOne(fetch=FetchType.LAZY)
	private PravnoLice prodavac;
	//id usluge/robe
	@ManyToOne(fetch=FetchType.LAZY)
	private RobaIliUsluga roba;
	
	@Column(name="datum_od")
	private Date datumOd;
	@Column(name="datum_do")
	private Date datumDo;
	@Column(name="cena")
	private int cena;
	
	public Rezervacija() {
		super();
	}

	public Rezervacija(StatusRezervacije statusRezervacije, RegistrovaniKorisnik narucilac, PravnoLice prodavac,
			RobaIliUsluga roba, Date datumOd, Date datumDo, int cena) {
		super();
		this.statusRezervacije = statusRezervacije;
		this.narucilac = narucilac;
		this.prodavac = prodavac;
		this.roba = roba;
		this.datumOd = datumOd;
		this.datumDo = datumDo;
		this.cena = cena;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public StatusRezervacije getStatusRezervacije() {
		return statusRezervacije;
	}

	public void setStatusRezervacije(StatusRezervacije statusRezervacije) {
		this.statusRezervacije = statusRezervacije;
	}

	public RegistrovaniKorisnik getNarucilac() {
		return narucilac;
	}

	public void setNarucilac(RegistrovaniKorisnik narucilac) {
		this.narucilac = narucilac;
	}

	public PravnoLice getProdavac() {
		return prodavac;
	}

	public void setProdavac(PravnoLice prodavac) {
		this.prodavac = prodavac;
	}

	public RobaIliUsluga getRoba() {
		return roba;
	}

	public void setRoba(RobaIliUsluga roba) {
		this.roba = roba;
	}

	public Date getDatumOd() {
		return datumOd;
	}

	public void setDatumOd(Date datumOd) {
		this.datumOd = datumOd;
	}

	public Date getDatumDo() {
		return datumDo;
	}

	public void setDatumDo(Date datumDo) {
		this.datumDo = datumDo;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}
}
