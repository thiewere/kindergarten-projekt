package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "t_dienstplan")
public class TDienstplan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "mitarbeiter_id")
    private TMitarbeiter diesntplanMitarbeiter;

    private LocalDate dienstplanDatum;
    private LocalTime schicht_anfang;
    private LocalTime schicht_ende;

    public TDienstplan() {}

    public TDienstplan(TMitarbeiter mitarbeiter, LocalDate dienstplanDatum,
                       LocalTime schicht_anfang, LocalTime schicht_ende) {
        this.diesntplanMitarbeiter = mitarbeiter;
        this.dienstplanDatum = dienstplanDatum;
        this.schicht_anfang = schicht_anfang;
        this.schicht_ende = schicht_ende;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDienstplanDatum() {
        return dienstplanDatum;
    }

    public void setDienstplanDatum(LocalDate dienstplanDatum) {
        this.dienstplanDatum = dienstplanDatum;
    }

    public LocalTime getSchicht_anfang() {
        return schicht_anfang;
    }

    public void setSchicht_anfang(LocalTime schicht_anfang) {
        this.schicht_anfang = schicht_anfang;
    }

    public LocalTime getSchicht_ende() {
        return schicht_ende;
    }

    public void setSchicht_ende(LocalTime schicht_ende) {
        this.schicht_ende = schicht_ende;
    }

    public TMitarbeiter getMitarbeiter() {
        return diesntplanMitarbeiter;
    }

    public void setMitarbeiter(TMitarbeiter mitarbeiter) {
        this.diesntplanMitarbeiter = mitarbeiter;
    }

}
