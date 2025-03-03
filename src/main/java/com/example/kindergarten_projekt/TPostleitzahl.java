package com.example.kindergarten_projekt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_postleitzahl")
public class TPostleitzahl {
    @Id
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