package com.wanderoliveira.jokenpolizspock.servicestest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wanderoliveira.jokenpolizspock.Jogada;
import com.wanderoliveira.jokenpolizspock.jokenpolizspock;

public class jokenpolizspockTest {
	//Teste Pedra
	@Test
	public void jogarPedraGanha() {
		assertEquals("pedra", jokenpolizspock.jogar(Jogada.PEDRA, Jogada.TESOURA));
		assertEquals("pedra", jokenpolizspock.jogar(Jogada.TESOURA, Jogada.PEDRA));
		assertEquals("pedra2", jokenpolizspock.jogar(Jogada.LAGARTO, Jogada.TESOURA));
		assertEquals("pedra2", jokenpolizspock.jogar(Jogada.TESOURA, Jogada.LAGARTO));
	}
	//Teste Papel
	@Test
	public void jogarPapelGanha() {
		assertEquals("papel", jokenpolizspock.jogar(Jogada.PAPEL, Jogada.PEDRA));
		assertEquals("papel", jokenpolizspock.jogar(Jogada.PEDRA, Jogada.PAPEL));
		assertEquals("papel2", jokenpolizspock.jogar(Jogada.PEDRA2, Jogada.SPOCK2));
		assertEquals("papel2", jokenpolizspock.jogar(Jogada.SPOCK2, Jogada.PEDRA2));
	}
	//Teste Tesoura
	@Test
	public void jogarTesouraGanha() {
		assertEquals("tesoura", jokenpolizspock.jogar(Jogada.TESOURA, Jogada.PAPEL));
		assertEquals("tesoura", jokenpolizspock.jogar(Jogada.PAPEL, Jogada.TESOURA));
		assertEquals("tesoura2", jokenpolizspock.jogar(Jogada.PAPEL2, Jogada.LAGARTO2));
		assertEquals("tesoura2", jokenpolizspock.jogar(Jogada.LAGARTO2, Jogada.LAGARTO2));
	}
	//Teste Lagarto
	@Test
	public void jogarLagartoGanha() {
		assertEquals("lagarto", jokenpolizspock.jogar(Jogada.LAGARTO, Jogada.PAPEL));
		assertEquals("lagarto", jokenpolizspock.jogar(Jogada.PAPEL, Jogada.LAGARTO));
		assertEquals("lagarto2", jokenpolizspock.jogar(Jogada.LAGARTO2, Jogada.SPOCK2));
		assertEquals("lagarto2", jokenpolizspock.jogar(Jogada.SPOCK2, Jogada.LAGARTO2));
	}
	//Teste Spock
	@Test
	public void jogarSpockGanha() {
		assertEquals("spock", jokenpolizspock.jogar(Jogada.SPOCK, Jogada.PEDRA));
		assertEquals("spock", jokenpolizspock.jogar(Jogada.PEDRA, Jogada.SPOCK));
		assertEquals("spock2", jokenpolizspock.jogar(Jogada.SPOCK2, Jogada.TESOURA2));
		assertEquals("spock2", jokenpolizspock.jogar(Jogada.TESOURA2, Jogada.SPOCK2));
	}
	//TEste Empate
	@Test
	public void jogarEmpate() {
		assertEquals("empate", jokenpolizspock.jogar(Jogada.TESOURA, Jogada.TESOURA));
		assertEquals("empate", jokenpolizspock.jogar(Jogada.PAPEL, Jogada.PAPEL));
		assertEquals("empate", jokenpolizspock.jogar(Jogada.PEDRA, Jogada.PEDRA));
		assertEquals("empate", jokenpolizspock.jogar(Jogada.LAGARTO2, Jogada.LAGARTO2));
		assertEquals("empate", jokenpolizspock.jogar(Jogada.SPOCK2, Jogada.SPOCK2));
	}

}