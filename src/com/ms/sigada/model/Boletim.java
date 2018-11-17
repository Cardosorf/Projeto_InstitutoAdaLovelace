package com.ms.sigada.model;

public class Boletim {
	private Aluno aluno;
	private int bimestre, presencas, faltas; 
	private Disciplina disciplinas;
	private float notas, notasRecuperacao, mediaDisciplina, mediaFinal, frequencia;
	private String campus, anoLetivo;
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public int getBimestre() {
		return bimestre;
	}
	
	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}
	
	public int getPresencas() {
		return presencas;
	}
	
	public void setPresencas(int presencas) {
		this.presencas = presencas;
	}
	
	public int getFaltas() {
		return faltas;
	}
	
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public Disciplina getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public float getNotas() {
		return notas;
	}
	
	public void setNotas(float notas) {
		this.notas = notas;
	}
	
	public float getNotasRecuperacao() {
		return notasRecuperacao;
	}
	
	public void setNotasRecuperacao(float notasRecuperacao) {
		this.notasRecuperacao = notasRecuperacao;
	}
	
	public float getMediaDisciplina() {
		return mediaDisciplina;
	}
	
	public void setMediaDisciplina(float mediaDisciplina) {
		this.mediaDisciplina = mediaDisciplina;
	}
	
	public float getMediaFinal() {
		return mediaFinal;
	}
	
	public void setMediaFinal(float mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	
	public float getFrequencia() {
		return frequencia;
	}
	
	public void setFrequencia(float frequencia) {
		this.frequencia = frequencia;
	}
	
	public String getCampus() {
		return campus;
	}
	
	public void setCampus(String campus) {
		this.campus = campus;
	}
	
	public String getAnoLetivo() {
		return anoLetivo;
	}
	
	public void setAnoLetivo(String anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	
	
}
