package com.wanderoliveira.jokenpolizspock.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.exception.JogadorNotFoundException;
import com.wanderoliveira.jokenpolizspock.resource.model.JogadorResource;
import com.wanderoliveira.jokenpolizspock.service.BuscarJogadorPorIdServiceImpl;
import com.wanderoliveira.jokenpolizspock.service.CadastroJogadorServiceImpl;

@RestController
@RequestMapping(value = "/api")
public class JogadorController {

	// injecao do CadastroJogadorServiceImpl
	@Autowired
	private CadastroJogadorServiceImpl serviceCadastro;

	// injecao do BuscarJogadorPorIdServiceImpl
	@Autowired
	private BuscarJogadorPorIdServiceImpl serviceBuscarPorId;

	// Chama o servico buscarTodosOsJogadores
	@GetMapping(path = "/jogadores")
	public List<Jogador> buscarTodosOsJogadores() {
		return serviceBuscarPorId.buscarTodosOsJogadores();
	}

	// Chama o servico de buscar jogador por Id
	@GetMapping(path = "/jogador/id/{id}")
	public Jogador serviceBuscarPorId(@PathVariable(name = "id", required = true) Long id)
			throws JogadorNotFoundException {// se nao encontrar lanca a excecao
		return serviceBuscarPorId.buscarPorId(id);
	}

	// Chama o servico de cadastro do jogador
	@PostMapping(path = "/jogador/salvar")
	public void salvarJogador(@RequestBody JogadorResource jogador) {
		serviceCadastro.cadastro(jogador);
	}

	// Chama o servico de excluir o jogador
	@DeleteMapping(path = "/jogador/delete/{id}")
	public void deleteJogador(@PathVariable(name = "id", required = true) Long id) throws JogadorNotFoundException {
		serviceBuscarPorId.deletarPorId(id);
	}
}
