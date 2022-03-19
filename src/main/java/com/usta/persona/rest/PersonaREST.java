package com.usta.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usta.persona.model.Persona;
import com.usta.persona.service.PersonaService;

@RestController
@RequestMapping("/persona/")
public class PersonaREST {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas(){
		return ResponseEntity.ok(personaService.findAll());
	}
}
