package com.example.kindergarten_projekt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "t_zahlungsart")
public class TZahlungsart {
    @Id
    @Column(name = "zahlungsart_id", nullable = false)
    private Integer id;

    @ColumnDefault("''")
    @Column(name = "zahlungs_typ", nullable = false, length = 50)
    private String zahlungsTyp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZahlungsTyp() {
        return zahlungsTyp;
    }

    public void setZahlungsTyp(String zahlungsTyp) {
        this.zahlungsTyp = zahlungsTyp;
    }

}