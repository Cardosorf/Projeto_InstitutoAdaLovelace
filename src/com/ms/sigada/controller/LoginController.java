package com.ms.sigada.controller;

import java.util.ArrayList;

import com.ms.sigada.dao.LoginDAO;
import com.ms.sigada.model.Login;

public class LoginController {
	static private LoginDAO loginsdao = new LoginDAO();
	static private ArrayList<Login> logins = new ArrayList<Login>();
	
	public boolean consultaUsuario(String usuario, int senha) {
		logins = loginsdao.consultaLogins();
		for(int i = 0; i<logins.size(); i++) {
			if((logins.get(i).getUsuario().compareTo(usuario) == 0) && (logins.get(i).getSenha() == (senha))){
				return true;
			}
		}
		return false;
	}

}
