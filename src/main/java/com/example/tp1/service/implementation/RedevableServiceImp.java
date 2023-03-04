package com.example.tp1.service.implementation;

import com.example.tp1.bean.Redevable;
import com.example.tp1.dao.RedevableDao;
import com.example.tp1.service.facade.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedevableServiceImp implements RedevableService {
    @Autowired
    RedevableDao redevableDao;

    public Redevable findbyCin(String cin) {
        return redevableDao.findByCin(cin);
    }


    public int save(Redevable redevable) {
        if (findbyCin(redevable.getCin()) != null) {
            return -1;
        } else {
            redevableDao.save(redevable);
        }
        return 1;
    }


    public int deletebyCin(String cin) {
        return redevableDao.deleteByCin(cin);
    }
}
