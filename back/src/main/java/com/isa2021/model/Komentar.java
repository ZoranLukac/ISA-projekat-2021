package com.isa2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="komentari_tbl")
public class Komentar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_kom")
	private long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private RegistrovaniKorisnik komentator;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private RobaIliUsluga predmet;
	@Column(name="ocena")
	private int ocena;
	@Column(name="tekst")
	private String tekstKomentara;
	
	private enum StatusKomentara{
		NA_CEKANJU, ODOBREN, OBRISAN, OGRANICENE_VIDLJIVOSTI
	}
	@Column(name="status")
	private StatusKomentara statusKomentara;
	
	public Komentar() {
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

	public StatusKomentara getStatusKomentara() {
		return statusKomentara;
	}

	public void setStatusKomentara(StatusKomentara statusKomentara) {
		this.statusKomentara = statusKomentara;
	}

}
