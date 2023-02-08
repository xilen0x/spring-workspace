package dominio.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dominio.servicio.IPersonaService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j 
public class ControladorInicio {
	
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/") 
	public String inicio(Model model) {
		
		var personas = personaService.listarPersonas();
		
		model.addAttribute("PERSONA", personas);
		
		return "index";
	}

}
