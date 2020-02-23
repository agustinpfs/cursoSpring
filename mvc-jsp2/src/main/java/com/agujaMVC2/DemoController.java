package com.agujaMVC2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}
	
	@PostMapping("/login")
//	recibo un objeto Usuario(Usuario usuario)
//	enviamos la info a la página menu que tanto usuario y contrasena no vinieron vacíos(Model model)
	public String loginForm(Model modelo, Usuario usuario) {
		
		String resultado = "";
		if(usuario.getUsuario().isEmpty() || usuario.getContrasena().isEmpty()) {
			resultado = "falla, ambos campos son obligatorio";
		}else {
			resultado = "yeah!! puedes entrar";
		}
		
		modelo.addAttribute("result", resultado); //"result" variable por la cual se accede a resultado
//		le envía al menú un modelo que tiene como atributo a "resultado"
		return "menu";
	}
	

}
