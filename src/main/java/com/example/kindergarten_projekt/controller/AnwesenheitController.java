package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.service.AnwesenheitServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
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
    public List<TAnwesenheit> getAnwesenheitByDatum(@PathVariable String datum) {
        return anwesenheitServiceImplement.getAnwesenheitByDatum(Date.valueOf(datum));
    }

    @GetMapping("/addAnwesenheit")
    public TAnwesenheit addAnwesenheit(@RequestBody TAnwesenheit anwesenheit) {
        return anwesenheitServiceImplement.addAnwesenheit(anwesenheit);
    }

    @GetMapping("/updateAnwesenheit/{id}")
    public TAnwesenheit updateAnwesenheitByKinderId(@RequestBody TAnwesenheit anwesenheit, @PathVariable Integer id) {
        return anwesenheitServiceImplement.updateAnwesenheit(anwesenheit);
    }
    @GetMapping("/deleteAnwesenheit/{id}")
    public List<TAnwesenheit> deleteAnwesenheitByKinderId(@PathVariable Integer id) {
        return anwesenheitServiceImplement.deleteAnwesenheitByKinderId(id);
    }

    @GetMapping("/deleteAnwesenheit/{datum}")
    public List<TAnwesenheit> deleteAnwesenheitByDatum(@PathVariable String datum) {
        return anwesenheitServiceImplement.deleteAnwesenheitByDatum(Date.valueOf(datum));
    }
}
