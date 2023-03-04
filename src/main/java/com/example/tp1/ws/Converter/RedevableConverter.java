package com.example.tp1.ws.Converter;

import com.example.tp1.bean.Redevable;
import com.example.tp1.ws.Dto.RedevableDto;
import org.springframework.stereotype.Component;

@Component
public class RedevableConverter {
    public RedevableDto ToDto(Redevable obj) {
        RedevableDto dto = new RedevableDto();
        if (obj != null) {
            dto.setCin(obj.getCin());
            dto.setId(obj.getId());
            dto.setNom(obj.getNom());
        }
        return dto;
    }

    public Redevable ToObjet(RedevableDto dto) {
        Redevable obj = new Redevable();
        if (dto != null) {
            obj.setCin(dto.getCin());
            obj.setId(dto.getId());
            obj.setNom(dto.getNom());
        }
        return obj;
    }
}
