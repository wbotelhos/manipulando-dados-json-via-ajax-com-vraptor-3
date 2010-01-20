package com.wordpress.wbotelhos.controller;

import static br.com.caelum.vraptor.view.Results.json;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.wordpress.wbotelhos.dao.UsuarioDao;
import com.wordpress.wbotelhos.model.Usuario;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.wordpress.com/2010/01/20/manipulando-dados-json-via-ajax-com-vraptor-3
 */

@Resource
public class UsuarioController {

	private UsuarioDao usuarioDao;
	private Result result;
	
	public UsuarioController(Result result, UsuarioDao usuarioDao) {
		this.result = result;
		this.usuarioDao = usuarioDao;
	}

	@Get
	@Path("/usuario")
	public void novo() {
	}

	@Get
	@Path("/usuario/editar/{usuario.id}")
	public void editar(Usuario usuario) {
		Usuario user = usuarioDao.loadById(usuario.getId());
		result.use(json()).from(user).include("contato").serialize();
	}

}