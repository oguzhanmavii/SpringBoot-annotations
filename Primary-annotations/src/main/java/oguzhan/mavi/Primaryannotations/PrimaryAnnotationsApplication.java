package oguzhan.mavi.Primaryannotations;

import oguzhan.mavi.Primaryannotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaryAnnotationsApplication {

	public static void main(String[] args) {
	var context=SpringApplication.run(PrimaryAnnotationsApplication.class, args);
		PizzaController pizzaController=(PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
	}

}
