package com.example.kindergarten_projekt.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Table(name = "t_gruppe")
public class TGruppe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gruppe_id", nullable = false)
    private Integer id;

    @ColumnDefault("'0'")
    @Column(name = "gruppe_name", nullable = false, length = 20)
    private String gruppeName;

    @ColumnDefault("0")
    @Column(name = "gruppe_groesse", nullable = false)
    private Integer gruppeGroesse;

    @JsonManagedReference
    @OneToMany(mappedBy = "gruppe")
    private List<TKinder> kinders;

    @JsonManagedReference
    @OneToMany(mappedBy = "mitarbeiterGruppe")
    private List<TMitarbeiter> mitarbeiter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGruppeName() {
        return gruppeName;
    }

    public void setGruppeName(String gruppeName) {
        this.gruppeName = gruppeName;
    }

    public Integer getGruppeGroesse() {
        return gruppeGroesse;
    }

    public void setGruppeGroesse(Integer gruppeGroesse) {
        this.gruppeGroesse = gruppeGroesse;
    }

}