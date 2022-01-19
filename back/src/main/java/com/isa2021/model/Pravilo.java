package com.isa2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.engine.FetchTiming;

@Entity
@Table(name="pravila_tbl")
public class Pravilo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private RobaIliUsluga robaIliUsluga;
	
	@Column(name="opis")
	private String opisPravila;
	@Column(name="dozvoljeno")
	private boolean dozvoljeno = false;
	
	public Pravilo() {
		super();
	}

	public Pravilo(RobaIliUsluga robaIliUsluga, String opisPravila, boolean dozvoljeno) {
		super();
		this.robaIliUsluga = robaIliUsluga;
		this.opisPravila = opisPravila;
		this.dozvoljeno = dozvoljeno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public RobaIliUsluga getRobaIliUsluga() {
		return robaIliUsluga;
	}

	public void setRobaIliUsluga(RobaIliUsluga robaIliUsluga) {
		this.robaIliUsluga = robaIliUsluga;
	}

	public String getOpisPravila() {
		return opisPravila;
	}

	public void setOpisPravila(String opisPravila) {
		this.opisPravila = opisPravila;
	}

	public boolean isDozvoljeno() {
		return dozvoljeno;
	}

	public void setDozvoljeno(boolean dozvoljeno) {
		this.dozvoljeno = dozvoljeno;
	}
}
