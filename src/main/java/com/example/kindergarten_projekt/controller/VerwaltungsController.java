package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TZahlungsart;
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

    @GetMapping("/")
    public List<TZahlungsart> getAllZahlungsart() {
        return verwaltungServiceImplement.getAllZahlungsart();
    }

    @PostMapping("/addZahlungsart")
    public TZahlungsart addZahlungsart(@RequestBody TZahlungsart zahlungsart) {

        return verwaltungServiceImplement.addZahlungsart(zahlungsart);
    }


}
