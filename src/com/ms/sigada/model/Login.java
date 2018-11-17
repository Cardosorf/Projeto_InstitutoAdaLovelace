package com.ms.sigada.model;

public class Login {
	private String usuario;
	private int senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = (usuario == null ? "" : usuario);
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
