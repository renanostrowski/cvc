package com.cyberlog.cvc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cyberlog.cvc.models.Dev;

public interface DevRepository extends JpaRepository<Dev, Integer>{
	
	Optional<Dev> findById(Integer id);

}

