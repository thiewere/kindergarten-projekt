package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Table(name = "t_kinder")
public class TKinder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kind_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gruppe_id", nullable = false)
    private TGruppe gruppe;

    @ColumnDefault("''")
    @Column(name = "kind_vorname", nullable = false, length = 30)
    private String kindVorname;

    @ColumnDefault("''")
    @Column(name = "kind_nachname", nullable = false, length = 30)
    private String kindNachname;

    @Column(name = "kind_geburtsdatum", nullable = false)
    private LocalDate kindGeburtsdatum;

    @ColumnDefault("''")
    @Column(name = "besonderheiten", nullable = false, length = 300)
    private String besonderheiten;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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