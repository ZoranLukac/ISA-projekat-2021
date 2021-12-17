package com.isa2021.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address_tbl")
public class Adresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "ulica")
	private String ulica;
	@Column(name = "broj")
	private int broj;
	@Column(name = "mesto")
	private String mesto;
	@Column(name = "drzava")
	private String drzava;
	
	public Adresa() {
		super();
	}
	public Adresa(String ulica, int broj, String mesto, String drzava) {
		super();
		this.ulica = ulica;
		this.broj = broj;
		this.mesto = mesto;
		this.drzava = drzava;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
