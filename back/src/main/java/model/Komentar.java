package model;

public class Komentar {
	private String idKomentatora;
	private String idPredmetaKomentara;
	private int ocena;
	private String tekstKomentara;
	private enum StatusKomentara{
		NA_CEKANJU, ODOBREN, OBRISAN, OGRANICENE_VIDLJIVOSTI
	}
	private String statusKomentara;
	
	public Komentar(String idKomentatora, String idPredmetaKomentara, int ocena, String tekstKomentara,
			String statusKomentara) {
		super();
		this.idKomentatora = idKomentatora;
		this.idPredmetaKomentara = idPredmetaKomentara;
		this.ocena = ocena;
		this.tekstKomentara = tekstKomentara;
		this.statusKomentara = statusKomentara;
	}
	public String getIdKomentatora() {
		return idKomentatora;
	}
	public void setIdKomentatora(String idKomentatora) {
		this.idKomentatora = idKomentatora;
	}
	public String getIdPredmetaKomentara() {
		return idPredmetaKomentara;
	}
	public void setIdPredmetaKomentara(String idPredmetaKomentara) {
		this.idPredmetaKomentara = idPredmetaKomentara;
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
	public String getStatusKomentara() {
		return statusKomentara;
	}
	public void setStatusKomentara(String statusKomentara) {
		this.statusKomentara = statusKomentara;
	}
	
	
	
	
}
