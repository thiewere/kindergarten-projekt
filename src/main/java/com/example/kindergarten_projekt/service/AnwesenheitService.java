package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TAnwesenheit;

import java.sql.Date;
import java.util.List;

public interface AnwesenheitService  {
    TAnwesenheit addAnwesenheit(TAnwesenheit anwesenheit);
    TAnwesenheit updateAnwesenheit(TAnwesenheit anwesenheit);

    List<TAnwesenheit> getAllAnwesenheit();
    List<TAnwesenheit> getAnwesenheitByKinderId(int kinderId);
    List<TAnwesenheit> getAnwesenheitByDatum(Date datum);

    List<TAnwesenheit> updateAnwesenheitByKinderId(int kinderId);

    List<TAnwesenheit> deleteAnwesenheitByKinderId(int kinderId);
    List<TAnwesenheit> deleteAnwesenheitByDatum(Date datum);
}
