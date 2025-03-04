package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TDienstplan;
import com.example.kindergarten_projekt.model.TMitarbeiter;
import com.example.kindergarten_projekt.service.MitarbeiterServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/md")
public class MitarbeiterController {

    @Autowired
    private MitarbeiterServiceImplement mitarbeiterServiceImplement;

    //Mitarbeiter Controller
    //GET
    @GetMapping("/getAllMitarbeiter")
    public List<TMitarbeiter> getAllMitarbeiter() {
        return mitarbeiterServiceImplement.getAllMitarbeiter();
    }
    @GetMapping("/getMitarbeiter/{id}")
    public TMitarbeiter getMitarbeiterById(@PathVariable Integer id) {
        return mitarbeiterServiceImplement.getMitarbeiterById(id);
    }

    //POST
    @PostMapping("/addMitarbeiter")
    public TMitarbeiter addMitarbeiter(@RequestBody TMitarbeiter mitarbeiter) {
        return mitarbeiterServiceImplement.addMitarbeiter(mitarbeiter);
    }

    @PostMapping("/deleteMitarbeiter/{id}")
    public TMitarbeiter deleteMitarbeiter(@PathVariable int id) {
        mitarbeiterServiceImplement.deleteMitarbeiterById(id);
        return null;
    }

    //Dienstplan Controller
    //GET
    @GetMapping("/getAllDienstplan")
    public List<TDienstplan> getAllDienstplan() {
        return mitarbeiterServiceImplement.getAllDienstplan();
    }
    //POST
    @PostMapping("/addDienstplan")
    public TDienstplan addDienstplan(TDienstplan dienstplan) {
        return mitarbeiterServiceImplement.addDienstplan(dienstplan);
    }

    @PostMapping("/deleteDienstplan/{id}")
    public TDienstplan deleteDienstplan(@PathVariable int id) {
        mitarbeiterServiceImplement.deleteDienstplanById(id);
        return null;
    }

}
