package org.java.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PizzaController {

	@Autowired
	private PizzaServ pizzaServ;
	
	@GetMapping
	public String getIndex(Model model) {
		
		List<Pizza> pizze = pizzaServ.findAll();
		model.addAttribute("pizze", pizze);
		
		return "pizza-index";
	}
	
	@GetMapping("/{id}")
	public String getShow(@PathVariable Integer id, Model model) {
		Pizza pizza = pizzaServ.findById(id);
		model.addAttribute("pizza", pizza);
		return "pizza-show";
	}
	
	
	
}
