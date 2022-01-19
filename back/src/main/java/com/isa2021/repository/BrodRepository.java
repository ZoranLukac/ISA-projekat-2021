package com.isa2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isa2021.model.Brod;

@Repository
public interface BrodRepository extends JpaRepository<Brod, Long> {

}
