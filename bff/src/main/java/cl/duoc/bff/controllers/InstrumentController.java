package cl.duoc.bff.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.bff.models.entities.InstrumentEntity;
import cl.duoc.bff.services.InstrumentService;

@RestController
@RequestMapping(path = "/instruments-bff")
public class InstrumentController {
    
    @Autowired
    InstrumentService instrumentService;

    @GetMapping(path = "/search/{id}")
    public InstrumentEntity getInstrumentById(@PathVariable String id) {
        return instrumentService.getInstrumentById(id);
    }

    @GetMapping(path = "/category/{category}")
    public List<InstrumentEntity> getInstrumentByCategory(@PathVariable String category) {
        return instrumentService.getInstrumentByCategory(category);
    }
    
    @GetMapping(path = "/all")
    public List<InstrumentEntity> getAll() {
        return instrumentService.getAll();
    }
}
