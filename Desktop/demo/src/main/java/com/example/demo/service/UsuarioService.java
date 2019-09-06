package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public boolean crearUsuario(String nombre, String edad) {
		Usuario usuario = new Usuario(nombre, Integer.parseInt(edad));
		return usuarioRepository.crearUsuario(usuario);
	}
	
	public boolean eliminarUsuario(String nombreUsuario) {
		Usuario usuario = usuarioRepository.buscarUsuario(nombreUsuario);
		return usuarioRepository.eliminarUsuario(usuario);
	}
	public boolean editarUsuario(String nombreUsuario,String nuevonombre, String edad) {
  return usuarioRepository.editarUsuario(nombreUsuario,nuevonombre,Integer.parseInt(edad));
	}
	
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.listarUsuarios();
	}
}
