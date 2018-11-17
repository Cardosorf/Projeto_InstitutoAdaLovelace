package com.ms.sigada.model;

public class Aluno extends Pessoa{
	private String telefoneResponsavel1, telefoneResponsavel2, nomeResponsavel1, nomeResponsavel2;
	

	public String getTelefoneResponsavel1() {
		return telefoneResponsavel1;
	}
	
	public void setTelefoneResponsavel1(String telefoneResponsavel1) {
		this.telefoneResponsavel1 = (telefoneResponsavel1 == null ? "" : telefoneResponsavel1);
	}
	
	public String getTelefoneResponsavel2() {
		return telefoneResponsavel2;
	}

	public void setTelefoneResponsavel2(String telefoneResponsavel2) {
		this.telefoneResponsavel2 = (telefoneResponsavel2 == null ? "" : telefoneResponsavel2);
	}

	public String getNomeResponsavel1() {
		return nomeResponsavel1;
	}

	public void setNomeResponsavel1(String nomeResponsavel1) {
		this.nomeResponsavel1 = nomeResponsavel1;
	}

	public String getNomeResponsavel2() {
		return nomeResponsavel2;
	}

	public void setNomeResponsavel2(String nomeResponsavel2) {
		this.nomeResponsavel2 = (nomeResponsavel2 == null ? "" : nomeResponsavel2);
	}
	
	public void solicitarDocumento(int matricula, String tipo) {
		
	}
	
	public boolean verificarPendencias(int matricula) {
		return true;
	}
}
