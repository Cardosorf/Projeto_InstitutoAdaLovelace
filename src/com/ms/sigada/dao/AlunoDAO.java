package com.ms.sigada.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedWriter;
import com.ms.sigada.model.Aluno;


public class AlunoDAO {

	static File file = new File("Aluno.txt");
	
	/* "C:/Users/Rafael/workspace/Projeto_InstitutoAdaLovelace/src/com/ms/sigada/bd/Aluno.txt"; */
	
	static private String path = file.getAbsolutePath().replaceFirst("Aluno.txt", "src/com/ms/sigada/bd/Aluno.txt");
	
	static private Map<Integer, Aluno> alunos = leAlunos( path );

	/*
	matricula|IDRefeitorio|nome|CPF|dataDeNascimento|nomeResponsavel1|
	nomeResponsavel2|telefoneResponsavel1|telefoneResponsavel2|endereco1|endereco2
	*/
	
	
	public static boolean salvar( Map<Integer, Aluno> map ) {
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			for(int user : map.keySet()) {
				writer.write( map.get(user).getMatricula()+ "|" + map.get(user).getIDRefeitorio()+ "|" 
						+ map.get(user).getNome() + "|" + map.get(user).getCPF() + "|" + map.get(user).getDataDeNascimento() + "|" 
						+ map.get(user).getNomeResponsavel1() + "|" + map.get(user).getNomeResponsavel2() + "|"
						+ map.get(user).getTelefoneResponsavel1() + "|" + map.get(user).getTelefoneResponsavel2() + "|"
						+ map.get(user).getEndereco1() + "|" + map.get(user).getEndereco2()
						);
				writer.newLine();
			}
			writer.close();
			alunos = leAlunos( path );   
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public static Map<Integer, Aluno> consultaAlunos() {
		return alunos;
	}
	

	public String remover( int ID ) {
		Map<Integer, Aluno> map = new TreeMap<>();
		try {
			map = AlunoDAO.leAlunos(path);
			map.remove(ID);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			  System.out.println("ID inexistente");
			}
		
		AlunoDAO.salvar(map);
		System.out.println( "Removido" );
		return "./WEB-INF/ok.jsp";
	}

	
	private static Map<Integer, Aluno> leAlunos( String arquivo ) {
		Map<Integer, Aluno> map = new TreeMap<>();
		List<String> linhas;
		try {
			linhas = Files.readAllLines( Paths.get( arquivo ), Charset.forName( "UTF8" ) );
			for( String linha : linhas ) {
				String w[] = linha.split( "[|]" );
				
				Aluno aluno = new Aluno();
				aluno.setMatricula(Integer.parseInt(w[0]));
				aluno.setIDRefeitorio(Integer.parseInt(w[1]));
				aluno.setNome(w[2]);
				aluno.setCPF(w[3]);
				aluno.setDataDeNascimento(w[4]);
				aluno.setNomeResponsavel1(w[5]);
				aluno.setNomeResponsavel2(w[6]);
				aluno.setTelefoneResponsavel1(w[7]);
				aluno.setTelefoneResponsavel2(w[8]);
				aluno.setEndereco1(w[9]);
				aluno.setEndereco2(w[10]);
				
				map.put( aluno.getMatricula(), aluno );
			}
			
		} catch( IOException e ) {
			e.printStackTrace();
		}
		return map;
	}
	
}
