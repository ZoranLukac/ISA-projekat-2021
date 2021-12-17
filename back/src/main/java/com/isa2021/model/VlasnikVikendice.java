package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
//@Table(name="vkdvlasni_tbl")
public class VlasnikVikendice extends PravnoLice{
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true, mappedBy="vlasnik")
	@Column(name="vikendice")
	private List<Vikendica> listaVikendica = new ArrayList<Vikendica>();

	public VlasnikVikendice() {
		super();
	}

	public VlasnikVikendice(List<Vikendica> listaVikendica) {
		super();
		this.listaVikendica = listaVikendica;
	}

	public List<Vikendica> getListaVikendica() {
		return listaVikendica;
	}

	public void setListaVikendica(List<Vikendica> listaVikendica) {
		this.listaVikendica = listaVikendica;
	}
}
