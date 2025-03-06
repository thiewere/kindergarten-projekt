package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TPostleitzahl;
import com.example.kindergarten_projekt.model.TStandort;
import com.example.kindergarten_projekt.serviceImplement.StandortServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StandortController {

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

    @PostMapping("/updateStandort/{id}")
    public TStandort updateStandort(@RequestBody TStandort standort, @PathVariable Integer id) {
        return standortServiceImplement.updateStandort(standort, id);
    }

    @PostMapping("/addPostleitzahl")
    public TPostleitzahl addPostleitzahl(@RequestBody TPostleitzahl postleitzahl) {

        return standortServiceImplement.addPostleitzahl(postleitzahl);
    }

    @PutMapping("/updatePostleitzahl/{plz}")
    public TPostleitzahl updatePostleitzahl(@RequestBody TPostleitzahl postleitzahl, @PathVariable String plz) {
        return standortServiceImplement.updatePostleitzahl(postleitzahl, plz);
    }

    @DeleteMapping("/deleteStandort/{id}")
    public TStandort deleteStandortById(@PathVariable Integer id) {
        standortServiceImplement.deleteStandortById(id);
        return null;
    }

    @DeleteMapping("/deletePostleitzahl/{plz}")
    public TStandort deletePostleitzahlById(@PathVariable String plz) {
        standortServiceImplement.deletePostleitzahlById(plz);
        return null;
    }

}
