package com.example.kindergarten_projekt;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "t_eltern")
public class TEltern {
    @Id
    @Column(name = "eltern_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ColumnDefault("'0'")
    @JoinColumn(name = "eltern_plz", nullable = false)
    private com.example.kindergarten_projekt.TPostleitzahl elternPlz;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.kindergarten_projekt.TPostleitzahl getElternPlz() {
        return elternPlz;
    }

    public void setElternPlz(com.example.kindergarten_projekt.TPostleitzahl elternPlz) {
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