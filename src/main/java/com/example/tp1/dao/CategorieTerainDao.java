package com.example.tp1.dao;

import com.example.tp1.bean.CategorieTerain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieTerainDao extends JpaRepository<CategorieTerain, Long> {
    CategorieTerain findByCode(String code);

    int deleteByCode(String code);
}
