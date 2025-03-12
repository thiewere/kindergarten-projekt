package com.example.kindergarten_projekt.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Table(name = "t_eltern")
public class TEltern {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eltern_id", nullable = false)
    private Integer id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ColumnDefault("'0'")
    @JoinColumn(name = "eltern_plz", nullable = false)
    private TPostleitzahl elternPlz;

    @ColumnDefault("'0'")
    @Column(name = "eltern_vorname", nullable = false, length = 30)
    private String elternVorname;

    @ColumnDefault("'0'")
    @Column(name = "eltern_nachname", nullable = false, length = 30)
    private String elternNachname;

    @ColumnDefault("'0'")
    @Column(name = "eltern_strasse_hausnr", nullable = false, length = 50)
    private String elternStrasseHausnr;

    @ColumnDefault("'0'")
    @Column(name = "eltern_telefonnummer", nullable = false, length = 50)
    private String elternTelefonnummer;

    @ColumnDefault("'0'")
    @Column(name = "eltern_email", nullable = false, length = 30)
    private String elternEmail;

    @JsonIgnore
    @OneToMany(mappedBy =  "eltern")
    List<TBeitraege> beitraege;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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