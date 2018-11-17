package com.ms.sigada.model;

public class Pessoa {
	private String nome, CPF, dataDeNascimento, endereco1, endereco2;
	private int matricula, IDRefeitorio;
	
	public void setNome(String nome) {
		this.nome = (nome == null ? "" : nome);
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String CPF) {
		this.CPF = (CPF == null ? "" : CPF);
	}
	public String getCPF() {
		return this.CPF;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = (dataDeNascimento == null ? "" : dataDeNascimento);
	}
	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public String getEndereco1() {
		return endereco1;
	}
	public void setEndereco1(String endereco1) {
		this.endereco1 = (endereco1 == null ? "" : endereco1);
	}
	public String getEndereco2() {
		return endereco2;
	}
	public void setEndereco2(String endereco2) {
		this.endereco2 = (endereco2 == null ? "" : endereco2);
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIDRefeitorio() {
		return IDRefeitorio;
	}
	public void setIDRefeitorio(int iDRefeitorio) {
		IDRefeitorio = iDRefeitorio;
	}
	
}
