package cl.duoc.bff.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.bff.models.entities.InstrumentEntity;

@FeignClient(name = "db-instruments", url = "http://localhost:8181/api/instruments")
public interface InstrumentFeignClient {
    
    @GetMapping(path = "/search/{id}")
    public InstrumentEntity getInstrumentById(@PathVariable String id);

    @GetMapping(path = "/category/{category}")
    public List<InstrumentEntity> getInstrumentByCategory(@PathVariable String category);
    
    @GetMapping(path = "/all")
    public List<InstrumentEntity> getAll();
}
