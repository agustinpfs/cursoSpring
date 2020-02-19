//controlador

package com.aguja3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
