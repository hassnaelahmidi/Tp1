package com.example.tp1.service.facade;

import com.example.tp1.bean.Terain;
import jakarta.transaction.Transactional;

public interface TerainService {
    Terain findByRef(String ref);

    @Transactional
    int deleteByRef(String ref);

    int save(Terain terain);
}
