package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.model.TZahlungsart;
import com.example.kindergarten_projekt.repository.TZahlungsartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VewaltungServiceImplement implements VerwaltungService{
    private final TZahlungsartRepository zahlungsartRepository;

    public VewaltungServiceImplement(TZahlungsartRepository zahlungsartRepository) {
        this.zahlungsartRepository = zahlungsartRepository;
    }


    @Override
    public TKinder addKinder(TKinder kinder) {
        return null;
    }

    @Override
    public TZahlungsart addZahlungsart(TZahlungsart zahlungsart) {
        return null;
    }

    @Override
    public List<TZahlungsart> getAllZahlungsart() {
        return List.of();
    }
}
