package br.edu.univas.imobiliaria;

import javax.persistence.*;

@Entity
public class Cliente {
	@Id
	private int cod;
	private String nome;
	private String cnpj;
	private String cpf;
	private String tipo;
	private String telefone;
	
	
		// Construtor
	public Cliente(int cod2, String nomeCliente, long numTelefone, String tipoCliente, String numCPF, String numCNPJ) {
		
		//getters e setters 
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
}
