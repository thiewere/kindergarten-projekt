package com.example.kindergarten_projekt;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "t_anwesenheit")
public class TAnwesenheit {
    @Id
    @Column(name = "aw_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "aw_kind_id", nullable = false)
    private com.example.kindergarten_projekt.TKinder awKind;

    @Column(name = "aw_datum", nullable = false)
    private LocalDate awDatum;

    @Column(name = "abgeholt_uhr", nullable = false)
    private LocalTime abgeholtUhr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.kindergarten_projekt.TKinder getAwKind() {
        return awKind;
    }

    public void setAwKind(com.example.kindergarten_projekt.TKinder awKind) {
        this.awKind = awKind;
    }

    public LocalDate getAwDatum() {
        return awDatum;
    }

    public void setAwDatum(LocalDate awDatum) {
        this.awDatum = awDatum;
    }

    public LocalTime getAbgeholtUhr() {
        return abgeholtUhr;
    }

    public void setAbgeholtUhr(LocalTime abgeholtUhr) {
        this.abgeholtUhr = abgeholtUhr;
    }

}