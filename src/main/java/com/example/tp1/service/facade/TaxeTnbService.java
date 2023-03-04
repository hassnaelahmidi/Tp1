package com.example.tp1.service.facade;

import com.example.tp1.bean.TaxeTnb;
import jakarta.transaction.Transactional;

public interface TaxeTnbService {
    TaxeTnb findByTerainRef(String ref);

    @Transactional
    int deleteByTerainRef(String ref);

    int save(String ref,int annee);
}
