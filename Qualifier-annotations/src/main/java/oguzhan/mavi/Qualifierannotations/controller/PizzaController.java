package oguzhan.mavi.Qualifierannotations.controller;

import oguzhan.mavi.Qualifierannotations.service.IPizza;
import oguzhan.mavi.Qualifierannotations.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PizzaController {
     private IPizza pizza;

    @Autowired
    PizzaController(@Qualifier("ceasarPizza") IPizza pizza)
    {
        this.pizza= pizza;
    }

    public String getPizza()
    {
      return   pizza.getPizza();
    }

}
