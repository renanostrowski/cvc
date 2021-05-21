package com.cyberlog.cvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/dev")
	public Dev insertDevString(@RequestBody Dev dev) {
		return devRepository.save(dev);
	}
}
