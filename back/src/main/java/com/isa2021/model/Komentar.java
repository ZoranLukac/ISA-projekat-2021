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

}
