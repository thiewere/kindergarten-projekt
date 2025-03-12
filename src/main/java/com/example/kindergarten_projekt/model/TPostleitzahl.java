package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_postleitzahl")
public class TPostleitzahl {
    @Id
    @Column(name = "plz")
    private String plz;

    @Column(name = "ort")
    private String ort;


    @OneToMany(mappedBy = "standortPlz")
    private List<TStandort> standort;


    @OneToMany(mappedBy = "elternPlz")
    private List<TEltern> eltern;

    public TPostleitzahl() {}

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