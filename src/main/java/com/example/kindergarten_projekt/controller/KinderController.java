package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.serviceImplement.KinderServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class KinderController {
    @Autowired
    KinderServiceImplement kinderServiceImplement;

    @GetMapping("/getAllKinder")
    public List<TKinder> getAllKinder(){

        return kinderServiceImplement.getAllKinder();
    }

    @GetMapping("/getKind/{id}")
    public TKinder getKindById(@PathVariable Long id){

        return kinderServiceImplement.getKindById(id);
    }
    @PostMapping("/addKind")
    public TKinder addKinder(@RequestBody TKinder kinder){

        return kinderServiceImplement.addKinder(kinder);
    }
    @PutMapping("/updateKind/{id}")
    public TKinder updateKind(@RequestBody TKinder kinder,@PathVariable Long id){
        return kinderServiceImplement.updateKindById(kinder,id);
    }
    @DeleteMapping("/deleteKind/{id}")
    public String deleteKindById(@PathVariable Long id){

        return kinderServiceImplement.deleteKindById(id);
    }



}
