package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_postleitzahl")
public class TPostleitzahl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "plz", nullable = false, length = 5)
    private String plz;

    @Column(name = "ort", nullable = false, length = 20)
    private String ort;

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