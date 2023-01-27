package cl.duoc.bff.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.bff.clients.InstrumentFeignClient;
import cl.duoc.bff.models.entities.InstrumentEntity;

@Service
public class InstrumentService {
    
    @Autowired
    InstrumentFeignClient instrumentFeignClient;

    public InstrumentEntity getInstrumentById(String id) {
        return instrumentFeignClient.getInstrumentById(id);
    }

    public List<InstrumentEntity> getInstrumentByCategory(String category) {
        return instrumentFeignClient.getInstrumentByCategory(category);
    }
    
    public List<InstrumentEntity> getAll() {
        return instrumentFeignClient.getAll();
    }
}
