package com.ms.sigada.model;

public class Turma {
	private int ID;
	private String serie, turno;
	private Aluno alunos = new Aluno();
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = (serie == null ? "" : serie);
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = (turno == null ? "" : turno);
	}
	public Aluno getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}
}
