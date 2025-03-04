package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.model.TZahlungsart;

import java.util.List;

public interface VerwaltungService {
    TKinder addKinder(TKinder kinder);

    TZahlungsart addZahlungsart(TZahlungsart zahlungsart);
    List<TZahlungsart> getAllZahlungsart();
}
