package com.isa2021.dto;

import com.isa2021.model.RegistrovaniKorisnik;
import com.isa2021.model.RobaIliUsluga;

public class KomentarDTO {
	private enum StatusKomentara{
		NA_CEKANJU, ODOBREN, OBRISAN, OGRANICENE_VIDLJIVOSTI
	}
	private long id;
	private RegistrovaniKorisnik komentator;
	private RobaIliUsluga predmet;
	private int ocena;
	private String tekstKomentara;
	public KomentarDTO() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public RegistrovaniKorisnik getKomentator() {
		return komentator;
	}
	public void setKomentator(RegistrovaniKorisnik komentator) {
		this.komentator = komentator;
	}
	public RobaIliUsluga getPredmet() {
		return predmet;
	}
	public void setPredmet(RobaIliUsluga predmet) {
		this.predmet = predmet;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getTekstKomentara() {
		return tekstKomentara;
	}
	public void setTekstKomentara(String tekstKomentara) {
		this.tekstKomentara = tekstKomentara;
	}
	
}
