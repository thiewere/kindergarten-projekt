package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.serviceImplement.AnwesenheitServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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


    @GetMapping("/anwesenheit/{kind}")
    public List<TAnwesenheit> getAnwesenheitByKinderId(@PathVariable TKinder kind) {

        return anwesenheitServiceImplement.getAnwesenheitByKinder(kind);
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
        return anwesenheitServiceImplement.updateAnwesenheit(anwesenheit, id);
    }

    @PostMapping("/deleteAnwesenheit/{id}")
    public  String deleteAnwesenheitByKinderId(@PathVariable Integer id) {
        return anwesenheitServiceImplement.deleteAnwesenheitById(id);
    }

}
