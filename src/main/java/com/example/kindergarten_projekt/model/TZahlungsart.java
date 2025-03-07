package com.example.kindergarten_projekt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Table(name = "t_zahlungsart")
public class TZahlungsart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zahlungsart_id", nullable = false)
    private Integer id;

    @ColumnDefault("''")
    @Column(name = "zahlungs_typ", nullable = false, length = 50)
    private String zahlungsTyp;

    @JsonManagedReference
    @OneToMany(mappedBy = "zahlungsart")
    List<TBeitraege> beitraege;

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