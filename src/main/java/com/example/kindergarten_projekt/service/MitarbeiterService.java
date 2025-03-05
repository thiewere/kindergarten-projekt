package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TDienstplan;
import com.example.kindergarten_projekt.model.TMitarbeiter;

import java.time.LocalDate;
import java.util.List;

//TODO: update Methoden
public interface MitarbeiterService {

    // Mitarbeiter Services
    List<TMitarbeiter> getAllMitarbeiter();
    TMitarbeiter getMitarbeiterById(Integer id);
    TMitarbeiter addMitarbeiter(TMitarbeiter mitarbeiter);
    void deleteMitarbeiterById(Integer id);



    // Dienstplan Services
    List<TDienstplan> getAllDienstplan();
    TDienstplan getDienstplanByMitarbeiterId(Integer mitarbeiterId);
    TDienstplan getDienstplanByDienstplanDatum(LocalDate dienstplanDatum);
    TDienstplan addDienstplan(TDienstplan dienstplan);
    void deleteDienstplanById(Integer id);

}
