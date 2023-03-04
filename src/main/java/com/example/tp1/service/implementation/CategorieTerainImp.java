package com.example.tp1.service.implementation;

import com.example.tp1.bean.CategorieTerain;
import com.example.tp1.dao.CategorieTerainDao;
import com.example.tp1.service.facade.CategorieTerainService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieTerainImp implements CategorieTerainService {
    @Autowired
    CategorieTerainDao categorieTerainDao;


    @Override
    public CategorieTerain findByCode(String code) {
        return categorieTerainDao.findByCode(code);
    }

    public int save(CategorieTerain categorieTerain) {
        if (findByCode(categorieTerain.getCode()) != null) {
            return -1;
        } else {
            categorieTerainDao.save(categorieTerain);
            return 1;
        }
    }

    @Override
    public int deleteByCin(String code) {
        return 0;
    }

    @Transactional
    public int deletebyCin(String code) {
        return 0;
    }

}
