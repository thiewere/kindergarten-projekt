package com.example.kindergarten_projekt.repository;

import com.example.kindergarten_projekt.model.TDienstplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface TDienstplanRepository extends JpaRepository<TDienstplan, Integer> {
    TDienstplan findByDienstplanDatum(LocalDate dienstplanDate);
}
