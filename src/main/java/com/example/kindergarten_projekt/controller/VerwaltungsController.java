package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TPostleitzahl;
import com.example.kindergarten_projekt.model.TStandort;
import com.example.kindergarten_projekt.serviceImplement.StandortServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VerwaltungsController {

    @Autowired
    private StandortServiceImplement standortServiceImplement;

    @GetMapping("/standort")
    public List<TStandort> getAllStandort() {return standortServiceImplement.getAllStandort();}

    @GetMapping("/postleitzahl")
    public List<TPostleitzahl> getAllPostleitzahl() {return standortServiceImplement.getAllPostleitzahl();}

    @PostMapping("/addStandort")
    public TStandort addStandort(@RequestBody TStandort standort) {

        return standortServiceImplement.addStandort(standort);
    }

    @PostMapping("/addPostleitzahl")
    public TPostleitzahl addPostleitzahl(@RequestBody TPostleitzahl postleitzahl) {

        return standortServiceImplement.addPostleitzahl(postleitzahl);
    }

}
