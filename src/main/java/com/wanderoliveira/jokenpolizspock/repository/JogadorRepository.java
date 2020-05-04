package com.wanderoliveira.jokenpolizspock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

}
