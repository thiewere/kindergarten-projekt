package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_standort")
public class TStandort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "standort_id")
    private Long id;



    @ManyToOne
    @JoinColumn(name = "standort_plz")
    private TPostleitzahl standortPlz;

    @Column(name = "standort_name")
    private String standortName;

    @Column(name = "standort_typ")
    private String standortTyp;

    @Column(name = "standort_strasse_hausnr")
    private String standortStrasseHausnr;

    public TStandort() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TPostleitzahl getStandortPlz() {
        return standortPlz;
    }

    public void setStandortPlz(TPostleitzahl standortPlz) {
        this.standortPlz = standortPlz;
    }

    public String getStandortName() {
        return standortName;
    }

    public void setStandortName(String standortName) {
        this.standortName = standortName;
    }

    public String getStandortTyp() {
        return standortTyp;
    }

    public void setStandortTyp(String standortTyp) {
        this.standortTyp = standortTyp;
    }

    public String getStandortStrasseHausnr() {
        return standortStrasseHausnr;
    }

    public void setStandortStrasseHausnr(String standortStrasseHausnr) {
        this.standortStrasseHausnr = standortStrasseHausnr;
    }

}