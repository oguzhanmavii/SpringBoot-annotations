package oguzhan.mavi.Beanannotations;

import oguzhan.mavi.Beanannotations.controller.PizzaController;
import oguzhan.mavi.Beanannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BeanAnnotationsApplication {

	public static void main(String[] args)
	{
		var context=SpringApplication.run(BeanAnnotationsApplication.class, args);
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());

	}
}
