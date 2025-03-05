package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TElternKinder;
import com.example.kindergarten_projekt.model.TElternKinderId;
import com.example.kindergarten_projekt.service.ElternKinderServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eltern-kinder")
public class ElternKinderController {
    @Autowired
    private ElternKinderServiceImplement elternKinderServiceImplement;

    public ElternKinderController(ElternKinderServiceImplement elternKinderServiceImplement) {
        this.elternKinderServiceImplement = elternKinderServiceImplement;
    }

    //GET
    @GetMapping("/getAllElternKinder")
    public List<TElternKinder> getAllElternKinder() {
        return elternKinderServiceImplement.getAllElternKinder();
    }

    @GetMapping("/kinder/{elternId}")
    public List<TElternKinder> getKinderByEltern(@PathVariable Integer elternId) {
        return elternKinderServiceImplement.getKinderByElternId(elternId);
    }

    @GetMapping("/eltern/{kindId}")
    public List<TElternKinder> getElternByKind(@PathVariable Integer kindId) {
        return elternKinderServiceImplement.getElternByKinderId(kindId);
    }

    //POST
    @PostMapping("/addElternKind")
    public TElternKinder addElternKind(@RequestBody TElternKinder elternKinder) {
        return elternKinderServiceImplement.addElternKinderBeziehung(elternKinder);
    }

    @DeleteMapping("/{elternId}/{kindId}")
    public void deleteElternKind(@PathVariable TElternKinderId id) {
        elternKinderServiceImplement.deleteElternKinder(id);
    }
}
