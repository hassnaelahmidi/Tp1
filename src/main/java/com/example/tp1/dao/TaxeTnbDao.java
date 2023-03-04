package com.example.tp1.dao;

import com.example.tp1.bean.TaxeTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeTnbDao extends JpaRepository<TaxeTnb,Long> {
    TaxeTnb findByTerainRefAndAnnee(String terainref, int annee);

    int deleteByTerainRefAndAnnee(String terainref, int annee);

    TaxeTnb findByTerainRef(String terainref);

}
