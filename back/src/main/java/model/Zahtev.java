package model;

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
	
	private GenericUser teloZahteva;
	private String tipNaloga;
	private String statusZahteva;
	private String tipZahteva;
	
	public Zahtev(GenericUser teloZahteva, String tipNaloga, String statusZahteva, String tipZahteva) {
		super();
		this.teloZahteva = teloZahteva;
		this.tipNaloga = tipNaloga;
		this.statusZahteva = statusZahteva;
		this.tipZahteva = tipZahteva;
	}
	public GenericUser getTeloZahteva() {
		return teloZahteva;
	}
	public void setTeloZahteva(GenericUser teloZahteva) {
		this.teloZahteva = teloZahteva;
	}
	public String getTipNaloga() {
		return tipNaloga;
	}
	public void setTipNaloga(String tipNaloga) {
		this.tipNaloga = tipNaloga;
	}
	public String getStatusZahteva() {
		return statusZahteva;
	}
	public void setStatusZahteva(String statusZahteva) {
		this.statusZahteva = statusZahteva;
	}
	public String getTipZahteva() {
		return tipZahteva;
	}
	public void setTipZahteva(String tipZahteva) {
		this.tipZahteva = tipZahteva;
	}
	
	
	
}
