package com.example.tp1.ws.facade;

import com.example.tp1.bean.CategorieTerain;
import com.example.tp1.service.facade.CategorieTerainService;
import com.example.tp1.ws.Converter.CategorieTerainConverter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/CategorieTerain")
public class CategorieTerainrProvieded {
    @Autowired
    CategorieTerainService categorieTerainService;
    @Autowired
    CategorieTerainConverter categorieTerainConverter;

    @GetMapping("/code/{code}")
    public CategorieTerain findByCode(@PathVariable String code) {
        return categorieTerainService.findByCode(code);
    }

    @PostMapping("/")
    public int save(@PathVariable CategorieTerain categorieTerain) {
        return categorieTerainService.save(categorieTerain);
    }

    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieTerainService.deleteByCin(code);
    }

}
