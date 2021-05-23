package com.cyberlog.cvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyberlog.cvc.models.Script;
import com.cyberlog.cvc.repository.ScriptRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class ScriptController {
    @Autowired
    ScriptRepository scriptRepository;
    
    //Verificar Todos.
    
    @GetMapping("/script")
    public List<Script> listarScripts() {
        return scriptRepository.findAll();
    }
    
    @GetMapping("script/{id}")
    public Script getScript(@PathVariable(name = "id") Integer id) {
        Optional<Script> oScript = scriptRepository.findById(id);
        return oScript.get();
    }
    
    @PostMapping("/script")
    public Script insertScript(@RequestBody Script script) {
        return scriptRepository.save(script);
    }
    
    @PutMapping("/script/{id}")
    public Script updateScript(@RequestBody Script script) {
        return scriptRepository.save(script);
    }
    
    @DeleteMapping("/script/{id}")
    public void deleteScript(Integer id) {
        scriptRepository.deleteById(id);
    }
    
}
