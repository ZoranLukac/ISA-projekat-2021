package com.isa2021.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isa2021.model.Adresa;

@Repository
public interface AdresaRepository extends JpaRepository<Adresa, Long> {

	
	@Query(nativeQuery = true, value = "SELECT DISTINCT adr from" + " Adresa adr_tbl " + "WHERE (:mestoNaziv is null or adr_tbl.mesto = :mestoNaziv)"
			+ " AND (:ulicaNaziv is null or adr_tbl.ulica = :ulicaNaziv)" + "AND (:broj is null or adr_tbl.broj = broj)" + " AND (:drzavaNaziv is null or adr_tbl.drzava = :drzavaNaziv)")
	List<Adresa> findAdreseByParameters(@Param("mestoNaziv") String mestoNaziv, @Param("ulicaNaziv") String ulicaNaziv, @Param("broj") int broj, @Param("drzavaNaziv") String drzavaNaziv);
}
