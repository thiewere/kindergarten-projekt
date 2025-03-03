package com.example.kindergarten_projekt;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class TElternKinderId implements java.io.Serializable {
    private static final long serialVersionUID = -3329236065479322641L;
    @Column(name = "ek_eltern_id", nullable = false)
    private Integer ekElternId;

    @Column(name = "ek_kind_id", nullable = false)
    private Integer ekKindId;

    public Integer getEkElternId() {
        return ekElternId;
    }

    public void setEkElternId(Integer ekElternId) {
        this.ekElternId = ekElternId;
    }

    public Integer getEkKindId() {
        return ekKindId;
    }

    public void setEkKindId(Integer ekKindId) {
        this.ekKindId = ekKindId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TElternKinderId entity = (TElternKinderId) o;
        return Objects.equals(this.ekElternId, entity.ekElternId) &&
                Objects.equals(this.ekKindId, entity.ekKindId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ekElternId, ekKindId);
    }

}