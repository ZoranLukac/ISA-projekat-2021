package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="instr_tbl")
public class InstruktorPecanja extends PravnoLice{
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true, mappedBy="vlasnik")
	@Column(name="avanture")
	private List<Avantura> listaAvantura = new ArrayList<Avantura>();

	public InstruktorPecanja() {
		super();
	}

	public InstruktorPecanja(List<Avantura> listaAvantura) {
		super();
		this.listaAvantura = listaAvantura;
	}

	public List<Avantura> getListaAvantura() {
		return listaAvantura;
	}

	public void setListaAvantura(List<Avantura> listaAvantura) {
		this.listaAvantura = listaAvantura;
	}


}
