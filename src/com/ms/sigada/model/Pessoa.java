package com.ms.sigada.model;

public class Pessoa {
	private String nome, cpf, dataDeNascimento, endereco1, endereco2;
	private int matricula, idRefeitorio;
	
	public void definir_nome(String nome) {
		this.nome = (nome == null ? "" : nome);
	}
	public String obter_nome() {
		return this.nome;
	}
}
