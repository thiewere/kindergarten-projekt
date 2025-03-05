package com.example.kindergarten_projekt.repository;

import com.example.kindergarten_projekt.model.TStandort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TStandortRepository extends JpaRepository<TStandort, Integer> {
    List<TStandort> findByStandortName(String standortName);

    List<TStandort> standortName(String standortName);
}
