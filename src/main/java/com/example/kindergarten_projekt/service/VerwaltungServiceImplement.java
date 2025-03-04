package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.model.TZahlungsart;
import com.example.kindergarten_projekt.repository.TZahlungsartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerwaltungServiceImplement implements VerwaltungService {

    private final TZahlungsartRepository zahlungsartRepository;

    public VerwaltungServiceImplement(TZahlungsartRepository zahlungsartRepository) {
        this.zahlungsartRepository = zahlungsartRepository;
    }

    @Override
    public TKinder addKinder(TKinder kinder) {
        return null;
    }

    @Override
    public TZahlungsart addZahlungsart(TZahlungsart zahlungsart) {
        return zahlungsartRepository.save(zahlungsart);
    }

    @Override
    public List<TZahlungsart> getAllZahlungsart() {
        return zahlungsartRepository.findAll();
    }
}
