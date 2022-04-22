package com.dojo.projects.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class HomeController {
	
	@RequestMapping("")
	public String formulario() {
		return "index.jsp";
	}
	@PostMapping("/send")
	public String enviar (HttpSession session,  
			@RequestParam(value="number") String number,
		    @RequestParam(value="city") String city, 
		    @RequestParam(value="name") String name,
		    @RequestParam(value="hobby") String hobby,
		    @RequestParam(value="live") String live,
		    @RequestParam(value="textarea") String textarea) {
		session.setAttribute("numero1", number);
		session.setAttribute("ciudad1", city);
		session.setAttribute("nombre1", name);
		session.setAttribute("pasatiempo1", hobby);
		session.setAttribute("vivir1", live);
		session.setAttribute("mensaje1", textarea);

		
		return "redirect:/omikuji/show";
		
	}
	@RequestMapping("/show")
	public String resumen(Model model, HttpSession session) {
		model.addAttribute("numero2", (String)session.getAttribute("numero1"));
		model.addAttribute("ciudad2", (String)session.getAttribute("ciudad1"));
		model.addAttribute("nombre2", (String)session.getAttribute("nombre1"));
		model.addAttribute("pasatiempo2", (String)session.getAttribute("pasatiempo1"));
		model.addAttribute("vivir2", (String)session.getAttribute("vivir1"));
		model.addAttribute("mensaje2", (String)session.getAttribute("mensaje1"));
		return "resumen.jsp";
	}

}
