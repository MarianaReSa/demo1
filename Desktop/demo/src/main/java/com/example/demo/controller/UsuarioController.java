package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(path = "/crear", method = RequestMethod.POST)
	boolean crearUsuario(
			@PathVariable("nombre") String nombreUsuario, 
			@PathVariable("edad") String edad) {

		return usuarioService.crearUsuario(nombreUsuario, edad);
	}

	@RequestMapping(path = "/eliminar/{nombre}", method = RequestMethod.DELETE)
	boolean eliminarUsuario(@PathParam("nombre") String usuario) {
		return usuarioService.eliminarUsuario(usuario);
	}
	@RequestMapping(path = "/editar/{nombre}/{edad}", method = RequestMethod.PUT)
	boolean editarUsuario(@PathVariable("nombre") String nombreusuario,
			@PathVariable("nuevonombre") String nuevonombre,
			@PathVariable("edad") String edad) {
		
		return usuarioService.editarUsuario(nombreusuario,nuevonombre,edad);
	}
	@RequestMapping(path = "/listar", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	List<Usuario> listarUsuarios() {
		return usuarioService.listarUsuarios();
	}
}
