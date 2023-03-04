package com.example.tp1.service.facade;

import com.example.tp1.bean.Redevable;
import jakarta.transaction.Transactional;

public interface RedevableService {
    Redevable findbyCin(String cin);

    int save(Redevable redevable);

    @Transactional
    int deletebyCin(String cin);
}
