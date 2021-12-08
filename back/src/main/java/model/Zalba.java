package model;

public class Zalba {
	private String idAutora;
	private String idVlasnikaPredmetaZalbe;
	private String idPredmetaZalbe;
	private String tekstZalbe;
	
	public Zalba(String idAutora, String idVlasnikaPredmetaZalbe, String idPredmetaZalbe, String tekstZalbe) {
		super();
		this.idAutora = idAutora;
		this.idVlasnikaPredmetaZalbe = idVlasnikaPredmetaZalbe;
		this.idPredmetaZalbe = idPredmetaZalbe;
		this.tekstZalbe = tekstZalbe;
	}
	public String getIdAutora() {
		return idAutora;
	}
	public void setIdAutora(String idAutora) {
		this.idAutora = idAutora;
	}
	public String getIdVlasnikaPredmetaZalbe() {
		return idVlasnikaPredmetaZalbe;
	}
	public void setIdVlasnikaPredmetaZalbe(String idVlasnikaPredmetaZalbe) {
		this.idVlasnikaPredmetaZalbe = idVlasnikaPredmetaZalbe;
	}
	public String getIdPredmetaZalbe() {
		return idPredmetaZalbe;
	}
	public void setIdPredmetaZalbe(String idPredmetaZalbe) {
		this.idPredmetaZalbe = idPredmetaZalbe;
	}
	public String getTekstZalbe() {
		return tekstZalbe;
	}
	public void setTekstZalbe(String tekstZalbe) {
		this.tekstZalbe = tekstZalbe;
	}
	
	
}
