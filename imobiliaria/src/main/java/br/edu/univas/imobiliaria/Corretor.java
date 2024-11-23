package br.edu.univas.imobiliaria;

import javax.persistence.*;

@Entity
public class Corretor {
	@Id
	int cod;
	String cpf;
	String nome;
	Long telefone;
	
	public Corretor(int cod, String cpf, String nome, Long telefone) {
		// TODO Auto-generated constructor stub
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	
}

