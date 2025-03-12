package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "t_mitarbeiter")
public class TMitarbeiter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mitarbeiter_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mitarbeiter_standort_id")
    private TStandort mitarbeiterStandort;

    @ManyToOne
    @JoinColumn(name = "mitarbeiter_plz")
    private TPostleitzahl mitarbeiterPlz;

    @ManyToOne
    @JoinColumn(name = "mitarbeiter_gruppe_id")
    private TGruppe mitarbeiterGruppe;


    @Column(name = "mitarbeiter_vorname")
    private String mitarbeiterVorname;


    @Column(name = "mitarbeiter_nachname")
    private String mitarbeiterNachname;

    @Column(name = "mitarbeiter_geburtsdatum")
    private LocalDate mitarbeiterGeburtsdatum;


    @Column(name = "mitarbeiter_strasse_hausnr")
    private String mitarbeiterStrasseHausnr;


    @Column(name = "mitarbeiter_telefonnummer")
    private String mitarbeiterTelefonnummer;


    @Column(name = "mitarbeiter_email")
    private String mitarbeiterEmail;


    @Column(name = "mitarbeiter_rolle")
    private String mitarbeiterRolle;


//    private enum mitarbeiterTyp{
//      Verwalter, Erzieher;
//    }
//    @Enumerated(EnumType.STRING)
//    private MitarbeiterRolle rolle;
//
//    mitarbeiterTyp varwalter = mitarbeiterTyp.Verwalter;


    public TMitarbeiter() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TStandort getMitarbeiterStandort() {
        return mitarbeiterStandort;
    }

    public void setMitarbeiterStandort(TStandort mitarbeiterStandort) {
        this.mitarbeiterStandort = mitarbeiterStandort;
    }

    public TPostleitzahl getMitarbeiterPlz() {
        return mitarbeiterPlz;
    }

    public void setMitarbeiterPlz(TPostleitzahl mitarbeiterPlz) {
        this.mitarbeiterPlz = mitarbeiterPlz;
    }

    public TGruppe getMitarbeiterGruppe() {
        return mitarbeiterGruppe;
    }

    public void setMitarbeiterGruppe(TGruppe mitarbeiterGruppe) {
        this.mitarbeiterGruppe = mitarbeiterGruppe;
    }

    public String getMitarbeiterVorname() {
        return mitarbeiterVorname;
    }

    public void setMitarbeiterVorname(String mitarbeiterVorname) {
        this.mitarbeiterVorname = mitarbeiterVorname;
    }

    public String getMitarbeiterNachname() {
        return mitarbeiterNachname;
    }

    public void setMitarbeiterNachname(String mitarbeiterNachname) {
        this.mitarbeiterNachname = mitarbeiterNachname;
    }

    public LocalDate getMitarbeiterGeburtsdatum() {
        return mitarbeiterGeburtsdatum;
    }

    public void setMitarbeiterGeburtsdatum(LocalDate mitarbeiterGeburtsdatum) {
        this.mitarbeiterGeburtsdatum = mitarbeiterGeburtsdatum;
    }

    public String getMitarbeiterStrasseHausnr() {
        return mitarbeiterStrasseHausnr;
    }

    public void setMitarbeiterStrasseHausnr(String mitarbeiterStrasseHausnr) {
        this.mitarbeiterStrasseHausnr = mitarbeiterStrasseHausnr;
    }

    public String getMitarbeiterTelefonnummer() {
        return mitarbeiterTelefonnummer;
    }

    public void setMitarbeiterTelefonnummer(String mitarbeiterTelefonnummer) {
        this.mitarbeiterTelefonnummer = mitarbeiterTelefonnummer;
    }

    public String getMitarbeiterEmail() {
        return mitarbeiterEmail;
    }

    public void setMitarbeiterEmail(String mitarbeiterEmail) {
        this.mitarbeiterEmail = mitarbeiterEmail;
    }

    public String getMitarbeiterRolle() {
        return mitarbeiterRolle;
    }

    public void setMitarbeiterRolle(String mitarbeiterRolle) {
        this.mitarbeiterRolle = mitarbeiterRolle;
    }

}