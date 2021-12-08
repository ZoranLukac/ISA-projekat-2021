package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Base64;

public class Avantura {
	private String nazivAvanture;
	private String bioInstruktora;
	private int maxUcesnika;
	private ArrayList<Pravilo> listaPravila = new ArrayList<Pravilo>();
	private ArrayList<String> usloviOtkazivanjaRezervacije;
	private Date odDatuma;
	private Date doDatuma;
	private String idInstruktora;
	private ArrayList<RegistrovaniKorisnik> listaUcesnika = new ArrayList<RegistrovaniKorisnik>();
	private ArrayList<String> spisakOpremeUzAvanturu = new ArrayList<String>();
	private Base64 slikeAmbijenta;
	private Cenovnik cenovnik;
	private ArrayList<Komentar> listaKomentara = new ArrayList<Komentar>();
	
	
	
	public Avantura(String nazivAvanture, String bioInstruktora, int maxUcesnika, ArrayList<Pravilo> listaPravila,
			ArrayList<String> usloviOtkazivanjaRezervacije, Date odDatuma, Date doDatuma, String idInstruktora,
			ArrayList<RegistrovaniKorisnik> listaUcesnika, ArrayList<String> spisakOpremeUzAvanturu,
			Base64 slikeAmbijenta, Cenovnik cenovnik, ArrayList<Komentar> listaKomentara) {
		super();
		this.nazivAvanture = nazivAvanture;
		this.bioInstruktora = bioInstruktora;
		this.maxUcesnika = maxUcesnika;
		this.listaPravila = listaPravila;
		this.usloviOtkazivanjaRezervacije = usloviOtkazivanjaRezervacije;
		this.odDatuma = odDatuma;
		this.doDatuma = doDatuma;
		this.idInstruktora = idInstruktora;
		this.listaUcesnika = listaUcesnika;
		this.spisakOpremeUzAvanturu = spisakOpremeUzAvanturu;
		this.slikeAmbijenta = slikeAmbijenta;
		this.cenovnik = cenovnik;
		this.listaKomentara = listaKomentara;
	}
	public String getNazivAvanture() {
		return nazivAvanture;
	}
	public void setNazivAvanture(String nazivAvanture) {
		this.nazivAvanture = nazivAvanture;
	}
	public String getBioInstruktora() {
		return bioInstruktora;
	}
	public void setBioInstruktora(String bioInstruktora) {
		this.bioInstruktora = bioInstruktora;
	}
	public int getMaxUcesnika() {
		return maxUcesnika;
	}
	public void setMaxUcesnika(int maxUcesnika) {
		this.maxUcesnika = maxUcesnika;
	}
	public ArrayList<Pravilo> getListaPravila() {
		return listaPravila;
	}
	public void setListaPravila(ArrayList<Pravilo> listaPravila) {
		this.listaPravila = listaPravila;
	}
	public ArrayList<String> getUsloviOtkazivanjaRezervacije() {
		return usloviOtkazivanjaRezervacije;
	}
	public void setUsloviOtkazivanjaRezervacije(ArrayList<String> usloviOtkazivanjaRezervacije) {
		this.usloviOtkazivanjaRezervacije = usloviOtkazivanjaRezervacije;
	}
	public Date getOdDatuma() {
		return odDatuma;
	}
	public void setOdDatuma(Date odDatuma) {
		this.odDatuma = odDatuma;
	}
	public Date getDoDatuma() {
		return doDatuma;
	}
	public void setDoDatuma(Date doDatuma) {
		this.doDatuma = doDatuma;
	}
	public String getIdInstruktora() {
		return idInstruktora;
	}
	public void setIdInstruktora(String idInstruktora) {
		this.idInstruktora = idInstruktora;
	}
	public ArrayList<RegistrovaniKorisnik> getListaUcesnika() {
		return listaUcesnika;
	}
	public void setListaUcesnika(ArrayList<RegistrovaniKorisnik> listaUcesnika) {
		this.listaUcesnika = listaUcesnika;
	}
	public ArrayList<String> getSpisakOpremeUzAvanturu() {
		return spisakOpremeUzAvanturu;
	}
	public void setSpisakOpremeUzAvanturu(ArrayList<String> spisakOpremeUzAvanturu) {
		this.spisakOpremeUzAvanturu = spisakOpremeUzAvanturu;
	}
	public Base64 getSlikeAmbijenta() {
		return slikeAmbijenta;
	}
	public void setSlikeAmbijenta(Base64 slikeAmbijenta) {
		this.slikeAmbijenta = slikeAmbijenta;
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
