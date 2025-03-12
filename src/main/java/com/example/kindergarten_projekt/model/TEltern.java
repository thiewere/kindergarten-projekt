package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_eltern")
public class TEltern {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eltern_id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "eltern_plz")
    private TPostleitzahl elternPlz;


    @Column(name = "eltern_vorname")
    private String elternVorname;


    @Column(name = "eltern_nachname")
    private String elternNachname;


    @Column(name = "eltern_strasse_hausnr")
    private String elternStrasseHausnr;


    @Column(name = "eltern_telefonnummer")
    private String elternTelefonnummer;


    @Column(name = "eltern_email")
    private String elternEmail;

    @ManyToMany
    @JoinTable(
            name = "eltern_kinder",
            joinColumns = @JoinColumn(name = "eltern_id"),
            inverseJoinColumns = @JoinColumn(name = "kinder_id")
    )
    public List<TKinder> kinder;




    @OneToMany(mappedBy =  "eltern")
    List<TBeitraege> beitraege;

    public TEltern() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TPostleitzahl getElternPlz() {
        return elternPlz;
    }

    public void setElternPlz(TPostleitzahl elternPlz) {
        this.elternPlz = elternPlz;
    }

    public String getElternVorname() {
        return elternVorname;
    }

    public void setElternVorname(String elternVorname) {
        this.elternVorname = elternVorname;
    }

    public String getElternNachname() {
        return elternNachname;
    }

    public void setElternNachname(String elternNachname) {
        this.elternNachname = elternNachname;
    }

    public String getElternStrasseHausnr() {
        return elternStrasseHausnr;
    }

    public void setElternStrasseHausnr(String elternStrasseHausnr) {
        this.elternStrasseHausnr = elternStrasseHausnr;
    }

    public String getElternTelefonnummer() {
        return elternTelefonnummer;
    }

    public void setElternTelefonnummer(String elternTelefonnummer) {
        this.elternTelefonnummer = elternTelefonnummer;
    }

    public String getElternEmail() {
        return elternEmail;
    }

    public void setElternEmail(String elternEmail) {
        this.elternEmail = elternEmail;
    }

}