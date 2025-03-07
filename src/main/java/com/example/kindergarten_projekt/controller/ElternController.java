package com.example.kindergarten_projekt.controller;

import com.example.kindergarten_projekt.model.TEltern;
import com.example.kindergarten_projekt.serviceImplement.ElternServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eltern")
public class ElternController {

    @Autowired
    private ElternServiceImplement elternServiceImplement;

    @GetMapping("/getAllEltern")
    public List<TEltern> getAllEltern() {
        return elternServiceImplement.getAllElterns();
    }

    @GetMapping("/getEltern/{id}")
    public TEltern getEltern(@PathVariable Integer id) {
        return elternServiceImplement.getElternById(id);
    }

    @PostMapping("/addEltern")
    public TEltern addEltern(@RequestBody TEltern eltern) {
        return elternServiceImplement.addEltern(eltern);
    }

    @PutMapping("/updateEltern/{id}")
    public TEltern updateEltern(@PathVariable Integer id, @RequestBody TEltern eltern) {
        return elternServiceImplement.updateElternById(eltern, id);
    }

    @DeleteMapping("/deleteEltern/{id}")
    public String deleteEltern(@PathVariable Integer id) {
        return elternServiceImplement.deleteElternById(id);
    }



}
