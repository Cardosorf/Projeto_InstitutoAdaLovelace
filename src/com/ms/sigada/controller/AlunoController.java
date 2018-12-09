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
		
		if(verifyCPF(cpf) && cadastraAluno(matricula, nome, dataNasc, nomeRes1, nomeRes2, end1, end2, tel1, tel2, cpf)) {
			return true;
		}
		return false;
		
	}

	
	private boolean verifyCPF(String cpf) {
		int firstDigitValidity = 0;
		int secondDigitValidity = 0;
		int firstFactor = 10;
		int secondFactor = 11;

		if(cpf.length() < 11 || cpf.length() > 11) {
			return false;
		}
		
		
		for (char x : cpf.toCharArray()) {
			firstDigitValidity += Integer.parseInt(String.valueOf(x))*firstFactor;
			firstFactor--;
			if(firstFactor == 1)
				break;
		}
		
		for (char x : cpf.toCharArray()) {
			secondDigitValidity += Integer.parseInt(String.valueOf(x))*secondFactor;
			secondFactor--;
			if(secondFactor == 1)
				break;
		}
		
		
		firstDigitValidity = 11 - (firstDigitValidity % 11);
		secondDigitValidity = 11 - (secondDigitValidity % 11);
	
		if(firstDigitValidity > 9)
			firstDigitValidity = 0;
		
		if(secondDigitValidity > 9)
			secondDigitValidity = 0;

		if(firstDigitValidity == Character.getNumericValue(cpf.charAt(9)) && secondDigitValidity == Character.getNumericValue(cpf.charAt(10))) {
			return true;
		}
		else {
			return false;
		}
	}
}
