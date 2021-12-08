package model;

import java.sql.Date;

public class Rezervacija {

	private enum StatusRezervacije{
		REZERVISANO, ISPUNJENO, OTKAZANO
	}
	private String statusRezervacije;
	private String idNarucioca;
	private String idProdavca;
	private String idRobeIliUsluge;
	private Date datumOd;
	private Date datumDo;
	private int cena;
	
	
	public Rezervacija(String statusRezervacije, String idNarucioca, String idProdavca, String idRobeIliUsluge,
			Date datumOd, Date datumDo, int cena) {
		super();
		this.statusRezervacije = statusRezervacije;
		this.idNarucioca = idNarucioca;
		this.idProdavca = idProdavca;
		this.idRobeIliUsluge = idRobeIliUsluge;
		this.datumOd = datumOd;
		this.datumDo = datumDo;
		this.cena = cena;
	}
	public String getStatusRezervacije() {
		return statusRezervacije;
	}
	public void setStatusRezervacije(String statusRezervacije) {
		this.statusRezervacije = statusRezervacije;
	}
	public String getIdNarucioca() {
		return idNarucioca;
	}
	public void setIdNarucioca(String idNarucioca) {
		this.idNarucioca = idNarucioca;
	}
	public String getIdProdavca() {
		return idProdavca;
	}
	public void setIdProdavca(String idProdavca) {
		this.idProdavca = idProdavca;
	}
	public String getIdRobeIliUsluge() {
		return idRobeIliUsluge;
	}
	public void setIdRobeIliUsluge(String idRobeIliUsluge) {
		this.idRobeIliUsluge = idRobeIliUsluge;
	}
	public Date getDatumOd() {
		return datumOd;
	}
	public void setDatumOd(Date datumOd) {
		this.datumOd = datumOd;
	}
	public Date getDatumDo() {
		return datumDo;
	}
	public void setDatumDo(Date datumDo) {
		this.datumDo = datumDo;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	
	
	
}
