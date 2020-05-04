package com.wanderoliveira.jokenpolizspock;

public enum Jogada {
//Joga com os elementos 
	PEDRA("TESOURA"), PAPEL("PEDRA"), TESOURA("PAPEL"), LAGARTO("LAGARTO"), SPOCK("PEDRA")
	,PEDRA2("LAGARTO"), PAPEL2("SPOCK"), TESOURA2("LAGARTO"), LAGARTO2("SPOCK"), SPOCK2("TESOURA");

	private String perdedor;

	Jogada(String nomePerdedor) {
		this.perdedor = nomePerdedor;
	}

	public boolean ganha(Jogada jogada) {
		return Jogada.valueOf(perdedor) == jogada;
	}
	
	@Override
	public String toString() {
		return super.name().toLowerCase();
	}

}
