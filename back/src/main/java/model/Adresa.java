package model;

public class Adresa {
	private String ulica;
	private int broj;
	private String mesto;
	private String drzava;
	
	
	
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
	
}
