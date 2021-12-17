package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="brodovlasnik_tbl")
public class VlasnikBroda extends PravnoLice{
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true, mappedBy="vlasnik")
	@Column(name="brodovi")
	private List<Brod> listaBrodova = new ArrayList<Brod>();

	public VlasnikBroda() {
		super();
	}
	public VlasnikBroda(List<Brod> listaBrodova) {
		super();
		this.listaBrodova = listaBrodova;
	}
	public List<Brod> getListaBrodova() {
		return listaBrodova;
	}

	public void setListaBrodova(List<Brod> listaBrodova) {
		this.listaBrodova = listaBrodova;
	}
}
