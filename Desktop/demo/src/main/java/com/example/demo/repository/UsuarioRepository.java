package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Usuario;

@Repository
public class UsuarioRepository {

	List<Usuario> usuarios;

	public UsuarioRepository() {
	
		Usuario usr1 = new Usuario("Julio", 20);
		Usuario usr2 = new Usuario("Pedro", 21);
		Usuario usr3 = new Usuario("Ernan", 22);
		Usuario usr4 = new Usuario("Mario", 23);
		Usuario usr5 = new Usuario("Andres", 24);
		
		usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usr1);
		usuarios.add(usr2);
		usuarios.add(usr3);
		usuarios.add(usr4);
		usuarios.add(usr5);
	}
	
	public boolean crearUsuario(Usuario usuario) {
		usuarios.add(usuario);
		return true;
	}
	
	public boolean eliminarUsuario(Usuario usuario) {
		usuarios.remove(usuario);
		return true;
	}
	public boolean editarUsuario(String nombre, String nombrenuevo,int edad) {
	Usuario usuario= buscarUsuario(nombre);
	for(Usuario user: usuarios) {
		if(usuario.getNombre().equals(nombre)) {
			user.setEdad(edad);
			user.setNombre(nombrenuevo);
			return true;
		}else {
		}}return false;

	}
	
	
	public List<Usuario> listarUsuarios(){
		return this.usuarios;
	}
	
	public Usuario buscarUsuario(String nombre) {
		
		for (Usuario usuario : usuarios) {
			if(usuario.getNombre().equals(nombre));
			return usuario;
		}
		
		return null;
	}
}
