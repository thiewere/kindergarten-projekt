package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TElternKinder;
import com.example.kindergarten_projekt.model.TElternKinderId;
import com.example.kindergarten_projekt.serviceImplement.ElternKinderServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/eltern-kinder")
public class ElternKinderController {
    @Autowired
    private ElternKinderServiceImplement elternKinderServiceImplement;

    public ElternKinderController(ElternKinderServiceImplement elternKinderServiceImplement) {
        this.elternKinderServiceImplement = elternKinderServiceImplement;
    }

//    //GET
//    @GetMapping("/getAllElternKinder")
//    public List<TElternKinder> getAllElternKinder() {
//        return elternKinderServiceImplement.getAllElternKinder();
//    }

//    @GetMapping(("getElternKinderById/{elternKinderId}"))
//    public List<TElternKinder> getElternKinderById(@PathVariable TElternKinderId elternKinderId) {
//        return elternKinderServiceImplement.getElternKinderById(elternKinderId);
//    }

    //TODO: Suche implementieren
//    @GetMapping("/kinder/{elternId}")
//    public List<TElternKinder> getKinderByEltern(@PathVariable Integer elternId) {
//        return elternKinderServiceImplement.getKinderByElternId(elternId);
//    }
//
//    @GetMapping("/eltern/{kindId}")
//    public List<TElternKinder> getElternByKind(@PathVariable Integer kindId) {
//        return elternKinderServiceImplement.getElternByKinderId(kindId);
//    }

//    //POST
//    @PostMapping("/addElternKind")
//    public TElternKinder addElternKind(@RequestBody TElternKinder elternKinder) {
//        return elternKinderServiceImplement.addElternKinderBeziehung(elternKinder);
//    }

//    @PostMapping("/delete/{elternKinderId}")
//    public void deleteElternKind(@PathVariable TElternKinderId elternKinderId) {
//        elternKinderServiceImplement.deleteElternKinder(elternKinderId);
//    }

//    @PostMapping("/update/{elternKinderId}")
//    public TElternKinder updateElternKind(@RequestBody TElternKinder elternKinder, @PathVariable TElternKinderId elternKinderId) {
//        return elternKinderServiceImplement.updateElternKinder(elternKinder, elternKinderId);
//    }
}
