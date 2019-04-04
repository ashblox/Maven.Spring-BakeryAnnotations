package com.zipcodewilmington.bakery.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "muffin_table")
public class Muffin {

    @Id
    @GeneratedValue
    private Long id;

    private String flavor;

    public Muffin() {
    }

    public Muffin(String flavor) {
        this.flavor = flavor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Muffin muffin = (Muffin) o;
        return Objects.equals(id, muffin.id) &&
                Objects.equals(flavor, muffin.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flavor);
    }
}
