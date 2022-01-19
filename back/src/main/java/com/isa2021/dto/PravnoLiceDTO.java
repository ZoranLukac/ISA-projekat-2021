package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Rezervacija;

public class PravnoLiceDTO extends GenericUserDTO{
	private List<Rezervacija> listaRezervacija = new ArrayList<Rezervacija>();

	public PravnoLiceDTO() {
		super();
	}

	public List<Rezervacija> getListaRezervacija() {
		return listaRezervacija;
	}

	public void setListaRezervacija(List<Rezervacija> listaRezervacija) {
		this.listaRezervacija = listaRezervacija;
	}
}
