package com.hrodriguesdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrodriguesdev.entity.Carvao;

@Repository
public interface CarvaoRepository extends JpaRepository<Carvao, Long>{
}
