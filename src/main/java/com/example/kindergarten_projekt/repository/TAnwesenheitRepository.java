package com.example.kindergarten_projekt.repository;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface TAnwesenheitRepository extends JpaRepository<TAnwesenheit, Integer> {

    List<TAnwesenheit> getTAnwesenheitByAwDatum(LocalDate awDatum);

    Iterable<Integer> id(Integer id);

    List<TAnwesenheit> removeTAnwesenheitByAwDatum(LocalDate awDatum);

    List<TAnwesenheit> removeTAnwesenheitById(Integer id);

    Date existsByAwDatum(LocalDate awDatum);
}
