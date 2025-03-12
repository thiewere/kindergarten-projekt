package com.example.kindergarten_projekt.oldmodel;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

//@Entity
//@Table(name = "t_eltern_kinder")
public class TElternKinder {
    @EmbeddedId
    private TElternKinderId id;

    @MapsId("ekElternId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ek_eltern_id", nullable = false)
    private TEltern ekEltern;

    @MapsId("ekKindId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ek_kind_id", nullable = false)
    private TKinder ekKind;

    @ColumnDefault("''")
    @Column(name = "rolle", nullable = false, length = 50)
    private String rolle;

    public TElternKinderId getId() {
        return id;
    }

    public void setId(TElternKinderId id) {
        this.id = id;
    }

    public TEltern getEkEltern() {
        return ekEltern;
    }

    public void setEkEltern(TEltern ekEltern) {
        this.ekEltern = ekEltern;
    }

    public TKinder getEkKind() {
        return ekKind;
    }

    public void setEkKind(TKinder ekKind) {
        this.ekKind = ekKind;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

}