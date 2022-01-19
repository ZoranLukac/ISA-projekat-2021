package com.isa2021.dto;

import com.isa2021.model.GenericUser;

public class ZahtevDTO {
	private enum TipNaloga{
		KORISNIK, VLASNIK_BRODA, VLASNIK_VIKENDICE, INSTRUKTOR_PECANJA, ADMINISTRATOR
	}
	private enum StatusZahteva{
		U_OBRADI, ODOBREN, ODBIJEN, BANOVAN
	}
	private enum TipZahteva{
		BRISANJE_NALOGA, REGISTRACIJA_NALOGA
	}
	private long id;
	private GenericUser teloZahteva;
	private TipNaloga tipNaloga;
	private StatusZahteva statusZahteva;
	private TipZahteva tipZahteva;
	public ZahtevDTO() {
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
