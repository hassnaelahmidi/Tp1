package com.example.tp1.service.implementation;

import com.example.tp1.bean.Terain;
import com.example.tp1.dao.TerainDao;
import com.example.tp1.service.facade.TerainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerainServiceImp implements TerainService {

    public Terain findByRef(String ref) {
        return terainDao.findByRef(ref);
    }


    public int deleteByRef(String ref) {
        return terainDao.deleteByRef(ref);
    }

    public int save(Terain terain) {
        if (findByRef(terain.getRef()) != null) {
            return -1;
        } else {
            terainDao.save(terain);
        }
        return 1;
    }

    @Autowired
    TerainDao terainDao;
}
