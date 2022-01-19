package com.isa2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isa2021.model.Cenovnik;

@Repository
public interface CenovnikRepository extends JpaRepository<Cenovnik, Long> {

}
