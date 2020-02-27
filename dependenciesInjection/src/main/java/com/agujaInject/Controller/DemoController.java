package com.agujaInject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.agujaInject.Services.SistemaOperativoService;

@Controller
public class DemoController {
	
//	@Autowired
	SistemaOperativoService sistemaOperativoService1;
	SistemaOperativoService sistemaOperativoService2;
//	SistemaOperativoService sistemaOperativoService3;
	
	
	public DemoController(SistemaOperativoService sistemaOperativoServiceImplWin,
							   SistemaOperativoService sistemaOperativoServiceImplMac) {
		this.sistemaOperativoService1 = sistemaOperativoServiceImplWin;
		this.sistemaOperativoService2 = sistemaOperativoServiceImplMac;
	}
	
	//inyección de dependencias(spring se encarga de crear la instancia): 3 maneras:
	//1 constructor
	
//	@Autowired //no obligatorio
//	public DemoController(@Qualifier("sistemaOperativoServiceImplWin")SistemaOperativoService sistemaOperativoService) {
//		this.sistemaOperativoService = sistemaOperativoService;
//	}
//	or: (reemplaza a @primary)
	
//	public DemoController(SistemaOperativoService sistemaOperativoServiceImplMac) {
//		this.sistemaOperativoService = sistemaOperativoServiceImplMac;
//	}
	
	//2 Método seter (seter sistema operativo)
	
//	public DemoController() {
//		
//	}
//	
//	@Autowired
//	public void setSistemaOperativoService(SistemaOperativoService sistemaOperativoService) {
//		this.sistemaOperativoService = sistemaOperativoService;
//	}
	
	//@Autowired
//	SistemaOperativoService sistemaOperativoService; 


	




	@GetMapping("/windows")
	public String indexwindows(Model model) {
		model.addAttribute("os", sistemaOperativoService1.getNombre() );
		model.addAttribute("app", sistemaOperativoService1.getExtensionArchivos() );
		model.addAttribute("libs", sistemaOperativoService1.getLibrerias() );
		return "index";
	}
	
//	@GetMapping("/linux")
//	public String indexlinux(Model model) {
//		model.addAttribute("os", sistemaOperativoService2.getNombre() );
//		model.addAttribute("app", sistemaOperativoService2.getExtensionArchivos() );
//		model.addAttribute("libs", sistemaOperativoService2.getLibrerias() );
//		return "index";
//	}
	
	@GetMapping("/mac")
	public String indexmac(Model model) {
		model.addAttribute("os", sistemaOperativoService2.getNombre() );
		model.addAttribute("app", sistemaOperativoService2.getExtensionArchivos() );
		model.addAttribute("libs", sistemaOperativoService2.getLibrerias() );
		return "index";
	}

}
