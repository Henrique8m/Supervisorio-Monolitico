package com.hrodriguesdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrodriguesdev.entity.Instante;

@Repository
public interface InstanteRepository extends JpaRepository<Instante, Long>{

}
