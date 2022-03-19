package com.usta.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usta.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
