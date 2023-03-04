package com.example.tp1.ws.facade;

import com.example.tp1.bean.TaxeTnb;
import com.example.tp1.service.facade.TaxeTnbService;
import com.example.tp1.ws.Converter.TaxeTnbConverter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/TaxeTnb")
@RestController
public class TaxeTnbProvided {
    @Autowired
    TaxeTnbService taxeTnbService;
    @Autowired
    TaxeTnbConverter taxeTnbConverter;
@GetMapping("/terain/ref/{terain}/{ref}")
    public TaxeTnb findbyTerainRef(@PathVariable String ref) {
        return taxeTnbService.findByTerainRef(ref);
    }
@DeleteMapping("/terain/ref/{terain}/{ref}")
    @Transactional
    public int deletebyTerainRef(@PathVariable String ref) {
        return taxeTnbService.deleteByTerainRef(ref);
    }
@PostMapping("/")
     public int save( @PathVariable String ref, int annee) {
        return taxeTnbService.save(ref, annee);
    }
}
