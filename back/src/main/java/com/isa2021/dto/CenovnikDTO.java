package com.isa2021.dto;

public class CenovnikDTO {
	private long id;
	private int cenaPoDanu;
	private int procenatPopusta;
	public CenovnikDTO() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCenaPoDanu() {
		return cenaPoDanu;
	}
	public void setCenaPoDanu(int cenaPoDanu) {
		this.cenaPoDanu = cenaPoDanu;
	}
	public int getProcenatPopusta() {
		return procenatPopusta;
	}
	public void setProcenatPopusta(int procenatPopusta) {
		this.procenatPopusta = procenatPopusta;
	}
}
