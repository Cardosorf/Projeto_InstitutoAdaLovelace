package com.ms.sigada.teste;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import com.ms.sigada.model.Aluno;
import com.ms.sigada.model.AlunoDAO;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AlunoDAOTeste {

	@Test
	public final void testSalvar_ConsultaAlunos() {
		Map<Integer, Aluno> alunos = new TreeMap<>();
		Aluno aluno = new Aluno();
		aluno.setMatricula(14637985);
		aluno.setIDRefeitorio(1);
		aluno.setNome("Teste");
		aluno.setCPF("96325874132");
		aluno.setDataDeNascimento("00/00/00");
		aluno.setEndereco1("testestets");
		aluno.setEndereco2("testestesteste");
		aluno.setTelefoneResponsavel1("00000000");
		aluno.setTelefoneResponsavel2("123456789");
		aluno.setNomeResponsavel1("Paiteste");
		aluno.setNomeResponsavel2("Mãeteste");
		alunos.put(14637985, aluno); 
		AlunoDAO.salvar(alunos);
		
		Assert.assertEquals("Teste", AlunoDAO.consultaAlunos().get(14637985).getNome());
	}


	@Test
	public final void testRemover() {
		Assert.assertEquals(true,AlunoDAO.remover(14637985));
		Assert.assertEquals(false,AlunoDAO.remover(14637985));
	}

}
