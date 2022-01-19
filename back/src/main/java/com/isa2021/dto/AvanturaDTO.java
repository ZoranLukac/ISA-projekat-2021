package com.isa2021.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.RegistrovaniKorisnik;

public class AvanturaDTO extends RobaIliUslugaDTO{
	private String bioInstruktora;
	private int maxUcesnika;
	private Date odDatuma;
	private Date doDatuma;
	private List<RegistrovaniKorisnik> listaUcesnika = new ArrayList<RegistrovaniKorisnik>();
	private List<String> spisakOpremeUzAvanturu = new ArrayList<String>();
	private List<String> slikeAmbijenta;
	public AvanturaDTO() {
		super();
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
