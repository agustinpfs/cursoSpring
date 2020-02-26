package com.agujaPROP.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@Value("${com.agujaPROP.titulo}")
	private String titulo;
//	
	@Value("${com.agujaPROP.util.cont.post}")
	private String cont;
	
	@GetMapping
	public String index(Model modelo) {
		modelo.addAttribute("mititulo", titulo); //lo mando al modelo(html)
		modelo.addAttribute("segundoValor",cont);
		return "index";
	}
}

