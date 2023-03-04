package com.example.tp1.ws.facade;

import com.example.tp1.bean.Terain;
import com.example.tp1.service.facade.TerainService;
import com.example.tp1.ws.Converter.TerainConverter;
import com.example.tp1.ws.Dto.TerainDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Terain")
public class TerainProvieded {
    @Autowired
    TerainService terainService;
    @Autowired
    TerainConverter terainConverter;

    @GetMapping("/ref/{ref}")
    public TerainDto findByRef(@PathVariable String ref) {
        Terain terain = terainService.findByRef(ref);
        TerainDto terainDto = terainConverter.ToDto(terain);
        return terainDto;

    }

    @DeleteMapping("/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return terainService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Terain terain) {
        return terainService.save(terain);
    }
}
