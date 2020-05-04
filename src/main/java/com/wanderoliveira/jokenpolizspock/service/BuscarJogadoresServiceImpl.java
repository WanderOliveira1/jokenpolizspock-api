package com.wanderoliveira.jokenpolizspock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.repository.JogadorRepository;

@Service
public class BuscarJogadoresServiceImpl {

	@Autowired
	private JogadorRepository jogadorRepository;

	public List<Jogador> buscarTodosOsJogadores() {
		List<Jogador> listJogador = jogadorRepository.findAll();
		return listJogador;
	}

}
