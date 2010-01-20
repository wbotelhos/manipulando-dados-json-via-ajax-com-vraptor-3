package com.wordpress.wbotelhos.dao;

import br.com.caelum.vraptor.ioc.Component;

import com.wordpress.wbotelhos.model.Contato;
import com.wordpress.wbotelhos.model.Usuario;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.wordpress.com/2010/01/20/manipulando-dados-json-via-ajax-com-vraptor-3
 */

@Component
public class UsuarioDao {

	public Usuario loadById(Long id) {

		if (id != null) {
			Usuario usuario = new Usuario();
			usuario.setId(id);
			usuario.setEmail("botelho@email.com");
			usuario.setNome("Washington Botelho dos Santos");
			usuario.setSenha("wbotelhos");
			
			Contato contato = new Contato();
			contato.setCelular("13012010");
			contato.setTelefone("13012005");
			
			usuario.setContato(contato);
			
			return usuario;
		}

		return null;
	}
}