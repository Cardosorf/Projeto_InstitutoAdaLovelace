package com.ms.sigada.model;


import java.sql.Time;
import java.util.Date;

public class Sala {
	private int numero, andar;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public void agendarSala(int numero, Date data, Time horario) {
		
	}
	
}
