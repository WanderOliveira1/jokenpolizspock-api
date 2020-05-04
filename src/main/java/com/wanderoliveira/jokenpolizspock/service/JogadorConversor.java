package com.wanderoliveira.jokenpolizspock.service;

import org.springframework.stereotype.Component;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.exception.JogadorResourceException;
import com.wanderoliveira.jokenpolizspock.resource.model.JogadorResource;

@Component
public class JogadorConversor {
	// validacao para conversao JSON para Entidade
	public Jogador conversor(JogadorResource jogadorResource) throws JogadorResourceException {
		try {

			Jogador jogador = new Jogador();
			String nome = checkNome(jogadorResource.getNome());
			String jogada = checkJogada(jogadorResource.getJogada());
			jogador.setNome(nome);
			jogador.setJogada(jogada);
			return jogador;
			
			//Lancamento de Excecao
		} catch (Exception e) {
			throw new JogadorResourceException("Falha no resoucer para entidade, resource: " + jogadorResource);
		}

	}

	private String checkNome(String nome) {
		return nome;
	}

	private String checkJogada(String jogada) {
		return jogada;
	}
}