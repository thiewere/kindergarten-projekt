package com.example.kindergarten_projekt.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_gruppe")
public class TGruppe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gruppe_id")
    private Long id;

    @Column(name = "gruppe_name")
    private String gruppeName;

    @Column(name = "gruppe_groesse")
    private Integer gruppeGroesse;


    @OneToMany(mappedBy = "gruppe")
    private List<TKinder> kinders;

    public TGruppe() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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