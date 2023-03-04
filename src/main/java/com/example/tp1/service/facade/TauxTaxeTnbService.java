package com.example.tp1.service.facade;

import com.example.tp1.bean.TauxTaxeTnb;
import jakarta.transaction.Transactional;

public interface TauxTaxeTnbService {
    TauxTaxeTnb findByCategorieTerainCode(String categorieTerainCode);

    @Transactional
    int deleteByCategorieTerainCode(String categorieTerainCode);

    int save(TauxTaxeTnb tauxTaxeTnb);
}
