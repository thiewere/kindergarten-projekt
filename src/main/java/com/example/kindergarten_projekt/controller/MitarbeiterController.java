package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TDienstplan;
import com.example.kindergarten_projekt.model.TMitarbeiter;
import com.example.kindergarten_projekt.serviceImplement.MitarbeiterServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/mitarbeiter")
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

    //PUT
    @PutMapping("/updateMitarbeiter/{id}")
    public TMitarbeiter updateMitarbeiter(@PathVariable Integer id, @RequestBody TMitarbeiter mitarbeiter) {
        return mitarbeiterServiceImplement.updateMitarbeiter(mitarbeiter, id);
    }

    //DELETE
    @DeleteMapping("/deleteMitarbeiter/{id}")
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

    @GetMapping("/getDienstplanById/{id}")
    public TDienstplan getDienstplanById(@PathVariable int id) {
        return mitarbeiterServiceImplement.getDienstplanByMitarbeiterId(id);
    }

    @GetMapping("/getDienstplanByDatum/{datum}")
    public TDienstplan getDienstplanByDatum(@PathVariable LocalDate datum) {
       return mitarbeiterServiceImplement.getDienstplanByDienstplanDatum(datum);
    }

    //POST
    @PostMapping("/addDienstplan")
    public TDienstplan addDienstplan(TDienstplan dienstplan) {
        return mitarbeiterServiceImplement.addDienstplan(dienstplan);
    }

    //PUT
    @PutMapping("/updateDienstplan/{id}")
    public TDienstplan updateDienstplan(@PathVariable Integer id, @RequestBody TDienstplan dienstplan) {
        return mitarbeiterServiceImplement.updateDienstplan(dienstplan, id);
    }

    //DELETE
    @DeleteMapping("/deleteDienstplan/{id}")
    public TDienstplan deleteDienstplan(@PathVariable int id) {
        mitarbeiterServiceImplement.deleteDienstplanById(id);
        return null;
    }
}
