package com.example.tp1.ws.Dto;

import com.example.tp1.bean.TauxTaxeTnb;
import com.example.tp1.bean.Terain;
import jakarta.persistence.ManyToOne;

public class TaxeTnbDto {
    private Long id;
    @ManyToOne
    private Terain terain;
    @ManyToOne
    private TauxTaxeTnb tauxTaxeTnb;
    private double montantBase;
    private int annee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Terain getTerain() {
        return terain;
    }

    public void setTerain(Terain terain) {
        this.terain = terain;
    }

    public TauxTaxeTnb getTauxTaxeTnb() {
        return tauxTaxeTnb;
    }

    public void setTauxTaxeTnb(TauxTaxeTnb tauxTaxeTnb) {
        this.tauxTaxeTnb = tauxTaxeTnb;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
