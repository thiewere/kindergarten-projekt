package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TBeitraege;
import com.example.kindergarten_projekt.model.TZahlungsart;
import com.example.kindergarten_projekt.service.BeitraegeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BeitragController {

    @Autowired
    private BeitraegeServiceImplement beitraegeServiceImplement;

    @GetMapping("/zahlungsart")
    public List<TZahlungsart> getAllZahlungsart() {
        return beitraegeServiceImplement.getAllZahlungsart();
    }

    @GetMapping("/getZahlungsart/{id}")
    public TZahlungsart getZahlungsartById(@PathVariable Integer id) {
        return beitraegeServiceImplement.getZahlungsartById(id);
    }

    @PostMapping("/addZahlungsart")
    public TZahlungsart addZahlungsart(@RequestBody TZahlungsart zahlungsart) {

        return beitraegeServiceImplement.addZahlungsart(zahlungsart);
    }

    @PostMapping("/updateZahlungsart/{id}")
    public TZahlungsart updateZahlungsartById(@RequestBody TZahlungsart zahlungsart, @PathVariable Integer id) {
        return beitraegeServiceImplement.updateZahlungsartById(zahlungsart, id);
    }

    // Beitraege Verwaltung

    @GetMapping("/beitraege")
    public List<TBeitraege> getAllBeitraege() {
        return beitraegeServiceImplement.getAllBeitraege();
    }

    @GetMapping("/getBeitrag/{id}")
    public TBeitraege getBeitrag(@PathVariable Integer id) {
        return beitraegeServiceImplement.getBeitragById(id);
    }

    @PostMapping("/addBeitrag")
    public TBeitraege addBeitrag(@RequestBody TBeitraege beitrag) {
        return beitraegeServiceImplement.addBeitrag(beitrag);
    }

    @PostMapping("/updateBeitrag/{id}")
    public TBeitraege updateBeitrag(@PathVariable Integer id, @RequestBody TBeitraege beitrag) {
        return beitraegeServiceImplement.updateBeitragById(beitrag, id);
    }

    @PostMapping("/deleteBeitrag/{id}")
    public String deleteBeitrag(@PathVariable Integer id) {
        return beitraegeServiceImplement.deleteZahlungsartById(id);
    }
}
