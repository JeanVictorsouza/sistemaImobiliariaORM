package br.edu.univas.imobiliaria;

import javax.persistence.*;

@Entity
public class Corretor {
	@Id
	int cod;
	@Column
	String cpf;
	@Column
	String nome;
	@Column
	long telefone;
	
	public Corretor() {}
	
	public Corretor(int cod, String cpf, String nome, long telefone) {
		this.cod = cod;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
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

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return this.cod + " | " + this.nome + " | " + this.cpf;
	}
}