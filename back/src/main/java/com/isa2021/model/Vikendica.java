package com.isa2021.model;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="vikendica_tbl")
public class Vikendica extends RobaIliUsluga{
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="vkd_adresa")
	private Adresa adresa;
	@Column(name="opis_vkd")
	private String promoOpisVikendice;
	@Column(name="br_soba")
	private int brojSoba;
	@Column(name="br_kreveta")
	private int brojKrevetaPoSobi;
	@ElementCollection(targetClass = String.class)
	private List<String> slikeEnterijera = new ArrayList<String>();
	@ElementCollection(targetClass = String.class)
	private List<String> slikeEksterijera = new ArrayList<String>();
	@ElementCollection(targetClass = String.class)
	private List<String> dodatneUsluge = new ArrayList<String>();
	public Vikendica() {
		super();
	}
	public Vikendica(Adresa adresa, String promoOpisVikendice, int brojSoba, int brojKrevetaPoSobi,
			List<String> slikeEnterijera, List<String> slikeEksterijera, List<String> dodatneUsluge) {
		super();
		this.adresa = adresa;
		this.promoOpisVikendice = promoOpisVikendice;
		this.brojSoba = brojSoba;
		this.brojKrevetaPoSobi = brojKrevetaPoSobi;
		this.slikeEnterijera = slikeEnterijera;
		this.slikeEksterijera = slikeEksterijera;
		this.dodatneUsluge = dodatneUsluge;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public String getPromoOpisVikendice() {
		return promoOpisVikendice;
	}
	public void setPromoOpisVikendice(String promoOpisVikendice) {
		this.promoOpisVikendice = promoOpisVikendice;
	}
	public int getBrojSoba() {
		return brojSoba;
	}
	public void setBrojSoba(int brojSoba) {
		this.brojSoba = brojSoba;
	}
	public int getBrojKrevetaPoSobi() {
		return brojKrevetaPoSobi;
	}
	public void setBrojKrevetaPoSobi(int brojKrevetaPoSobi) {
		this.brojKrevetaPoSobi = brojKrevetaPoSobi;
	}
	public List<String> getSlikeEnterijera() {
		return slikeEnterijera;
	}
	public void setSlikeEnterijera(List<String> slikeEnterijera) {
		this.slikeEnterijera = slikeEnterijera;
	}
	public List<String> getSlikeEksterijera() {
		return slikeEksterijera;
	}
	public void setSlikeEksterijera(List<String> slikeEksterijera) {
		this.slikeEksterijera = slikeEksterijera;
	}
	public List<String> getDodatneUsluge() {
		return dodatneUsluge;
	}
	public void setDodatneUsluge(List<String> dodatneUsluge) {
		this.dodatneUsluge = dodatneUsluge;
	}	
}
