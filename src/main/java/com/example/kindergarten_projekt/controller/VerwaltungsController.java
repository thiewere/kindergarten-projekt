package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TPostleitzahl;
import com.example.kindergarten_projekt.model.TStandort;
import com.example.kindergarten_projekt.model.TZahlungsart;
import com.example.kindergarten_projekt.service.StandortServiceImplement;
import com.example.kindergarten_projekt.service.VerwaltungServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VerwaltungsController {

    @Autowired
    private VerwaltungServiceImplement verwaltungServiceImplement;

    @Autowired
    private StandortServiceImplement standortServiceImplement;


    @GetMapping("/")
    public List<TZahlungsart> getAllZahlungsart() {
        return verwaltungServiceImplement.getAllZahlungsart();
    }

    public List<TStandort> getAllStandort() {return standortServiceImplement.getAllStandort();}

    public List<TPostleitzahl> getAllPostleitzahl() {return standortServiceImplement.getAllPostleitzahl();}


    @PostMapping("/addZahlungsart")
    public TZahlungsart addZahlungsart(@RequestBody TZahlungsart zahlungsart) {

        return verwaltungServiceImplement.addZahlungsart(zahlungsart);
    }

    @PostMapping("/addStandort")
    public TStandort addStandort(@RequestBody TStandort standort) {

        return standortServiceImplement.addStandort(standort);
    }

    @PostMapping("/addPostleitzahl")
    public TPostleitzahl addPostleitzahl(@RequestBody TPostleitzahl postleitzahl) {

        return standortServiceImplement.addPostleitzahl(postleitzahl);
    }


}
