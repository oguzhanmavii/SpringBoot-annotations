package oguzhan.mavi.springcomponentannotations;

import oguzhan.mavi.springcomponentannotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringComponentAnnotationsApplication {

	public static void main(String[] args) {
		var context =SpringApplication.run(SpringComponentAnnotationsApplication.class, args);
		PizzaController pizzaController = (PizzaController) context.getBean("pizza");
		System.out.println(pizzaController);
	}

}
