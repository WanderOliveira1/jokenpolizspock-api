package com.wanderoliveira.jokenpolizspock.servicestest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Objects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wanderoliveira.jokenpolizspock.datasource.model.Jogador;
import com.wanderoliveira.jokenpolizspock.repository.JogadorRepository;
import com.wanderoliveira.jokenpolizspock.service.BuscarJogadorPorIdServiceImpl;


@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
@Sql(scripts = "/sql/insert_buscar_todos_os_jogadores.sql")
public class BuscarJogadorersServiceImplTest {

	
		 @Autowired
		  private BuscarJogadorPorIdServiceImpl serviceImpl;

		  @Autowired
		  private JogadorRepository jogadorRepository;

		  @Test
		  public void buscarTodosOsJogadoresTest() {
		    List<Jogador> listaJogadores = serviceImpl.buscarTodosOsJogadores();

		    List<Jogador> listaJogadoresDatabase = jogadorRepository.findAll();
		    assertNotNull(Objects.nonNull(listaJogadores));
		    assertEquals(listaJogadores.size(), listaJogadoresDatabase.size());

		  }
	}
