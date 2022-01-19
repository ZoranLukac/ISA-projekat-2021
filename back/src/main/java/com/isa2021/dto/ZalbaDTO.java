package com.isa2021.dto;

import com.isa2021.model.GenericUser;
import com.isa2021.model.RobaIliUsluga;

public class ZalbaDTO {
	private long id;
	private GenericUser podnosilac;
	private RobaIliUsluga predmet;
	private String tekstZalbe;
	public ZalbaDTO() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public GenericUser getPodnosilac() {
		return podnosilac;
	}
	public void setPodnosilac(GenericUser podnosilac) {
		this.podnosilac = podnosilac;
	}
	public RobaIliUsluga getPredmet() {
		return predmet;
	}
	public void setPredmet(RobaIliUsluga predmet) {
		this.predmet = predmet;
	}
	public String getTekstZalbe() {
		return tekstZalbe;
	}
	public void setTekstZalbe(String tekstZalbe) {
		this.tekstZalbe = tekstZalbe;
	}
}
