package com.example.tp1.dao;

import com.example.tp1.bean.Terain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerainDao extends JpaRepository<Terain, Long> {
    Terain findByRef(String ref);

    int deleteByRef(String ref);
}
