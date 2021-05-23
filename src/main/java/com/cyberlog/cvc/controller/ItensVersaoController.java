package com.cyberlog.cvc.controller;

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

import com.cyberlog.cvc.models.ItensVersao;
import com.cyberlog.cvc.repository.ItensVersaoRepository;

@RestController
@RequestMapping("/api")
public class ItensVersaoController {
	
	@Autowired
	ItensVersaoRepository itensVersaoRepository;
	
	@GetMapping("/itens")
	public List<ItensVersao> listarItensVersao() {
		return itensVersaoRepository.findAll();
	}
	
	@GetMapping("/item/{itensversaooid}")
	public ItensVersao getItensVersao(@PathVariable(value = "itensversaooid") Integer itensversaooid) {
		Optional<ItensVersao> oItem = itensVersaoRepository.findById(itensversaooid);
		ItensVersao item = oItem.get();
		return item;
	}
	
	//Verificar Inserindo dev null
	@PostMapping("/item")
	public ItensVersao insertItemVersao(@RequestBody ItensVersao item) {
		return itensVersaoRepository.save(item);
	}
	
	//Verificar
	@PutMapping("/item")
	public ItensVersao updateDev(@RequestBody ItensVersao item) {
		return itensVersaoRepository.save(item);
	}
	
	@DeleteMapping("/item/{id}")
	public String deleteItemVersao(@PathVariable(name = "id") Integer id) {
		itensVersaoRepository.deleteById(id);
		
		return "200";
	}
}
