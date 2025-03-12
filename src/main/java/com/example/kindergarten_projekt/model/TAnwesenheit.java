package com.example.kindergarten_projekt.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "t_anwesenheit")
public class TAnwesenheit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aw_id", nullable = false)
    private Long id;

    public TAnwesenheit() {}


    @ManyToOne
    @JoinColumn(name = "aw_kind_id")
    private TKinder awKind;

    @Column(name = "aw_datum")
    private LocalDate awDatum;

    @Column(name = "abgeholt_uhr")
    private LocalTime abgeholtUhr;

    public Long Id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TKinder getAwKind() {
        return awKind;
    }

    public void setAwKind(TKinder awKind) {
        this.awKind = awKind;
    }

    public LocalDate getAwDatum() {
        return awDatum;
    }

    public void setAwDatum(LocalDate awDatum) {
        this.awDatum = awDatum;
    }

    public LocalTime getAbgeholtUhr() {
        return abgeholtUhr;
    }

    public void setAbgeholtUhr(LocalTime abgeholtUhr) {
        this.abgeholtUhr = abgeholtUhr;
    }

}