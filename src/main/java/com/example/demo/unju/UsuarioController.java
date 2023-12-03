package com.example.demo.unju;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.service.IUsuarioService;
import com.example.demo.service.UsuarioRepository;

@Controller
public class UsuarioController {

	
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	private UsuarioRepository usuarioService;
	
	
	@GetMapping("/listar")
	public String listar(Model model) throws Exception {		
		
		model.addAttribute("titulo", "Listado de usuarios");

		model.addAttribute("usuarios", usuarioService.findAll());
		return "listar";
	}
}
