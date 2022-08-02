package com.hrodriguesdev.repositories;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hrodriguesdev.entity.Pyrometry;

@Repository
public interface PyrometryRepository extends JpaRepository<Pyrometry, Long>{

	@Query
	Optional<Pyrometry> findByDate(Date date);
}
