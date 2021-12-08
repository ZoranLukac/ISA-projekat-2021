package model;

import java.util.ArrayList;
import java.util.Base64;

public class Vikendica {
	private String naziv;
	private Adresa adresa;
	private String promoOpisVikendice;
	private int brojSoba;
	private int brojKrevetaPoSobi;
	
	private ArrayList<Base64> slikeEnterijera = new ArrayList<Base64>();
	private ArrayList<Base64> slikeEksterijera = new ArrayList<Base64>();
	private ArrayList<Pravilo> listaPravilaPonasanja = new ArrayList<Pravilo>();
	private ArrayList<String> dodatneUsluge = new ArrayList<String>();
	private Cenovnik cenovnik;
	private ArrayList<Komentar> listaKomentara = new ArrayList<Komentar>();
	
	
	public Vikendica(String naziv, Adresa adresa, String promoOpisVikendice, int brojSoba, int brojKrevetaPoSobi,
			ArrayList<Base64> slikeEnterijera, ArrayList<Base64> slikeEksterijera,
			ArrayList<Pravilo> listaPravilaPonasanja, ArrayList<String> dodatneUsluge, Cenovnik cenovnik,
			ArrayList<Komentar> listaKomentara) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.promoOpisVikendice = promoOpisVikendice;
		this.brojSoba = brojSoba;
		this.brojKrevetaPoSobi = brojKrevetaPoSobi;
		this.slikeEnterijera = slikeEnterijera;
		this.slikeEksterijera = slikeEksterijera;
		this.listaPravilaPonasanja = listaPravilaPonasanja;
		this.dodatneUsluge = dodatneUsluge;
		this.cenovnik = cenovnik;
		this.listaKomentara = listaKomentara;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
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
	public ArrayList<Base64> getSlikeEnterijera() {
		return slikeEnterijera;
	}
	public void setSlikeEnterijera(ArrayList<Base64> slikeEnterijera) {
		this.slikeEnterijera = slikeEnterijera;
	}
	public ArrayList<Base64> getSlikeEksterijera() {
		return slikeEksterijera;
	}
	public void setSlikeEksterijera(ArrayList<Base64> slikeEksterijera) {
		this.slikeEksterijera = slikeEksterijera;
	}
	public ArrayList<Pravilo> getListaPravilaPonasanja() {
		return listaPravilaPonasanja;
	}
	public void setListaPravilaPonasanja(ArrayList<Pravilo> listaPravilaPonasanja) {
		this.listaPravilaPonasanja = listaPravilaPonasanja;
	}
	public ArrayList<String> getDodatneUsluge() {
		return dodatneUsluge;
	}
	public void setDodatneUsluge(ArrayList<String> dodatneUsluge) {
		this.dodatneUsluge = dodatneUsluge;
	}
	public Cenovnik getCenovnik() {
		return cenovnik;
	}
	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}
	public ArrayList<Komentar> getListaKomentara() {
		return listaKomentara;
	}
	public void setListaKomentara(ArrayList<Komentar> listaKomentara) {
		this.listaKomentara = listaKomentara;
	}
	
	
}
