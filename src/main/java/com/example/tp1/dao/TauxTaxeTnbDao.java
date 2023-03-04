package com.example.tp1.dao;

import com.example.tp1.bean.TauxTaxeTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TauxTaxeTnbDao extends JpaRepository<TauxTaxeTnb,Long> {

    TauxTaxeTnb findByCategorieTerainCode( String categorieTerainCode);

    int deleteByCategorieTerainCode(String categorieTerainCode);

}
