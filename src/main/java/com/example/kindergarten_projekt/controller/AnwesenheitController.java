package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.service.AnwesenheitServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
public class AnwesenheitController {

    @Autowired
    private AnwesenheitServiceImplement anwesenheitServiceImplement;

    @GetMapping("/anwesenheit")
    public List<TAnwesenheit> getAllAnwesenheit() {
        return anwesenheitServiceImplement.getAllAnwesenheit();
    }

    @GetMapping("/anwesenheit/{id}")
    public List<TAnwesenheit> getAnwesenheitByKinderId(@PathVariable Integer id) {
        return anwesenheitServiceImplement.getAnwesenheitByKinderId(id);
    }

    @GetMapping("/anwesenheit/{datum}")
    public List<TAnwesenheit> getAnwesenheitByDatum(@PathVariable LocalDate datum) {
        return anwesenheitServiceImplement.getAnwesenheitByDatum(datum);
    }

    @GetMapping("/addAnwesenheit")
    public TAnwesenheit addAnwesenheit(@RequestBody TAnwesenheit anwesenheit) {
        return anwesenheitServiceImplement.addAnwesenheit(anwesenheit);
    }

    @PostMapping("/updateAnwesenheit/{id}")
    public TAnwesenheit updateAnwesenheitByKinderId(@RequestBody TAnwesenheit anwesenheit, @PathVariable Integer id) {
        return anwesenheitServiceImplement.updateAnwesenheit(anwesenheit);
    }
    @PostMapping("/deleteAnwesenheit/{id}")
    public List<TAnwesenheit> deleteAnwesenheitByKinderId(@PathVariable Integer id) {
        return anwesenheitServiceImplement.deleteAnwesenheitByKinderId(id);
    }

    @PostMapping("/deleteAnwesenheit/{datum}")
    public List<TAnwesenheit> deleteAnwesenheitByDatum(@PathVariable LocalDate datum) {
        return anwesenheitServiceImplement.deleteAnwesenheitByDatum(datum);
    }
}
