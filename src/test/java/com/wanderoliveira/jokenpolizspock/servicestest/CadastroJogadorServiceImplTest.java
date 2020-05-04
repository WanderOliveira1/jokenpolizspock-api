package com.wanderoliveira.jokenpolizspock.servicestest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.repository.JogadorRepository;
import com.wanderoliveira.jokenpolizspock.resource.model.JogadorResource;
import com.wanderoliveira.jokenpolizspock.service.CadastroJogadorServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
@Sql(scripts = "/sql/delete_jogadores.sql")
public class CadastroJogadorServiceImplTest {

	@Autowired
	private CadastroJogadorServiceImpl serviceImpl;

	@Autowired
	private JogadorRepository jogadorRepository;

	private JogadorResource resource;

	@Before
	public void setUp() {
		String Nome = null;
		String Jogada = null;
		resource = new JogadorResource(Nome, Jogada);
		resource.setNome("Jogador 1");
		resource.setJogada("PEDRA");
	}

	@Test
	public void cadastroTest() {
		serviceImpl.cadastro(resource);

		Jogador jogador = jogadorRepository.findAll().stream().filter(player -> player.getNome().equals("Jogador 1"))
				.findFirst().get();

		assertEquals("Jogador 1", jogador.getNome());
		assertEquals("PEDRA", jogador.getJogada());

	}
}
