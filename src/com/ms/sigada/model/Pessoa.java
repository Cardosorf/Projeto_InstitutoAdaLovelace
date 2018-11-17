package com.ms.sigada.model;

public class Pessoa {
	private String nome, cpf, dataDeNascimento, endereco1, endereco2;
	private int matricula, idRefeitorio;
	
	public void setNome(String nome) {
		this.nome = (nome == null ? "" : nome);
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = (cpf == null ? "" : cpf);
	}
	public String getCPF() {
		return this.cpf;
	}
}
