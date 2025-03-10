package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.serviceImplement.AnwesenheitServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class AnwesenheitController {

    @Autowired
    private AnwesenheitServiceImplement anwesenheitServiceImplement;

    @GetMapping("/anwesenheit")
    public List<TAnwesenheit> getAllAnwesenheit() {
        return anwesenheitServiceImplement.getAllAnwesenheit();
    }


    @GetMapping("/getAnwesenheitByKind/{kind}")
    public List<TAnwesenheit> getAnwesenheitByKinderId(@PathVariable TKinder kind) {

        return anwesenheitServiceImplement.getAnwesenheitByKinder(kind);
     }

    @GetMapping("/getAnwesenheitByDatum/{datum}")
    public List<TAnwesenheit> getAnwesenheitByDatum(@PathVariable LocalDate datum) {
        return anwesenheitServiceImplement.getAnwesenheitByDatum(datum);
    }

    @PostMapping("/addAnwesenheit")
    public TAnwesenheit addAnwesenheit(@RequestBody TAnwesenheit anwesenheit) {
        return anwesenheitServiceImplement.addAnwesenheit(anwesenheit);
    }

    @PutMapping("/updateAnwesenheit/{id}")
    public TAnwesenheit updateAnwesenheitByKinderId(@RequestBody TAnwesenheit anwesenheit, @PathVariable Integer id) {
        return anwesenheitServiceImplement.updateAnwesenheit(anwesenheit, id);
    }

    @DeleteMapping("/deleteAnwesenheit/{id}")
    public  String deleteAnwesenheitByKinderId(@PathVariable Integer id) {
        return anwesenheitServiceImplement.deleteAnwesenheitById(id);
    }

}
