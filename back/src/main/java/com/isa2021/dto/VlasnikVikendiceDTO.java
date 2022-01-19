package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Vikendica;

public class VlasnikVikendiceDTO extends PravnoLiceDTO{
	private List<Vikendica> listaVikendica = new ArrayList<Vikendica>();

	public VlasnikVikendiceDTO() {
		super();
	}

	public List<Vikendica> getListaVikendica() {
		return listaVikendica;
	}

	public void setListaVikendica(List<Vikendica> listaVikendica) {
		this.listaVikendica = listaVikendica;
	}
}
