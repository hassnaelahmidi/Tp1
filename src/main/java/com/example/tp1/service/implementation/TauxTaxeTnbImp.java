package com.example.tp1.service.implementation;

import com.example.tp1.bean.TauxTaxeTnb;
import com.example.tp1.dao.TauxTaxeTnbDao;
import com.example.tp1.service.facade.TauxTaxeTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TauxTaxeTnbImp implements TauxTaxeTnbService {
    @Autowired
    TauxTaxeTnbDao tauxTaxeTnbDao;


    public TauxTaxeTnb findByCategorieTerainCode(String categorieTerainCode) {
        return tauxTaxeTnbDao.findByCategorieTerainCode(categorieTerainCode);
    }


    public int deleteByCategorieTerainCode(String categorieTerainCode) {
        return 0;
    }

    public int save(TauxTaxeTnb tauxTaxeTnb) {
        if(tauxTaxeTnb == null){
            return -1;
        } else if (tauxTaxeTnb.getCategorieTerain()==null) {
            return -2;
        }else{
            tauxTaxeTnbDao.save(tauxTaxeTnb);
        }
        return 1;
    }
}
