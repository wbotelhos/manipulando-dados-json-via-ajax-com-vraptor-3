package com.wbotelhos.model;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.com/2010/01/20/manipulando-dados-json-via-ajax-com-vraptor-3
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
