package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "t_standort")
public class TStandort {
    @Id
    @Column(name = "standort_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ColumnDefault("'0'")
    @JoinColumn(name = "standort_plz", nullable = false)
    private TPostleitzahl standortPlz;

    @ColumnDefault("'0'")
    @Column(name = "standort_name", nullable = false, length = 30)
    private String standortName;

    @ColumnDefault("'0'")
    @Column(name = "standort_typ", nullable = false, length = 30)
    private String standortTyp;

    @ColumnDefault("'0'")
    @Column(name = "standort_strasse_hausnr", nullable = false, length = 30)
    private String standortStrasseHausnr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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