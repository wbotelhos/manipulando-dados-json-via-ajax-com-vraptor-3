<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>http://wbotelhos.wordpress.com</title>
		
		<!-- jQuery -->
		<script type="text/javascript" src="<c:url value='/js/jquery-1.4.js'/>"></script>

		<script type="text/javascript">
			function consultar() {
				var idBusca = $('#idBusca').val();
		
				$.getJSON('<c:url value="/usuario/editar/"/>' + idBusca, function (json) {
					$('#id').val(json.usuario.id);
					$('#nome').val(json.usuario.nome);
					$('#email').val(json.usuario.email);
					$('#senha').val(json.usuario.senha);

					$('#telefone').val(json.usuario.contato.telefone);
					$('#celular').val(json.usuario.contato.celular);
				});
			}
		</script>

	</head>
	<body>
		<form>
			ID: <input id="id" type="text"/><br/>
			Nome: <input id="nome" type="text"/><br/>
			Senha: <input id="senha" type="text"/><br/>
			E-mail: <input id="email" type="text"/><br/><br/>
			
			Telefone: <input id="telefone" type="text"/><br/>
			Celular: <input id="celular" type="text"/><br/><br/>
			
			<input type="button" value="Salvar"/>
		</form><br/>
		
		<form>
			Buscar ID: <input id="idBusca" type="text"/>
			<input type="button" value="Buscar" onclick="consultar();"/>
		</form>
	</body>
</html>