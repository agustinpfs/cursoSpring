package com.agujaProfilesOS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.agujaProfilesOS.Services.SistemaOperativoService;

@Controller
public class DemoController {
	
	@Autowired
	public SistemaOperativoService sistemaOperativoService;

	@GetMapping
	public String index(Model model) {
		model.addAttribute("so", sistemaOperativoService.getSistemaOperativoName());
		return "index";
	}
}
