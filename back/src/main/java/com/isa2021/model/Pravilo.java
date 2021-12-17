package com.isa2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pravila_tbl")
public class Pravilo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="opis")
	private String opisPravila;
	@Column(name="dozvoljeno")
	private boolean dozvoljeno = false;
	
	public Pravilo() {
		super();
	}
	public Pravilo(String opisPravila, boolean dozvoljeno) {
		super();
		this.opisPravila = opisPravila;
		this.dozvoljeno = dozvoljeno;
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
