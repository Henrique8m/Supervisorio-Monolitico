package com.hrodriguesdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrodriguesdev.entity.Grafico;

@Repository
public interface GraficoRepository extends JpaRepository<Grafico, Long>{
}
