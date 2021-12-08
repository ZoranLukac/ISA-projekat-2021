package model;

public class Pravilo {
	private String opisPravila;
	private boolean dozvoljeno = false;
	
	public Pravilo(String opisPravila, boolean dozvoljeno) {
		super();
		this.opisPravila = opisPravila;
		this.dozvoljeno = dozvoljeno;
	}
	public String getOpisPravila() {
		return opisPravila;
	}
	public void setOpisPravila(String opisPravila) {
		this.opisPravila = opisPravila;
	}
	public boolean isDozvoljeno() {
		return dozvoljeno;
	}
	public void setDozvoljeno(boolean dozvoljeno) {
		this.dozvoljeno = dozvoljeno;
	}
	
}
