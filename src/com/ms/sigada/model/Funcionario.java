package com.ms.sigada.model;

public class Funcionario extends Pessoa{
	
	private String cargo, telefone1, telefone2, turno;
	private float salario;
	
	public void setCargo(String cargo) {
		this.cargo = (cargo == null ? "" : cargo);
	}
	
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	
	public void setTelefone2(String telefone2) {
		this.telefone2 = (telefone2 == null ? "" : telefone2);
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public String getTelefone1() {
		return telefone1;
	}
	
	public String getTelefone2() {
		return telefone2;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public String getTurno() {
		return turno;
	}
	
	
}
