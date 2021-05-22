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

import com.cyberlog.cvc.models.Dev;
import com.cyberlog.cvc.repository.DevRepository;

@RestController
@RequestMapping(value = "/api")
public class DevController {
	
	@Autowired
	DevRepository devRepository;
	
	@GetMapping("/devs")
	public List<Dev> listaDevs() {
		return devRepository.findAll();
	}
	
	@GetMapping("/dev/{id}")
	public Dev getDev(@PathVariable(value = "id") Integer id) {
		Optional<Dev> oDev = devRepository.findById(id);
		Dev dev = oDev.get();
		return dev;
	}
	
	@PostMapping("/dev")
	public Dev insertDevString(@RequestBody Dev dev) {
		return devRepository.save(dev);
	}
	
	@PutMapping("/dev")
	public Dev updateDev(@RequestBody Dev dev) {
		return devRepository.save(dev);
	}
	
	@DeleteMapping("/dev/{id}")
	public void deleteDev(Integer id) {
		devRepository.deleteById(id);
	}
	
}
