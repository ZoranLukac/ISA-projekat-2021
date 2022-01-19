package com.isa2021.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="roba_tbl")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class RobaIliUsluga {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	@Column(name="naziv")
	private String naziv;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private PravnoLice vlasnik;
	//na jednu Robu/Uslugu moze biti vise komentara
	@OneToMany(mappedBy="predmet", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Komentar> listaKomentara = new ArrayList<Komentar>();
	//na jednu Robu/Uslugu moze biti vise zalbi
	@OneToMany(mappedBy="predmet", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Zalba> listaZalbi = new ArrayList<Zalba>();
	@ElementCollection(targetClass = String.class)
	private List<String> usloviOtkazivanjaRezervacije = new ArrayList<String>();
	@OneToMany(mappedBy="robaIliUsluga", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Pravilo> listaPravila = new ArrayList<Pravilo>();	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="cenovnik_id", referencedColumnName="id")
	private Cenovnik cenovnik;
	public RobaIliUsluga() {
		super();
	}
	public RobaIliUsluga(String naziv, PravnoLice vlasnik, List<Komentar> listaKomentara,
			List<String> usloviOtkazivanjaRezervacije, List<Pravilo> listaPravila, Cenovnik cenovnik) {
		super();
		this.naziv = naziv;
		this.vlasnik = vlasnik;
		this.listaKomentara = listaKomentara;
		this.usloviOtkazivanjaRezervacije = usloviOtkazivanjaRezervacije;
		this.listaPravila = listaPravila;
		this.cenovnik = cenovnik;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public PravnoLice getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(PravnoLice vlasnik) {
		this.vlasnik = vlasnik;
	}
	public List<Komentar> getListaKomentara() {
		return listaKomentara;
	}
	public void setListaKomentara(List<Komentar> listaKomentara) {
		this.listaKomentara = listaKomentara;
	}
	public List<String> getUsloviOtkazivanjaRezervacije() {
		return usloviOtkazivanjaRezervacije;
	}
	public void setUsloviOtkazivanjaRezervacije(List<String> usloviOtkazivanjaRezervacije) {
		this.usloviOtkazivanjaRezervacije = usloviOtkazivanjaRezervacije;
	}
	public List<Pravilo> getListaPravila() {
		return listaPravila;
	}
	public void setListaPravila(List<Pravilo> listaPravila) {
		this.listaPravila = listaPravila;
	}
	public Cenovnik getCenovnik() {
		return cenovnik;
	}
	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}
}
