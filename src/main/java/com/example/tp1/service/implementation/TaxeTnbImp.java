package com.example.tp1.service.implementation;

import com.example.tp1.bean.CategorieTerain;
import com.example.tp1.bean.TauxTaxeTnb;
import com.example.tp1.bean.TaxeTnb;
import com.example.tp1.bean.Terain;
import com.example.tp1.dao.TaxeTnbDao;
import com.example.tp1.service.facade.TauxTaxeTnbService;
import com.example.tp1.service.facade.TaxeTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxeTnbImp implements TaxeTnbService {
   @Autowired
    TaxeTnbDao taxeTnbDao;
   @Autowired
   TerainServiceImp terainServiceImp;
   @Autowired
   TauxTaxeTnbImp tauxTaxeTnbImp;


    public TaxeTnb findbyTerainRefAndAnnee(String ref,int annee) {
        return taxeTnbDao.findByTerainRefAndAnnee(ref , annee);
    }



    public TaxeTnb findByTerainRef(String ref) {
        return taxeTnbDao.findByTerainRef(ref);
    }

    public int deleteByTerainRef(String ref) {
        return 0;
    }

    public int save(String ref,int annee) {
        Terain terain= terainServiceImp.findByRef(ref);
        if(terain==null){
            return -1;
        }
        CategorieTerain categorieTerain =terain.getCategorieTerain();
        if(categorieTerain==null){
            return -2;
        }
        TauxTaxeTnb tauxTaxeTnb = tauxTaxeTnbImp.findByCategorieTerainCode(categorieTerain.getCode());
        if(tauxTaxeTnb==null){
            return -3;
        }
        if(taxeTnbDao.findByTerainRefAndAnnee(ref,  annee)!=null){
            return -4;
        } else {
            double montantBase=terain.getSurface()*tauxTaxeTnb.getMontantMetreCarre();
            TaxeTnb taxeTnb =new TaxeTnb();
            taxeTnb.setTauxTaxeTnb(tauxTaxeTnb);
            taxeTnb.setTerain(terain);
            taxeTnb.setAnnee((int)annee);
            taxeTnb.setMontantBase(montantBase);
            taxeTnbDao.save(taxeTnb);
        }

        return 1;
    }
}
