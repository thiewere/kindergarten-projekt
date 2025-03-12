package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_beitraege")
public class TBeitraege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "beitrag_id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "eltern_id")
    private TEltern eltern;


    @ManyToOne
    @JoinColumn(name = "zahlungsart_id")
    private TZahlungsart zahlungsart;


    @Column(name = "beitrag")
    private Double beitrag;


    @Column(name = "bezahlt")
    private Boolean bezahlt = false;

    @Column(name = "faelligkeitsdatum")
    private LocalDate faelligkeitsdatum;

    @Column(name = "zahlungsdatum")
    private LocalDate zahlungsdatum;

    public TBeitraege() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TEltern getEltern() {
        return eltern;
    }

    public void setEltern(TEltern eltern) {
        this.eltern = eltern;
    }

    public TZahlungsart getZahlungsart() {
        return zahlungsart;
    }

    public void setZahlungsart(TZahlungsart zahlungsart) {
        this.zahlungsart = zahlungsart;
    }

    public Double getBeitrag() {
        return beitrag;
    }

    public void setBeitrag(Double beitrag) {
        this.beitrag = beitrag;
    }

    public Boolean getBezahlt() {
        return bezahlt;
    }

    public void setBezahlt(Boolean bezahlt) {
        this.bezahlt = bezahlt;
    }

    public LocalDate getFaelligkeitsdatum() {
        return faelligkeitsdatum;
    }

    public void setFaelligkeitsdatum(LocalDate faelligkeitsdatum) {
        this.faelligkeitsdatum = faelligkeitsdatum;
    }

    public LocalDate getZahlungsdatum() {
        return zahlungsdatum;
    }

    public void setZahlungsdatum(LocalDate zahlungsdatum) {
        this.zahlungsdatum = zahlungsdatum;
    }

}