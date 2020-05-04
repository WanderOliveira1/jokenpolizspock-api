package com.wanderoliveira.jokenpolizspock;

public class jokenpolizspock {
	//Regra de Jogo
	public static String jogar(Jogada Jogador1, Jogada Jogador2) {

		if (Jogador1.ganha(Jogador2) )
			return Jogador1.toString();
		else
			return Jogador2.toString();
	}
}
