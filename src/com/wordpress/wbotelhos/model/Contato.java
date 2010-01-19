package com.wordpress.wbotelhos.model;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.wordpress.com/2010/01/19/manipulando-dados-json-via-ajax-com-vraptor-3
 */

public class Contato {

	private String telefone;
	private String celular;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
