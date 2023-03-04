package com.example.tp1.bean;

import jakarta.persistence.*;

@Entity
public class TauxTaxeTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CategorieTerain categorieTerain;
    private double montantMetreCarre;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategorieTerain getCategorieTerain() {
        return categorieTerain;
    }

    public void setCategorieTerain(CategorieTerain categorieTerain) {
        this.categorieTerain = categorieTerain;
    }

    public double getMontantMetreCarre() {
        return montantMetreCarre;
    }

    public void setMontantMetreCarre(double montantMetreCarre) {
        this.montantMetreCarre = montantMetreCarre;
    }
}
