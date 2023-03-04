package com.example.tp1.ws.Converter;

import com.example.tp1.bean.TauxTaxeTnb;
import com.example.tp1.ws.Dto.TauxTaxtTnbDto;
import org.springframework.stereotype.Component;

@Component
public class TauxTaxeTnbConverter {
    public TauxTaxtTnbDto ToDto(TauxTaxeTnb obj) {
        TauxTaxtTnbDto dto = new TauxTaxtTnbDto();
        if (obj != null) {
            dto.setId(obj.getId());
            dto.setCategorieTerain(obj.getCategorieTerain());
            dto.setMontantMetreCarre(obj.getMontantMetreCarre());
        }
        return dto;
    } public TauxTaxeTnb ToObj(TauxTaxtTnbDto dto ) {
        TauxTaxeTnb obj = new TauxTaxeTnb();
        if (dto != null) {
            obj.setId(dto.getId());
            obj.setCategorieTerain(dto.getCategorieTerain());
            obj.setMontantMetreCarre(dto.getMontantMetreCarre());
        }
        return obj;
    }
}
