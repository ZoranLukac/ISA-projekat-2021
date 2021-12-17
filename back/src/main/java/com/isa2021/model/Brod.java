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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="brod_tbl")
public class Brod extends RobaIliUsluga{
	
	private enum TipPlovila{
		BROD, CAMAC
	}
	@Column(name="tip_plovila")
	private TipPlovila tipPlovila;
	@Column(name="duzina")
	private int duzinaBroda;
	@Column(name="broj_motora")
	private int brojMotora;
	@Column(name="snaga_motora")
	private int snagaMotoraUKw;
	@Column(name="max_brzina")
	private int maxBrzina;
	@Column(name="promo_opis")
	private String promoOpis;
	@Column(name="kapacitet")
	private int kapacitet;
	@ElementCollection(targetClass = String.class)
	private List<String> navigacionaOprema = new ArrayList<String>();
	@ElementCollection(targetClass = String.class)
	private List<String> slikeEksterijera;
	@ElementCollection(targetClass = String.class)
	private List<String> slikeEnterijera;
	@ElementCollection(targetClass = String.class)
	private List<String> listaDodatneOpremeZaPecanje = new ArrayList<String>();
	public Brod() {
		super();
	}
	public Brod(TipPlovila tipPlovila, int duzinaBroda, int brojMotora, int snagaMotoraUKw, int maxBrzina,
			String promoOpis, int kapacitet, List<String> navigacionaOprema, List<String> slikeEksterijera,
			List<String> slikeEnterijera, List<String> listaDodatneOpremeZaPecanje) {
		super();
		this.tipPlovila = tipPlovila;
		this.duzinaBroda = duzinaBroda;
		this.brojMotora = brojMotora;
		this.snagaMotoraUKw = snagaMotoraUKw;
		this.maxBrzina = maxBrzina;
		this.promoOpis = promoOpis;
		this.kapacitet = kapacitet;
		this.navigacionaOprema = navigacionaOprema;
		this.slikeEksterijera = slikeEksterijera;
		this.slikeEnterijera = slikeEnterijera;
		this.listaDodatneOpremeZaPecanje = listaDodatneOpremeZaPecanje;
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
