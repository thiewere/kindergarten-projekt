package com.example.kindergarten_projekt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_postleitzahl")
public class TPostleitzahl {
    @Id
    @Column(name = "plz", nullable = false, length = 5)
    private String plz;

    @Column(name = "ort", nullable = false, length = 20)
    private String ort;

    @JsonManagedReference
    @OneToMany(mappedBy = "standortPlz")
    private List<TStandort> standort;

    @JsonManagedReference
    @OneToMany(mappedBy = "elternPlz")
    private List<TEltern> eltern;


    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

}