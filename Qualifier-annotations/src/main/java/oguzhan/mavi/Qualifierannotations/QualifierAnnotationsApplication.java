package oguzhan.mavi.Qualifierannotations;

import oguzhan.mavi.Qualifierannotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QualifierAnnotationsApplication {

	public static void main(String[] args) {
	var context=SpringApplication.run(QualifierAnnotationsApplication.class, args);
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());

	}

}
