package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TDienstplan;
import com.example.kindergarten_projekt.model.TMitarbeiter;
import com.example.kindergarten_projekt.repository.TDienstplanRepository;
import com.example.kindergarten_projekt.repository.TMitarbeiterRepository;
import com.example.kindergarten_projekt.service.MitarbeiterService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MitarbeiterServiceImplement implements MitarbeiterService {

    private final TMitarbeiterRepository mitarbeiterRepository;
    private final TDienstplanRepository dienstplanRepository;

    public MitarbeiterServiceImplement(TMitarbeiterRepository mitarbeiterRepository,TDienstplanRepository dienstplanRepository) {
        this.mitarbeiterRepository = mitarbeiterRepository;
        this.dienstplanRepository = dienstplanRepository;
    }

    //Mitarbeiter

    @Override
    public List<TMitarbeiter> getAllMitarbeiter() {
        return mitarbeiterRepository.findAll();
    }

    @Override
    public TMitarbeiter getMitarbeiterById(Integer id) {
        return mitarbeiterRepository.findById(id).orElseThrow(() -> new RuntimeException("Mitarbeiter nicht gefunden"));
    }

    @Override
    public TMitarbeiter addMitarbeiter(TMitarbeiter mitarbeiter) {
        return mitarbeiterRepository.save(mitarbeiter);
    }

    @Override
    public void deleteMitarbeiterById(Integer id) {
        mitarbeiterRepository.deleteById(id);
    }

    @Override
    public TMitarbeiter updateMitarbeiter(TMitarbeiter mitarbeiter, Integer id) {
        return null;
    }

    //Dienstplan

    @Override
    public List<TDienstplan> getAllDienstplan() {
        return dienstplanRepository.findAll();
    }

    @Override
    public TDienstplan getDienstplanByMitarbeiterId(Integer mitarbeiterId) {
        return dienstplanRepository.findById(mitarbeiterId).orElseThrow(()
                -> new RuntimeException("Mitarbeiter nicht gefunden"));
    }

    @Override
    public TDienstplan getDienstplanByDienstplanDatum(LocalDate dienstplanDatum) {

        return dienstplanRepository.findByDienstplanDatum(dienstplanDatum);
    }

    @Override
    public TDienstplan addDienstplan(TDienstplan dienstplan) {
        return dienstplanRepository.save(dienstplan);
    }

    @Override
    public void deleteDienstplanById(Integer id) {
        dienstplanRepository.deleteById(id);
    }

    @Override
    public TDienstplan updateDienstplan(TDienstplan dienstplan, Integer id) {
        return null;
    }
}
