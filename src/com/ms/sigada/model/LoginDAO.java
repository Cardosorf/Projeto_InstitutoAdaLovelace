package com.ms.sigada.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
	static private ArrayList<Login> contas = new ArrayList<Login>();

	static File file = new File("Contas.txt");
	static private String path = file.getAbsolutePath().replaceFirst("Contas.txt", "src/com/ms/sigada/bd/Contas.txt");

	public LoginDAO() {
		lerContas(path);
	}

	private static void lerContas(String arquivo) {
		List<String> linhas;
		try {
			linhas = Files.readAllLines(Paths.get(arquivo), Charset.forName("UTF-8"));

			for (String linha : linhas) {
				String w[] = linha.split("[|]");
				Login login = new Login();

				login.setUsuario(w[0]);
				login.setSenha(Integer.valueOf(w[1]));

				contas.add(login);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<Login> consultaLogins(){
		return contas;
	}

	private static void salvar(ArrayList<Login> logins) {
		File arquivo = new File(path);
		try {
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < logins.size(); i++) {
				bw.write(logins.get(i).getUsuario() + "|" + logins.get(i).getSenha());
				bw.newLine();
			}
			bw.close();
			fw.close();
			lerContas(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salvaLogins(ArrayList<Login> logins){
		salvar(logins);
	}
}
