package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TGruppe;
import com.example.kindergarten_projekt.service.GruppeServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GruppeController {
    @Autowired
    GruppeServiceImplement gruppeServiceImplement;
    @GetMapping("/getAllGruppe")
    public List<TGruppe> getAlltGruppe(){
        return gruppeServiceImplement.getAllGruppe();
    }
    @GetMapping("/getGruppe/{id}")
    public TGruppe getGruppeById(@PathVariable Integer id){
        return gruppeServiceImplement.getGruppeById(id);
    }
    @PostMapping("/addGruppe")
    public TGruppe addGruppe(@RequestBody TGruppe gruppe) {
        return gruppeServiceImplement.addGruppe(gruppe);
    }
    @PostMapping("/updateGruppe/{id}")
    public TGruppe updateGruppe(@RequestBody TGruppe gruppe,@PathVariable Integer id){
        return gruppeServiceImplement.updeteGruppeById(id);
    }
    @PostMapping("/deleteGruppe/{id}")
    public String deleteGruppeById(@PathVariable Integer id){
        return gruppeServiceImplement.deleteGruppeById(id);
    }
}
