package com.aguja.mvcthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aguja.mvcthymeleaf.model.Usuario;

@Controller
public class DemoController {
	
	@GetMapping
	public String index(Model modelo) {
		List <Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario(1L, "Usuario1", "Agustin Palmieri"));
		usuarios.add(new Usuario(2L, "Usuario2", "Lore Farias"));
		usuarios.add(new Usuario(3L, "Usuario3", "Malena Pergher"));
		usuarios.add(new Usuario(4L, "Usuario4", "Caty Palmieri"));
		
		modelo.addAttribute("tamano", usuarios.size());
		modelo.addAttribute("usuarios", usuarios); //envía lista al html
		
		return "index";
	}

}
