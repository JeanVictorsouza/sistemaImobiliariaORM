package br.edu.univas.imobiliaria;

import javax.persistence.*;

@Entity
public class Cliente {
	@Id
	private int cod;
	@Column
	private String nome;
	@Column
	private String cnpj;
	@Column
	private String cpf;
	@Column
	private String tipo;
	@Column
	private long telefone;
	
	public Cliente() {}
	
	// Construtor
	public Cliente(int cod, String nome, long telefone, String tipo, String cpf, String cnpj) {
		this.cod = cod;
		this.nome = nome;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.tipo = tipo;
		this.telefone = telefone;		 
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}	
}
