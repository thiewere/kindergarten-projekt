package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TBeitraege;
import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.model.TZahlungsart;

import java.util.List;

public interface BeitraegeService {

    TZahlungsart addZahlungsart(TZahlungsart zahlungsart);

    List<TZahlungsart> getAllZahlungsart();

    TZahlungsart getZahlungsartById(Integer id);

    TZahlungsart updateZahlungsartById(TZahlungsart z, Integer id);

    String deleteZahlungsartById(Integer id);

    // Beitraege Verwaltung

    TBeitraege addBeitrag(TBeitraege beitrag);

    List<TBeitraege> getAllBeitraege();

    TBeitraege getBeitragById(Integer id);

    TBeitraege updateBeitragById(TBeitraege beitrag, Integer id);

    String deleteBeitragById(Integer id);


}
