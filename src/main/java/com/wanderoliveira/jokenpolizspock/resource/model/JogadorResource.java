package com.wanderoliveira.jokenpolizspock.resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JogadorResource implements Serializable {
	private static final long serialVersionUID = 562902634998545274L;
	/**
	 * v.1 Gerado a versao do Serializable 
	 */
	@JsonProperty("nome_jogador")
	private String nome;
	@JsonProperty("nome_jogada")
	private String jogada;

	public JogadorResource(String nome, String jogada) {
		this.nome = nome;
		this.jogada = jogada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getJogada() {
		return jogada;
	}

	public void setJogada(String jogada) {
		this.jogada = jogada;
	}

	@Override
	public String toString() {
		return "JogadorResource [nome=" + nome + ", jogada=" + jogada + "]";
	}
}
