package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

public class BrodDTO extends RobaIliUslugaDTO{
	private enum TipPlovila{
		BROD, CAMAC
	}
	private TipPlovila tipPlovila;
	private int duzinaBroda;
	private int brojMotora;
	private int snagaMotoraUKw;
	private int maxBrzina;
	private String promoOpis;
	private int kapacitet;
	private List<String> navigacionaOprema = new ArrayList<String>();
	private List<String> slikeEksterijera;
	private List<String> slikeEnterijera;
	private List<String> listaDodatneOpremeZaPecanje = new ArrayList<String>();
	public BrodDTO() {
		super();
	}
	public TipPlovila getTipPlovila() {
		return tipPlovila;
	}
	public void setTipPlovila(TipPlovila tipPlovila) {
		this.tipPlovila = tipPlovila;
	}
	public int getDuzinaBroda() {
		return duzinaBroda;
	}
	public void setDuzinaBroda(int duzinaBroda) {
		this.duzinaBroda = duzinaBroda;
	}
	public int getBrojMotora() {
		return brojMotora;
	}
	public void setBrojMotora(int brojMotora) {
		this.brojMotora = brojMotora;
	}
	public int getSnagaMotoraUKw() {
		return snagaMotoraUKw;
	}
	public void setSnagaMotoraUKw(int snagaMotoraUKw) {
		this.snagaMotoraUKw = snagaMotoraUKw;
	}
	public int getMaxBrzina() {
		return maxBrzina;
	}
	public void setMaxBrzina(int maxBrzina) {
		this.maxBrzina = maxBrzina;
	}
	public String getPromoOpis() {
		return promoOpis;
	}
	public void setPromoOpis(String promoOpis) {
		this.promoOpis = promoOpis;
	}
	public int getKapacitet() {
		return kapacitet;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	public List<String> getNavigacionaOprema() {
		return navigacionaOprema;
	}
	public void setNavigacionaOprema(List<String> navigacionaOprema) {
		this.navigacionaOprema = navigacionaOprema;
	}
	public List<String> getSlikeEksterijera() {
		return slikeEksterijera;
	}
	public void setSlikeEksterijera(List<String> slikeEksterijera) {
		this.slikeEksterijera = slikeEksterijera;
	}
	public List<String> getSlikeEnterijera() {
		return slikeEnterijera;
	}
	public void setSlikeEnterijera(List<String> slikeEnterijera) {
		this.slikeEnterijera = slikeEnterijera;
	}
	public List<String> getListaDodatneOpremeZaPecanje() {
		return listaDodatneOpremeZaPecanje;
	}
	public void setListaDodatneOpremeZaPecanje(List<String> listaDodatneOpremeZaPecanje) {
		this.listaDodatneOpremeZaPecanje = listaDodatneOpremeZaPecanje;
	}
}
