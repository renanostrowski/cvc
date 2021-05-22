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
	
	@GetMapping("/item/{id}")
	public ItensVersao getItensVersao(@PathVariable(value = "id") Integer id) {
		Optional<ItensVersao> oItem = itensVersaoRepository.findById(id);
		ItensVersao item = oItem.get();
		return item;
	}
	
	@PostMapping("/item")
	public ItensVersao insertItemVersao(@RequestBody ItensVersao item) {
		return itensVersaoRepository.save(item);
	}
	
	@PutMapping("/item")
	public ItensVersao updateItemVersao(@RequestBody ItensVersao item) {
		return itensVersaoRepository.save(item);
	}
	
	@DeleteMapping("/item/{id}")
	public void deleteItemVersao(@PathVariable(name = "id") Integer id) {
		itensVersaoRepository.deleteById(id);
	}
}
