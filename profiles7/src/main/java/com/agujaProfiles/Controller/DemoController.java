package com.agujaProfiles.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@Value("${database.url}")
	private String url;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("url", url);
		return "index";
	}

}
