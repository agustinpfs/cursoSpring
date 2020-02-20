//controlador

package com.aguja3;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aguja3.Entity.Usuario;
import com.aguja3.repository.UsuarioRepositorio;

@Controller
public class UsuarioController {
	
	//instancia de UsuarioRepositorio.java:
	
	@Autowired //inyección de dependencias para no hacer un new
	UsuarioRepositorio repositorio;
	
	
	@GetMapping
	public String index(Model modelo, Usuario usuario) {//crud CU
		modelo.addAttribute("usuario", new Usuario());
		modelo.addAttribute("usuarios", repositorio.findAll()); //instancia
		
		return "index";
	}
	
	@PostMapping("/crearUsuario")
	public String crearUsuario(Model modelo, Usuario usuario) {
		repositorio.save(usuario);
		modelo.addAttribute("usuario", new Usuario()); //limpio campos
		modelo.addAttribute("usuarios", repositorio.findAll());
		
		return "index";
		
	}
	
	@GetMapping("/editarUsuario/{id}")
		public String editarUsuarioForm(Model modelo, @PathVariable(name="id") long id) {
		
 		Usuario usuarioParaEditar = repositorio.findById(id).get(); 
		modelo.addAttribute("usuario", usuarioParaEditar);
		modelo.addAttribute("usuarios", repositorio.findAll());

		/*
		 * Optional<Usuario> usuarioParaEditar = repositorio.findById(id);
		 * if(usuarioParaEditar.isPresent())
		 */
			return "index";
	}
	
	@GetMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(Model modelo, @PathVariable(name="id") long id) {
		
		Usuario usuarioParaEliminar = repositorio.findById(id).get();
		repositorio.delete(usuarioParaEliminar);
		modelo.addAttribute("usuario", new Usuario());
		modelo.addAttribute("usuarios", repositorio.findAll());//lista todos los usuarios
		
		return "index";
	}
	
}
