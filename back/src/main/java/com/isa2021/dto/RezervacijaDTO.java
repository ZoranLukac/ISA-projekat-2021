package com.isa2021.dto;

import java.sql.Date;

import com.isa2021.model.PravnoLice;
import com.isa2021.model.RegistrovaniKorisnik;
import com.isa2021.model.RobaIliUsluga;

public class RezervacijaDTO {
	private enum StatusRezervacije{
		REZERVISANO, ISPUNJENO, OTKAZANO
	}
	private long id;
	private StatusRezervacije statusRezervacije;
	private RegistrovaniKorisnik narucilac;
	private PravnoLice prodavac;
	private RobaIliUsluga roba;
	private Date datumOd;
	private Date datumDo;
	private int cena;
	
	public RezervacijaDTO() {
		super();
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
