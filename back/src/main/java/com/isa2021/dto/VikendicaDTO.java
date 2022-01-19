package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Adresa;

public class VikendicaDTO extends RobaIliUslugaDTO{
	private Adresa adresa;
	private String promoOpisVikendice;
	private int brojSoba;
	private int brojKrevetaPoSobi;
	private List<String> slikeEnterijera = new ArrayList<String>();
	private List<String> slikeEksterijera = new ArrayList<String>();
	private List<String> dodatneUsluge = new ArrayList<String>();
	public VikendicaDTO() {
		super();
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
