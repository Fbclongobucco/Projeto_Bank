package br.com.entities;

public class Cliente {
	
	public static Integer contador = 0000;
	private Integer id = contador;
	private String nome;
	private String cpf;
	private String email;
	
	
	public Cliente() {
		
	}


	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		contador += 1;
	}


	public Integer getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}
	
	
	
}
