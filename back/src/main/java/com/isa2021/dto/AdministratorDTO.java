package com.isa2021.dto;

import java.util.ArrayList;
import java.util.List;

import com.isa2021.model.Komentar;
import com.isa2021.model.Zahtev;
import com.isa2021.model.Zalba;

public class AdministratorDTO extends GenericUserDTO {
	private List<Zahtev> listaZahtevaDTO = new ArrayList<Zahtev>();
	private List<Komentar> listaKomentaraDTO = new ArrayList<Komentar>();
	private List<Zalba> listaZalbiDTO = new ArrayList<Zalba>();
	public AdministratorDTO() {
		super();
	}
	public List<Zahtev> getListaZahtevaDTO() {
		return listaZahtevaDTO;
	}
	public void setListaZahtevaDTO(List<Zahtev> listaZahtevaDTO) {
		this.listaZahtevaDTO = listaZahtevaDTO;
	}
	public List<Komentar> getListaKomentaraDTO() {
		return listaKomentaraDTO;
	}
	public void setListaKomentaraDTO(List<Komentar> listaKomentaraDTO) {
		this.listaKomentaraDTO = listaKomentaraDTO;
	}
	public List<Zalba> getListaZalbiDTO() {
		return listaZalbiDTO;
	}
	public void setListaZalbiDTO(List<Zalba> listaZalbiDTO) {
		this.listaZalbiDTO = listaZalbiDTO;
	}
	
	
}
