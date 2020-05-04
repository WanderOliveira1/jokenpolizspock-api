package com.wanderoliveira.jokenpolizspock.datasource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jogador")
public class Jogador implements Serializable {
	private static final long serialVersionUID = 1997642100156991420L;
	/**
	 * v.1 Gerado a versao do Serializable 
	 */

	@Id // identificador unico gerado automaticamente
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String jogada;

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

	public Jogador() {

	}
}
