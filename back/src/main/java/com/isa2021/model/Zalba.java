package com.isa2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="zalba_tbl")
public class Zalba {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_komentara")
	private long id;
	//ko podnosi zalbu
	@ManyToOne(fetch=FetchType.LAZY)
	private GenericUser podnosilac;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private RobaIliUsluga predmet;
	@Column(name="tekst")
	private String tekstZalbe;
	
	public Zalba() {
		super();
	}

	public Zalba(GenericUser podnosilac, RobaIliUsluga predmet, String tekstZalbe) {
		super();
		this.podnosilac = podnosilac;
		this.predmet = predmet;
		this.tekstZalbe = tekstZalbe;
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
