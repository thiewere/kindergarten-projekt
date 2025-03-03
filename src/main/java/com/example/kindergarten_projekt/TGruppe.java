package com.example.kindergarten_projekt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "t_gruppe")
public class TGruppe {
    @Id
    @Column(name = "gruppe_id", nullable = false)
    private Integer id;

    @ColumnDefault("'0'")
    @Column(name = "gruppe_name", nullable = false, length = 20)
    private String gruppeName;

    @ColumnDefault("0")
    @Column(name = "gruppe_groesse", nullable = false)
    private Integer gruppeGroesse;

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