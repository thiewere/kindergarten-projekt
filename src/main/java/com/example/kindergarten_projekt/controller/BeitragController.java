package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TBeitraege;
import com.example.kindergarten_projekt.model.TZahlungsart;
import com.example.kindergarten_projekt.serviceImplement.BeitraegeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/beitragService")
public class BeitragController {

    @Autowired
    private BeitraegeServiceImplement beitraegeServiceImplement;

    @GetMapping("/getAllZahlungsart")
    public List<TZahlungsart> getAllZahlungsart() {
        return beitraegeServiceImplement.getAllZahlungsart();
    }

    @GetMapping("/getZahlungsart/{id}")
    public TZahlungsart getZahlungsartById(@PathVariable Long id) {
        return beitraegeServiceImplement.getZahlungsartById(id);
    }

    @PostMapping("/addZahlungsart")
    public TZahlungsart addZahlungsart(@RequestBody TZahlungsart zahlungsart) {

        return beitraegeServiceImplement.addZahlungsart(zahlungsart);
    }

    @PutMapping("/updateZahlungsart/{id}")
    public TZahlungsart updateZahlungsartById(@RequestBody TZahlungsart zahlungsart, @PathVariable Long id) {
        return beitraegeServiceImplement.updateZahlungsartById(zahlungsart, id);
    }

    @DeleteMapping("/deleteZahlungsart/{id}")
    public String deleteZahlungsartById(@PathVariable Long id) {
        return beitraegeServiceImplement.deleteZahlungsartById(id);
    }

    // Beitraege Verwaltung

    @GetMapping("/getAllbeitrag")
    public List<TBeitraege> getAllBeitraege() {
        return beitraegeServiceImplement.getAllBeitraege();
    }

    @GetMapping("/getBeitrag/{id}")
    public TBeitraege getBeitrag(@PathVariable Long id) {
        return beitraegeServiceImplement.getBeitragById(id);
    }

    @PostMapping("/addBeitrag")
    public TBeitraege addBeitrag(@RequestBody TBeitraege beitrag) {
        return beitraegeServiceImplement.addBeitrag(beitrag);
    }

    @PutMapping("/updateBeitrag/{id}")
    public TBeitraege updateBeitrag(@PathVariable Long id, @RequestBody TBeitraege beitrag) {
        return beitraegeServiceImplement.updateBeitragById(beitrag, id);
    }

    @DeleteMapping("/deleteBeitrag/{id}")
    public String deleteBeitrag(@PathVariable Long id) {
        return beitraegeServiceImplement.deleteBeitragById(id);
    }
}
