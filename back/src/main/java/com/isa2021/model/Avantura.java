package com.isa2021.model;

import java.sql.Date;
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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="avantura_tbl")
public class Avantura extends RobaIliUsluga{
	
	@Column(name="bio")
	private String bioInstruktora;
	@Column(name="max_ucesnika")
	private int maxUcesnika;
	@Column(name="datum_od")
	private Date odDatuma;
	@Column(name="datum_do")
	private Date doDatuma;
	//avantura mora imati spisak prijavljenih korisnika
	//anotacija OneToMany jer na jednu avanturu moze biti prijavljeno 0 i vise reg. korisnika
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="avantura_ucesnici")
	private List<RegistrovaniKorisnik> listaUcesnika = new ArrayList<RegistrovaniKorisnik>();
	@ElementCollection(targetClass = String.class)
	private List<String> spisakOpremeUzAvanturu = new ArrayList<String>();
	@ElementCollection(targetClass = String.class)
	private List<String> slikeAmbijenta;
	
	public Avantura() {
		super();
	}

	public Avantura(String bioInstruktora, int maxUcesnika, Date odDatuma, Date doDatuma,
			List<RegistrovaniKorisnik> listaUcesnika, List<String> spisakOpremeUzAvanturu,
			List<String> slikeAmbijenta) {
		super();
		this.bioInstruktora = bioInstruktora;
		this.maxUcesnika = maxUcesnika;
		this.odDatuma = odDatuma;
		this.doDatuma = doDatuma;
		this.listaUcesnika = listaUcesnika;
		this.spisakOpremeUzAvanturu = spisakOpremeUzAvanturu;
		this.slikeAmbijenta = slikeAmbijenta;
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

	public List<RegistrovaniKorisnik> getListaUcesnika() {
		return listaUcesnika;
	}

	public void setListaUcesnika(List<RegistrovaniKorisnik> listaUcesnika) {
		this.listaUcesnika = listaUcesnika;
	}

	public List<String> getSpisakOpremeUzAvanturu() {
		return spisakOpremeUzAvanturu;
	}

	public void setSpisakOpremeUzAvanturu(List<String> spisakOpremeUzAvanturu) {
		this.spisakOpremeUzAvanturu = spisakOpremeUzAvanturu;
	}

	public List<String> getSlikeAmbijenta() {
		return slikeAmbijenta;
	}

	public void setSlikeAmbijenta(List<String> slikeAmbijenta) {
		this.slikeAmbijenta = slikeAmbijenta;
	}
	
}
