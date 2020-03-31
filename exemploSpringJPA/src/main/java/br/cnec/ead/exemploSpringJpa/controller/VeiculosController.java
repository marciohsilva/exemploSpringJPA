package br.cnec.ead.exemploSpringJpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import br.cnec.ead.exemploSpringJpa.model.Veiculo;
import br.cnec.ead.exemploSpringJpa.repository.Veiculos;
@Controller
public class VeiculosController {	
	@Autowired
	private Veiculos veiculos;
	@GetMapping("/veiculos")	
	public ModelAndView listar() {		
		ModelAndView mevVeiculos = new ModelAndView("ListaVeiculos");
		mevVeiculos.addObject("veiculos",veiculos.findAll());
		mevVeiculos.addObject(new Veiculo());
		return mevVeiculos;		 
	}
	@PostMapping("/veiculos")
	public String salvar(Veiculo veiculo) {
		this.veiculos.save(veiculo);
		return "redirect:/veiculos";
	}
}
