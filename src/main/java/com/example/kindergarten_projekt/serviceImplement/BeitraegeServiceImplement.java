package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TBeitraege;
import com.example.kindergarten_projekt.model.TZahlungsart;
import com.example.kindergarten_projekt.repository.TBeitraegeRepository;
import com.example.kindergarten_projekt.repository.TZahlungsartRepository;
import com.example.kindergarten_projekt.service.BeitraegeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeitraegeServiceImplement implements BeitraegeService {

    private final TZahlungsartRepository zahlungsartRepository;
    private final TBeitraegeRepository beitraegeRepository;

    public BeitraegeServiceImplement(TZahlungsartRepository zahlungsartRepository, TBeitraegeRepository beitraegeRepository) {
        this.zahlungsartRepository = zahlungsartRepository;
        this.beitraegeRepository = beitraegeRepository;
    }

    @Override
    public TZahlungsart addZahlungsart(TZahlungsart zahlungsart) {
        return zahlungsartRepository.save(zahlungsart);
    }

    @Override
    public List<TZahlungsart> getAllZahlungsart() {
        return zahlungsartRepository.findAll();
    }

    @Override
    public TZahlungsart getZahlungsartById(Integer id) {
        return zahlungsartRepository.findById(id).orElseThrow();
    }

    @Override
    public TZahlungsart updateZahlungsartById(TZahlungsart zahlungsart, Integer id) {
        return zahlungsartRepository.findById(id)
                .map(zahl -> {
                    zahl.setZahlungsTyp(zahlungsart.getZahlungsTyp());
                    return zahlungsartRepository.save(zahl);
                }).orElseThrow(() -> new RuntimeException("Zahlungsart nicht gefunden"));
    }

    @Override
    public String deleteZahlungsartById(Integer id) {
        if (zahlungsartRepository.existsById(id)) {
            zahlungsartRepository.deleteById(id);
            return "Zahlungsart: " + id + " wurde geloescht!";
        }
        return "Zahlungsart: " + id + " wurde nicht gefunden!";
    }

    @Override
    public TBeitraege addBeitrag(TBeitraege beitrag) {
        return beitraegeRepository.save(beitrag);
    }

    @Override
    public List<TBeitraege> getAllBeitraege() {
        return beitraegeRepository.findAll();
    }

    @Override
    public TBeitraege getBeitragById(Integer id) {
        return beitraegeRepository.findById(id).orElseThrow();
    }

    @Override
    public TBeitraege updateBeitragById(TBeitraege beitrag, Integer id) {
        return beitraegeRepository.findById(id)
                .map(b -> {
                    b.setBeitrag(beitrag.getBeitrag());
                    b.setEltern(beitrag.getEltern());
                    b.setBezahlt(beitrag.getBezahlt());
                    b.setZahlungsart(beitrag.getZahlungsart());
                    b.setZahlungsdatum(beitrag.getZahlungsdatum());
                    b.setFaelligkeitsdatum(beitrag.getFaelligkeitsdatum());
                    return beitraegeRepository.save(b);
                }).orElseThrow(() -> new RuntimeException("Beitrag nicht gefunden"));
    }

    @Override
    public String deleteBeitragById(Integer id) {
        if (beitraegeRepository.existsById(id)) {
            beitraegeRepository.deleteById(id);
            return "Beitrag mit Id: " + id + " wurde geloescht.";
        }
        return "Beitrag mit Id: " + id + " wurde nicht gefunden.";
    }
}
