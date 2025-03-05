package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.service.KinderServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KinderController {
    @Autowired
    KinderServiceImplement kinderServiceImplement;
    @GetMapping("/getAllKinder")
    public List<TKinder> getAllKinder(){

        return kinderServiceImplement.getAllKinder();
    }

    @GetMapping("/getKind/{id}")
    public TKinder getKindById(@PathVariable Integer id){

        return kinderServiceImplement.getKindById(id);
    }
    @PostMapping("/addKind")
    public TKinder addKinder(@RequestBody TKinder kinder){

        return kinderServiceImplement.addKinder(kinder);
    }
    @PostMapping("/updateKind/{id}")
    public TKinder updateKind(@RequestBody TKinder kinder,@PathVariable Integer id){
        return kinderServiceImplement.updateKindById(id,kinder);
    }
    @PostMapping("/deleteKind/{id}")
    public String deleteKindById(@PathVariable Integer id){

        return kinderServiceImplement.deleteKindById(id);
    }



}
