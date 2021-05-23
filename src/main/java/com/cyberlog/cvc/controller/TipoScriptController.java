package com.cyberlog.cvc.controller;

import com.cyberlog.cvc.models.TipoScript;
import com.cyberlog.cvc.repository.TipoScriptRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class TipoScriptController {
    
    @Autowired
    TipoScriptRepository tipoScriptRepository;
    
    @GetMapping("/tiposcript")
    public List<TipoScript> listaTipoScript() {
        return tipoScriptRepository.findAll();
    }
    
    @GetMapping("/tiposcript/{id}")
    public TipoScript getTipoScript(@PathVariable(value = "id") Integer id) {
        Optional<TipoScript> oTipo = tipoScriptRepository.findById(id);
        return oTipo.get();
    }
    
    @PostMapping("/tiposcript")
    public TipoScript insertTipo(@RequestBody TipoScript tipo) {
        return tipoScriptRepository.save(tipo);
    }
    
    //Verificar
    @PutMapping("/tiposcript/{id}")
    public TipoScript updateTipo(@RequestBody TipoScript tipo) {
        return tipoScriptRepository.save(tipo);
    }
    
    @DeleteMapping("/tiposcript/{id}")
    public void deleteTipo(@PathVariable(name = "id") Integer id) {
        tipoScriptRepository.deleteById(id);
    }
}
