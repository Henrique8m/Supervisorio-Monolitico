package com.hrodriguesdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrodriguesdev.entity.Pyrometry;

@Repository
public interface PyrometryRepository extends JpaRepository<Pyrometry, Long>{
}
