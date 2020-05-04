package com.wanderoliveira.jokenpolizspock.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.exception.JogadorResourceException;
import com.wanderoliveira.jokenpolizspock.repository.JogadorRepository;
import com.wanderoliveira.jokenpolizspock.resource.model.JogadorResource;

// Classe de cadastro do jogador com log
@Service
public class CadastroJogadorServiceImpl {
	private static final Logger LOG = Logger.getLogger(CadastroJogadorServiceImpl.class);

	@Autowired
	private JogadorRepository jogadorRepository;

	@Autowired
	private JogadorConversor service;

	public void cadastro(JogadorResource jogadorResource) {

		try {
			Jogador jogador = service.conversor(jogadorResource);
			jogadorRepository.saveAndFlush(jogador);
		} catch (JogadorResourceException e) {
			LOG.error("Erro ao salvar o jogador: " + e.getMessage(), e);
		}
	}
}
