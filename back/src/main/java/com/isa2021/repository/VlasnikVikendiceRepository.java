package com.isa2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isa2021.model.VlasnikVikendice;
@Repository
public interface VlasnikVikendiceRepository extends JpaRepository<VlasnikVikendice, String> {

}