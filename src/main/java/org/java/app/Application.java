package org.java.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PizzaServ pizzaServ;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
  		Pizza pizza1 = new Pizza("Margherita", "desc pizza 1", "https://upload.wikimedia.org/wikipedia/commons/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg", 10);
  		Pizza pizza2 = new Pizza("4 Stagioni", "desc pizza 2", "https://www.negroni.com/sites/negroni.com/files/styles/scale__1440_x_1440_/public/pizza_4_stagioni_la_ricetta_fatta_in_casa_.jpg?itok=EgsCQLDd", 12);
  		Pizza pizza3 = new Pizza("Diavola", "desc pizza 3", "https:  https://www.negroni.com/sites/negroni.com/files/styles/scale__1440_x_1440_/public/pizza_rustica.jpg?itok=Lbp_jtZW", 14);
  		Pizza pizza4 = new Pizza("Speak & Scamorza", "desc pizza 4", "https:  https://www.negroni.com/sites/negroni.com/files/styles/scale__1440_x_1440_/public/pizza.jpg?itok=z_-RLtOK", 16);
  		Pizza pizza5 = new Pizza("Patate & Salsiccia", "desc pizza 4", "https:  https://www.negroni.com/sites/negroni.com/files/styles/scale__1440_x_1440_/public/pizza_con_patate_e_salsiccia.jpg?itok=mxab5rGt", 18);
  		
  		pizzaServ.save(pizza1);
  		pizzaServ.save(pizza2);
  		pizzaServ.save(pizza3);
  		pizzaServ.save(pizza4);
  		pizzaServ.save(pizza5);
  		
  		System.out.println("Insert OK");
	}
}