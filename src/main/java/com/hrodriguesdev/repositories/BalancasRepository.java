package com.hrodriguesdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrodriguesdev.entity.Balancas;

@Repository
public interface BalancasRepository extends JpaRepository<Balancas, Long>{
}
