package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;


@Entity
@Table(name = "t_mitarbeiter")
public class TMitarbeiter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mitarbeiter_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ColumnDefault("0")
    @JoinColumn(name = "mitarbeiter_standort_id", nullable = false)
    private TStandort mitarbeiterStandort;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ColumnDefault("'0'")
    @JoinColumn(name = "mitarbeiter_plz", nullable = false)
    private TPostleitzahl mitarbeiterPlz;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ColumnDefault("0")
    @JoinColumn(name = "mitarbeiter_gruppe_id", nullable = false)
    private TGruppe mitarbeiterGruppe;

    @ColumnDefault("'0'")
    @Column(name = "mitarbeiter_vorname", nullable = false, length = 30)
    private String mitarbeiterVorname;

    @ColumnDefault("'0'")
    @Column(name = "mitarbeiter_nachname", nullable = false, length = 30)
    private String mitarbeiterNachname;

    @Column(name = "mitarbeiter_geburtsdatum", nullable = false)
    private LocalDate mitarbeiterGeburtsdatum;

    @ColumnDefault("''")
    @Column(name = "mitarbeiter_strasse_hausnr", nullable = false, length = 50)
    private String mitarbeiterStrasseHausnr;

    @ColumnDefault("''")
    @Column(name = "mitarbeiter_telefonnummer", nullable = false, length = 15)
    private String mitarbeiterTelefonnummer;

    @ColumnDefault("''")
    @Column(name = "mitarbeiter_email", nullable = false, length = 30)
    private String mitarbeiterEmail;

    @ColumnDefault("''")
    @Column(name = "mitarbeiter_rolle", nullable = false, length = 30)
    private String mitarbeiterRolle;


//    private enum mitarbeiterTyp{
//      Verwalter, Erzieher;
//    }
//    @Enumerated(EnumType.STRING)
//    private MitarbeiterRolle rolle;
//
//    mitarbeiterTyp varwalter = mitarbeiterTyp.Verwalter;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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