package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TBeitraege;
import com.example.kindergarten_projekt.model.TZahlungsart;

import java.util.List;

public interface BeitraegeService {

    TZahlungsart addZahlungsart(TZahlungsart zahlungsart);

    List<TZahlungsart> getAllZahlungsart();

    TZahlungsart getZahlungsartById(Long id);

    TZahlungsart updateZahlungsartById(TZahlungsart z, Long id);

    String deleteZahlungsartById(Long id);

    // Beitraege Verwaltung

    TBeitraege addBeitrag(TBeitraege beitrag);

    List<TBeitraege> getAllBeitraege();

    TBeitraege getBeitragById(Long id);

    TBeitraege updateBeitragById(TBeitraege beitrag, Long id);

    String deleteBeitragById(Long id);


}
