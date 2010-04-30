package com.wbotelhos.model;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.com/2010/01/20/manipulando-dados-json-via-ajax-com-vraptor-3
 */

public class Usuario {

	private Long id;
	private String nome;
	private String senha;
	private String email;
	private Contato contato;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}