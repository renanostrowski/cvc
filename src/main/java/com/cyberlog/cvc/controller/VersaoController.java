package com.cyberlog.cvc.controller;

import com.cyberlog.cvc.repository.VersaoRepository;
import com.cyberlog.cvc.models.Versao;
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
@RequestMapping("/api")
public class VersaoController {
    
    @Autowired
    VersaoRepository versaoRepository;
    
    @GetMapping("/versao")
    public List<Versao> listarVersao() {
        return versaoRepository.findAll();
    }
    
    @GetMapping("/versao/{id}")
    public Versao getVersao(@PathVariable(name = "id") Integer id) {
        Optional<Versao> oVersao = versaoRepository.findById(id);
        return oVersao.get();
    }
    
    @PostMapping("/versao")
    public Versao insertVersao(@RequestBody Versao versao){
        return versaoRepository.save(versao);
    }
    
    @PutMapping("/versao/{id}")
    public Versao updateVersao(@RequestBody Versao versao) {
        return versaoRepository.save(versao);
    }
    
    @DeleteMapping("/versao/{versaooid}")
    public void deleteVersao(@PathVariable(name = "versaooid") Integer versaooid) {
        versaoRepository.deleteById(versaooid);
    }
    
}
