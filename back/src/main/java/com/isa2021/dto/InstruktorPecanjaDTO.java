package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Avantura;

public class InstruktorPecanjaDTO extends PravnoLiceDTO{
	private List<Avantura> listaAvantura = new ArrayList<Avantura>();

	public InstruktorPecanjaDTO() {
		super();
	}

	public List<Avantura> getListaAvantura() {
		return listaAvantura;
	}

	public void setListaAvantura(List<Avantura> listaAvantura) {
		this.listaAvantura = listaAvantura;
	}

}
