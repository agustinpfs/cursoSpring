 package com.agujaREL.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.agujaREL.entity.Usuario;
import com.agujaREL.repository.RolRepository;
import com.agujaREL.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	RolRepository rolRepository;
	
	@GetMapping
	public String index(Model modelo) {
		modelo.addAttribute("usuario",new Usuario());
		modelo.addAttribute("usuarios",usuarioRepository.findAll());
		modelo.addAttribute("roles",rolRepository.findAll()); //la var roles la ejecuta en option html
		return "index";
	}
	
	@PostMapping("/crearUsuario")
	public String crearUsuario(Model modelo, Usuario usuario) {
		usuarioRepository.save(usuario);
		
		modelo.addAttribute("usuario",new Usuario());
		modelo.addAttribute("usuarios",usuarioRepository.findAll());
		modelo.addAttribute("roles",rolRepository.findAll());
		return "index";
	}
	
	@GetMapping("/editarUsuario/{id}")
	public String editarUsuarioForm(Model modelo, @PathVariable(name="id") Long id) {
		Usuario usuarioParaEditar = usuarioRepository.findById(id).get();
		modelo.addAttribute("usuario",usuarioParaEditar);
		modelo.addAttribute("usuarios",usuarioRepository.findAll());//SELECT * FROM USUARIOS;
		modelo.addAttribute("roles",rolRepository.findAll());
		return "index";
	}
	
	@GetMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(Model modelo, @PathVariable(name="id") Long id) {
		Usuario usuarioParaEliminar = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuarioParaEliminar);
		modelo.addAttribute("usuario",new Usuario());
		modelo.addAttribute("usuarios",usuarioRepository.findAll());//SELECT * FROM USUARIOS;
		modelo.addAttribute("roles",rolRepository.findAll());
		return "index";
	}
}