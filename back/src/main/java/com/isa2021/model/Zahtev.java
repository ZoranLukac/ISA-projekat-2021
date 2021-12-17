package com.isa2021.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "zahtevi")
public class Zahtev {
	private enum TipNaloga{
		KORISNIK, VLASNIK_BRODA, VLASNIK_VIKENDICE, INSTRUKTOR_PECANJA, ADMINISTRATOR
	}
	private enum StatusZahteva{
		U_OBRADI, ODOBREN, ODBIJEN, BANOVAN
	}
	private enum TipZahteva{
		BRISANJE_NALOGA, REGISTRACIJA_NALOGA
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private GenericUser teloZahteva;
	@Column(name="tip_naloga")
	private TipNaloga tipNaloga;
	@Column(name="status_zahteva")
	private StatusZahteva statusZahteva;
	@Column(name="tip_zahteva")
	private TipZahteva tipZahteva;
	
	public Zahtev(GenericUser teloZahteva, TipNaloga tipNaloga, StatusZahteva statusZahteva, TipZahteva tipZahteva) {
		super();
		this.teloZahteva = teloZahteva;
		this.tipNaloga = tipNaloga;
		this.statusZahteva = statusZahteva;
		this.tipZahteva = tipZahteva;
	}
	public Zahtev() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public GenericUser getTeloZahteva() {
		return teloZahteva;
	}
	public void setTeloZahteva(GenericUser teloZahteva) {
		this.teloZahteva = teloZahteva;
	}
	public TipNaloga getTipNaloga() {
		return tipNaloga;
	}
	public void setTipNaloga(TipNaloga tipNaloga) {
		this.tipNaloga = tipNaloga;
	}
	public StatusZahteva getStatusZahteva() {
		return statusZahteva;
	}
	public void setStatusZahteva(StatusZahteva statusZahteva) {
		this.statusZahteva = statusZahteva;
	}
	public TipZahteva getTipZahteva() {
		return tipZahteva;
	}
	public void setTipZahteva(TipZahteva tipZahteva) {
		this.tipZahteva = tipZahteva;
	}
	
	
	
	
}
