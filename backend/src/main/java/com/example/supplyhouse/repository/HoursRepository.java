package com.example.supplyhouse.repository;

import com.example.supplyhouse.model.Hours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface HoursRepository extends JpaRepository<Hours, Long> {
    List<Hours> findByDateAfter(LocalDate date);
}
