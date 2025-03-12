package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_zahlungsart")
public class TZahlungsart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zahlungsart_id")
    private Long id;

    @Column(name = "zahlungs_typ")
    private String zahlungsTyp;


    @OneToMany(mappedBy = "zahlungsart")
    List<TBeitraege> beitraege;

    public TZahlungsart() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZahlungsTyp() {
        return zahlungsTyp;
    }

    public void setZahlungsTyp(String zahlungsTyp) {
        this.zahlungsTyp = zahlungsTyp;
    }

}