package com.example.tp1.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TaxeTnb {
    @Id
    private Long id;
    @ManyToOne
    private Terain terain;
    @ManyToOne
    private TauxTaxeTnb tauxTaxeTnb;
    private double montantBase;
    private int annee;

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

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
}
