package com.example.tp1.ws.Converter;

import com.example.tp1.bean.Terain;
import com.example.tp1.ws.Dto.TerainDto;
import org.springframework.stereotype.Component;

@Component
public class TerainConverter {
    public TerainDto ToDto(Terain obj) {
        TerainDto dto = new TerainDto();
        if (obj != null) {
            dto.setId(obj.getId());
            dto.setSurface(obj.getSurface());
            dto.setRef(obj.getRef());
        }
        return dto;
    }

    public Terain ToDto(TerainDto dto) {
        Terain obj = new Terain();
        if (dto != null) {
            obj.setId(dto.getId());
            obj.setSurface(dto.getSurface());
            obj.setRef(dto.getRef());
        }
        return obj;
    }
}
