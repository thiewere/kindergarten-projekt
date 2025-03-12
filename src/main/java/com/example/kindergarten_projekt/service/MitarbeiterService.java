package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TDienstplan;
import com.example.kindergarten_projekt.model.TMitarbeiter;

import java.time.LocalDate;
import java.util.List;

public interface MitarbeiterService {

    // Mitarbeiter Services
    List<TMitarbeiter> getAllMitarbeiter();
    TMitarbeiter getMitarbeiterById(Long id);
    TMitarbeiter addMitarbeiter(TMitarbeiter mitarbeiter);
    void deleteMitarbeiterById(Long id);
    TMitarbeiter updateMitarbeiter(TMitarbeiter mitarbeiter, Long id);



    // Dienstplan Services
    List<TDienstplan> getAllDienstplan();
    TDienstplan getDienstplanByMitarbeiterId(Long mitarbeiterId);
    TDienstplan getDienstplanByDienstplanDatum(LocalDate dienstplanDatum);
    TDienstplan addDienstplan(TDienstplan dienstplan);
    void deleteDienstplanById(Long id);
    TDienstplan updateDienstplan(TDienstplan dienstplan, Long id);

}
