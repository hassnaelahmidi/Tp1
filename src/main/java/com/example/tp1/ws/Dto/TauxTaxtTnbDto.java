package com.example.tp1.ws.Dto;

import com.example.tp1.bean.CategorieTerain;
import jakarta.persistence.ManyToOne;

public class TauxTaxtTnbDto {
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
