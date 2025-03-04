package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Table(name = "t_beitraege")
public class TBeitraege {
    @Id
    @Column(name = "beitrag_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eltern_id", nullable = false)
    private TEltern eltern;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zahlungsart_id", nullable = false)
    private TZahlungsart zahlungsart;

    @ColumnDefault("0")
    @Column(name = "beitrag", nullable = false)
    private Double beitrag;

    @ColumnDefault("b'0'")
    @Column(name = "bezahlt", nullable = false)
    private Boolean bezahlt = false;

    @Column(name = "faelligkeitsdatum", nullable = false)
    private LocalDate faelligkeitsdatum;

    @Column(name = "zahlungsdatum", nullable = false)
    private LocalDate zahlungsdatum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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