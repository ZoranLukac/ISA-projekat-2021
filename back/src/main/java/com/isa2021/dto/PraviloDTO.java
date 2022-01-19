package com.isa2021.dto;

public class PraviloDTO {
	private long id;
	private String opisPravila;
	private boolean dozvoljeno = false;
	public PraviloDTO() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
