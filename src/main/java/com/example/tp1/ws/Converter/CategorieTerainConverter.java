package com.example.tp1.ws.Converter;

import com.example.tp1.bean.CategorieTerain;
import com.example.tp1.dao.CategorieTerainDao;
import com.example.tp1.ws.Dto.CategorieTerainDto;
import org.springframework.stereotype.Component;

@Component
public class CategorieTerainConverter {
    CategorieTerainDto toDto(CategorieTerain obj) {
        CategorieTerainDto dto = new CategorieTerainDto();
        if (obj != null) {
            dto.setCode(obj.getCode());
            dto.setLibelle(obj.getLibelle());
            dto.setId(obj.getId());
        }
        return dto;
    }

    CategorieTerain toObj(CategorieTerainDto dto) {
        CategorieTerain obj = new CategorieTerain();
        if (dto != null) {
            obj.setCode(dto.getCode());
            obj.setLibelle(dto.getLibelle());
            obj.setId(dto.getId());
        }
        return obj;
    }

}
