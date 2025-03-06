package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.model.TKinder;

import java.time.LocalDate;
import java.util.List;

public interface AnwesenheitService  {
    TAnwesenheit addAnwesenheit(TAnwesenheit anwesenheit);
    TAnwesenheit updateAnwesenheit(TAnwesenheit anwesenheit, Integer anwesenheitId);

    List<TAnwesenheit> getAllAnwesenheit();
    List<TAnwesenheit> getAnwesenheitByKinder(TKinder awKind);
    List<TAnwesenheit> getAnwesenheitByDatum(LocalDate datum);


    String deleteAnwesenheitById(Integer id);
}
