package com.example.tp1.ws.facade;

import com.example.tp1.bean.Redevable;
import com.example.tp1.service.facade.RedevableService;
import com.example.tp1.ws.Converter.RedevableConverter;
import com.example.tp1.ws.Dto.RedevableDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Redevable")
public class RedevableProvided {
    @Autowired
    RedevableService redevableService;
    @Autowired
    RedevableConverter redevableConverter;

    @GetMapping("/cin/{cin}")
    public RedevableDto findbyCin(@PathVariable String cin) {
        Redevable redevable = redevableService.findbyCin(cin);
        RedevableDto redevableDto = redevableConverter.ToDto(redevable);
        return redevableDto;
    }

    public RedevableDto ToDto(Redevable obj) {
        return redevableConverter.ToDto(obj);
    }

    public Redevable ToObjet(RedevableDto dto) {
        return redevableConverter.ToObjet(dto);
    }

    @PostMapping("/")
    public int save(@RequestBody Redevable redevable) {
        return redevableService.save(redevable);
    }

    @DeleteMapping("/cin/{cin}")
    @Transactional
    public int deletebyCin(@PathVariable String cin) {
        return redevableService.deletebyCin(cin);
    }
}
