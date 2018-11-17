package com.ms.sigada.model;

public class Livro {
	private int ISBN;
	private String autores, editora, titulo, genero;
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = (autores == null ? "" : autores);
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = (editora == null ? "" : editora);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = (titulo == null ? "" : titulo);
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = (genero == null ? "" : genero);
	}
	
	
}
