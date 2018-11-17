package com.ms.sigada.model;

import java.util.Date;

public class Professor extends Funcionario{
	
	private String contratacao, formacao;

	public String getContratacao() {
		return contratacao;
	}

	public void setContratacao(String contratacao) {
		this.contratacao = contratacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public void lancarNotas(float nota, String disciplina) {
		//Falta implementar.
	}
	
	public void lancarPresenca(int faltas, String disciplina) {
		//Falta implementar.
	}
	
	public void solicitarAgendamentoSala(int numSala, Date data) {
		//Falta implementar.
	}
	
	public void solicitarCriacaoExtensao(String nomeExt, String descricaoExt) {
		//Falta implementar.
	}
	
	
}
