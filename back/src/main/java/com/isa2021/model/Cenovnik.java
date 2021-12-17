package com.isa2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cenovnik_tbl")
public class Cenovnik {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="cena_dana")
	private int cenaPoDanu;
	@Column(name="popust")
	private int procenatPopusta;
	
	public Cenovnik(int cenaPoDanu, int procenatPopusta) {
		super();
		this.cenaPoDanu = cenaPoDanu;
		this.procenatPopusta = procenatPopusta;
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
