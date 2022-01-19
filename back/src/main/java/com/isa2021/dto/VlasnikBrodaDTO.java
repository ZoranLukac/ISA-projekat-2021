package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Brod;

public class VlasnikBrodaDTO extends PravnoLiceDTO{
	private List<Brod> listaBrodova = new ArrayList<Brod>();

	public VlasnikBrodaDTO() {
		super();
	}

	public List<Brod> getListaBrodova() {
		return listaBrodova;
	}

	public void setListaBrodova(List<Brod> listaBrodova) {
		this.listaBrodova = listaBrodova;
	}
}
