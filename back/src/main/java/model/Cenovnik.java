package model;

public class Cenovnik {
	private int cenaPoDanu;
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
