package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="prlice_tbl")
public class PravnoLice extends GenericUser{
	//svaki vlasnik objekta/usluge moze imati vise rezervacija na uslugu/robu
	@OneToMany(mappedBy="prodavac", cascade=CascadeType.ALL, orphanRemoval = true)
	@Column(name="rezervacije")
	private List<Rezervacija> listaRezervacija = new ArrayList<Rezervacija>();
	
	public PravnoLice() {
		super();
	}

	public PravnoLice(List<Rezervacija> listaRezervacija) {
		super();
		this.listaRezervacija = listaRezervacija;
	}

	public List<Rezervacija> getListaRezervacija() {
		return listaRezervacija;
	}

	public void setListaRezervacija(List<Rezervacija> listaRezervacija) {
		this.listaRezervacija = listaRezervacija;
	}
}
