package model;

import java.util.ArrayList;
import java.util.Base64;

public class Brod {
	private enum tipPlovila{
		BROD, CAMAC
	}
	private String nazivBroda;
	private String vlasnikBroda;
	private int duzinaBroda;
	private int brojMotora;
	private int snagaMotoraUKw;
	private int maxBrzina;
	private String promoOpis;
	private int kapacitet;
	private ArrayList<Pravilo> listaPravilaPonasanja = new ArrayList<Pravilo>();
	private ArrayList<String> usloviOtkazivanjaRezervacije = new ArrayList<String>();
	private ArrayList<String> navigacionaOprema = new ArrayList<String>();
	private ArrayList<Base64> slikeEksterijera;
	private ArrayList<Base64> slikeEnterijera;
	private ArrayList<String> listaDodatneOpremeZaPecanje = new ArrayList<String>();
	private Cenovnik cenovnik;
	private ArrayList<Komentar> listaKomentara = new ArrayList<Komentar>();
	
	
	
	public Brod(String nazivBroda, String vlasnikBroda, int duzinaBroda, int brojMotora, int snagaMotoraUKw,
			int maxBrzina, String promoOpis, int kapacitet, ArrayList<Pravilo> listaPravilaPonasanja,
			ArrayList<String> usloviOtkazivanjaRezervacije, ArrayList<String> navigacionaOprema,
			ArrayList<Base64> slikeEksterijera, ArrayList<Base64> slikeEnterijera,
			ArrayList<String> listaDodatneOpremeZaPecanje, Cenovnik cenovnik, ArrayList<Komentar> listaKomentara) {
		super();
		this.nazivBroda = nazivBroda;
		this.vlasnikBroda = vlasnikBroda;
		this.duzinaBroda = duzinaBroda;
		this.brojMotora = brojMotora;
		this.snagaMotoraUKw = snagaMotoraUKw;
		this.maxBrzina = maxBrzina;
		this.promoOpis = promoOpis;
		this.kapacitet = kapacitet;
		this.listaPravilaPonasanja = listaPravilaPonasanja;
		this.usloviOtkazivanjaRezervacije = usloviOtkazivanjaRezervacije;
		this.navigacionaOprema = navigacionaOprema;
		this.slikeEksterijera = slikeEksterijera;
		this.slikeEnterijera = slikeEnterijera;
		this.listaDodatneOpremeZaPecanje = listaDodatneOpremeZaPecanje;
		this.cenovnik = cenovnik;
		this.listaKomentara = listaKomentara;
	}
	public String getNazivBroda() {
		return nazivBroda;
	}
	public void setNazivBroda(String nazivBroda) {
		this.nazivBroda = nazivBroda;
	}
	public String getVlasnikBroda() {
		return vlasnikBroda;
	}
	public void setVlasnikBroda(String vlasnikBroda) {
		this.vlasnikBroda = vlasnikBroda;
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
	public ArrayList<Pravilo> getListaPravilaPonasanja() {
		return listaPravilaPonasanja;
	}
	public void setListaPravilaPonasanja(ArrayList<Pravilo> listaPravilaPonasanja) {
		this.listaPravilaPonasanja = listaPravilaPonasanja;
	}
	public ArrayList<String> getUsloviOtkazivanjaRezervacije() {
		return usloviOtkazivanjaRezervacije;
	}
	public void setUsloviOtkazivanjaRezervacije(ArrayList<String> usloviOtkazivanjaRezervacije) {
		this.usloviOtkazivanjaRezervacije = usloviOtkazivanjaRezervacije;
	}
	public ArrayList<String> getNavigacionaOprema() {
		return navigacionaOprema;
	}
	public void setNavigacionaOprema(ArrayList<String> navigacionaOprema) {
		this.navigacionaOprema = navigacionaOprema;
	}
	public ArrayList<Base64> getSlikeEksterijera() {
		return slikeEksterijera;
	}
	public void setSlikeEksterijera(ArrayList<Base64> slikeEksterijera) {
		this.slikeEksterijera = slikeEksterijera;
	}
	public ArrayList<Base64> getSlikeEnterijera() {
		return slikeEnterijera;
	}
	public void setSlikeEnterijera(ArrayList<Base64> slikeEnterijera) {
		this.slikeEnterijera = slikeEnterijera;
	}
	public ArrayList<String> getListaDodatneOpremeZaPecanje() {
		return listaDodatneOpremeZaPecanje;
	}
	public void setListaDodatneOpremeZaPecanje(ArrayList<String> listaDodatneOpremeZaPecanje) {
		this.listaDodatneOpremeZaPecanje = listaDodatneOpremeZaPecanje;
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
