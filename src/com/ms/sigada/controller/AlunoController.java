package com.ms.sigada.controller;

import java.util.Map;
import java.util.TreeMap;

import com.ms.sigada.dao.AlunoDAO;
import com.ms.sigada.model.Aluno;

public class AlunoController {
	 private Map<Integer, Aluno> alunos = new TreeMap<>();
	
	public AlunoController() {
		alunos = AlunoDAO.consultaAlunos();	
	}
	
	public boolean cadastraAluno(int matricula, String nome, String dataNasc, String nomeRes1, String nomeRes2, String end1, String end2, String tel1, String tel2, String cpf){
		Aluno novoAluno = new Aluno();
		int maiorMatricula = 0;
		if(matricula == 0) {
			for(int matriculaAluno : alunos.keySet()) {
				if(matriculaAluno > maiorMatricula) {
					maiorMatricula = matriculaAluno;
				}
			}
			novoAluno.setMatricula(maiorMatricula+1);
		}else {
			novoAluno.setMatricula(matricula);
		}
		
		novoAluno.setIDRefeitorio(1);
		novoAluno.setNome(nome);
		novoAluno.setCPF(cpf);
		novoAluno.setDataDeNascimento(dataNasc);
		novoAluno.setEndereco1(end1);
		novoAluno.setEndereco2(end2);
		novoAluno.setTelefoneResponsavel1(tel1);
		novoAluno.setTelefoneResponsavel2(tel2);
		novoAluno.setNomeResponsavel1(nomeRes1);
		novoAluno.setNomeResponsavel2(nomeRes2);
	
		alunos.put(novoAluno.getMatricula(),novoAluno);
	
		if(AlunoDAO.salvar(alunos)) {
			alunos = AlunoDAO.consultaAlunos();	
			return true;	
		}
		return false;
	}
	
	public Map<Integer, String> consultaTodosAlunos(){
		Map<Integer, String> nomesMatriculasAlunos = new TreeMap<>();
		for(int matricula : alunos.keySet()) {
			nomesMatriculasAlunos.put(matricula,alunos.get(matricula).getNome()+" - "+matricula);
		}
		return nomesMatriculasAlunos;
	}
	
	public Aluno consultaAluno(int matricula) {
		return alunos.get(matricula);		
	}
	
	public boolean removeAluno(int matricula) {
		alunos.remove(matricula);
		if(AlunoDAO.salvar(alunos)) {
			return true;
		}
		return false;
	}
	
	public boolean alteraAluno(int matricula, String nome, String dataNasc, String nomeRes1, String nomeRes2, String end1, String end2, String tel1, String tel2, String cpf) {
		removeAluno(matricula);
		if(cadastraAluno(matricula, nome, dataNasc, nomeRes1, nomeRes2, end1, end2, tel1, tel2, cpf)) {
			return true;
		}
		return false;
	}
}
