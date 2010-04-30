package com.wbotelhos.controller;

import static br.com.caelum.vraptor.view.Results.logic;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.com/2010/01/20/manipulando-dados-json-via-ajax-com-vraptor-3
 */

@Resource
public class IndexController {

	private Result result;

	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		result.use(logic()).redirectTo(UsuarioController.class).novo();
	}

}