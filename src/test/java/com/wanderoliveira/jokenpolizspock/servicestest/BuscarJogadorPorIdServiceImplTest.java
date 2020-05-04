package com.wanderoliveira.jokenpolizspock.servicestest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.exception.JogadorNotFoundException;
import com.wanderoliveira.jokenpolizspock.repository.JogadorRepository;
import com.wanderoliveira.jokenpolizspock.service.BuscarJogadorPorIdServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
@Sql(scripts = "/sql/insert_Jogadores_para_test_buscar_por_id.sql")
public class BuscarJogadorPorIdServiceImplTest {

	 @Autowired
	  private BuscarJogadorPorIdServiceImpl serviceImpl;

	  @Autowired
	  private JogadorRepository jogadorRepository;

	  @Test
	  public void buscarPorIdTest() throws JogadorNotFoundException {

	    Jogador jogador = serviceImpl.buscarPorId(1L);

	    assertEquals("JOGADOR 1", jogador.getNome());
	    assertEquals("PEDRA", jogador.getJogada());

	  }

	  @Test
	  public void deletarPorIdTest() throws JogadorNotFoundException {
	    serviceImpl.deletarPorId(1L);

	    Optional<Jogador> optionalJogador = jogadorRepository.findById(1L);

	    assertFalse(optionalJogador.isPresent());
	  }

}
