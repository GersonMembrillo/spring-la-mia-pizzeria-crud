package org.java.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServ {

	@Autowired
	private PizzaRepo pizzaRepo;
	
	public void save(Pizza pizza) {
		
		pizzaRepo.save(pizza);
	}
	public List<Pizza> findAll() {
		
		return pizzaRepo.findAll();
	}
	public Pizza findById(int id) {
		
		return pizzaRepo.findById(id).get();
	}
	public Pizza findByTitleIgnoreCase(String title) {
		// TODO Auto-generated method stub
		return null;
	}
}
