package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "t_kinder")
public class TKinder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kind_id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "gruppe_id")
    private TGruppe gruppe;

    @Column(name = "kind_vorname")
    private String kindVorname;


    @Column(name = "kind_nachname")
    private String kindNachname;

    @Column(name = "kind_geburtsdatum")
    private LocalDate kindGeburtsdatum;


    @Column(name = "besonderheiten")
    private String besonderheiten;


    @OneToMany(mappedBy = "awKind")
    private List<TAnwesenheit> anwesenheiten;


    public TKinder() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TGruppe getGruppe() {
        return gruppe;
    }

    public void setGruppe(TGruppe gruppe) {
        this.gruppe = gruppe;
    }

    public String getKindVorname() {
        return kindVorname;
    }

    public void setKindVorname(String kindVorname) {
        this.kindVorname = kindVorname;
    }

    public String getKindNachname() {
        return kindNachname;
    }

    public void setKindNachname(String kindNachname) {
        this.kindNachname = kindNachname;
    }

    public LocalDate getKindGeburtsdatum() {
        return kindGeburtsdatum;
    }

    public void setKindGeburtsdatum(LocalDate kindGeburtsdatum) {
        this.kindGeburtsdatum = kindGeburtsdatum;
    }

    public String getBesonderheiten() {
        return besonderheiten;
    }

    public void setBesonderheiten(String besonderheiten) {
        this.besonderheiten = besonderheiten;
    }

}