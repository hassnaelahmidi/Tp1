package com.example.tp1.bean;

import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;

@Entity
public class Terain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ref;
    private double surface;

    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private CategorieTerain categorieTerain;

    public CategorieTerain getCategorieTerain() {
        return categorieTerain;
    }

    public void setCategorieTerain(CategorieTerain categorieTerain) {
        this.categorieTerain = categorieTerain;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
