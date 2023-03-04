package com.example.tp1.ws.facade;

import com.example.tp1.bean.TauxTaxeTnb;
import com.example.tp1.service.facade.TauxTaxeTnbService;
import com.example.tp1.ws.Converter.TauxTaxeTnbConverter;
import com.example.tp1.ws.Dto.TauxTaxtTnbDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/TauxTaxeTnb")
public class TauxTaxeTnbProvided {
    @Autowired
    TauxTaxeTnbService tauxTaxeTnbService;
    @Autowired
    TauxTaxeTnbConverter tauxTaxeTnbConverter;
    @GetMapping("/Categorie/Code/{Categorie}/{Code}")

    public TauxTaxeTnb findbyCategorieCode(@PathVariable String categorieTerainCode) {
        return tauxTaxeTnbService.findByCategorieTerainCode(categorieTerainCode);
    }
@DeleteMapping("/Categorie/Code/{Categorie}/{Code}")
    @Transactional
    public int deletebyCategorieCode(@PathVariable String categorieTerainCode) {
        return tauxTaxeTnbService.deleteByCategorieTerainCode(categorieTerainCode);
    }
@PostMapping("/")
    public int save(@RequestBody TauxTaxeTnb tauxTaxeTnb) {

        return tauxTaxeTnbService.save(tauxTaxeTnb);
    }

    public TauxTaxtTnbDto ToDto(TauxTaxeTnb obj) {
        return tauxTaxeTnbConverter.ToDto(obj);
    }

    public TauxTaxeTnb ToObj(TauxTaxtTnbDto dto) {
        return tauxTaxeTnbConverter.ToObj(dto);
    }
}
