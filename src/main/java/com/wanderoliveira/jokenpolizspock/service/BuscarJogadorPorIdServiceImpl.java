package com.wanderoliveira.jokenpolizspock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.exception.JogadorNotFoundException;
import com.wanderoliveira.jokenpolizspock.repository.JogadorRepository;

@Service
public class BuscarJogadorPorIdServiceImpl {
	@Autowired
	private JogadorRepository jogadorRepository;

	// buscar o Jogador por Id
	public Jogador buscarPorId(Long id) throws JogadorNotFoundException {
		Optional<Jogador> optionalJogador = getOptional(id);

		// Verificar se o jogador nao existir
		Jogador jogador = null;
		if (!optionalJogador.isPresent()) {
			throw new JogadorNotFoundException("Jogador nao encontrado atraves do ID: " + id);
		} else {
			jogador = optionalJogador.get();// se existir id, isso evita o NullPointer
		}
		return jogador;
	}

	private Optional<Jogador> getOptional(Long id) {
		Optional<Jogador> optionalJogador = jogadorRepository.findById(id);
		return optionalJogador;
	}
	// metodo de exluir por id o jogador
	public void deletarPorId(Long id) throws JogadorNotFoundException {
		Optional<Jogador> optionalJogador = getOptional(id);
		if (!optionalJogador.isPresent()) {
			throw new JogadorNotFoundException("Jogador nao encontrado para excluir atraves do ID: " + id);
		} else {
			jogadorRepository.delete(optionalJogador.get());
		}
		jogadorRepository.deleteById(id);
	}

	// metodo de listar todos os jogadores
	public List<Jogador> buscarTodosOsJogadores() {
		List<Jogador> listJogadores = jogadorRepository.findAll();
		return listJogadores;
	}
}
