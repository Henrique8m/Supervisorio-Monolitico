package com.hrodriguesdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrodriguesdev.entity.Pirometro;

@Repository
public interface PirometroRepository extends JpaRepository<Pirometro, Long>{
}
