package com.example.tp1.service.facade;


import com.example.tp1.bean.CategorieTerain;
import com.example.tp1.bean.Redevable;
import jakarta.transaction.Transactional;

public interface CategorieTerainService {

    CategorieTerain findByCode(String code);


    int save(CategorieTerain categorieTerain);

    @Transactional
    int deleteByCin(String code);


}
