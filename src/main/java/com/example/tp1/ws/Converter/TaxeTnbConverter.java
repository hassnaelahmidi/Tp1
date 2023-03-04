package com.example.tp1.ws.Converter;

import com.example.tp1.bean.TaxeTnb;
import com.example.tp1.ws.Dto.TaxeTnbDto;
import org.springframework.stereotype.Component;

@Component
public class TaxeTnbConverter {
   TaxeTnbDto toDto(TaxeTnb obj){
       TaxeTnbDto dto = new TaxeTnbDto();
       if(obj!=null){
           dto.setId(obj.getId());
           dto.setTauxTaxeTnb(obj.getTauxTaxeTnb());
           dto.setTerain(obj.getTerain());
           dto.setMontantBase(obj.getMontantBase());
           dto.setAnnee(obj.getAnnee());
       }
       return dto;
   }
   TaxeTnb toObj(TaxeTnbDto dto){
       TaxeTnb obj = new TaxeTnb();
       if(dto!=null){
           obj.setId(dto.getId());
           obj.setTauxTaxeTnb(dto.getTauxTaxeTnb());
           obj.setTerain(dto.getTerain());
           obj.setMontantBase(dto.getMontantBase());
           obj.setAnnee(dto.getAnnee());
       }
       return obj;
   }
}
