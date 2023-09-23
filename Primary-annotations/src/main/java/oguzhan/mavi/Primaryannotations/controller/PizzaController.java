package oguzhan.mavi.Primaryannotations.controller;

import oguzhan.mavi.Primaryannotations.service.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PizzaController implements IPizza {

    private  IPizza pizza;

    @Autowired
    PizzaController(IPizza pizza)
    {
        this.pizza = pizza;
    }
    @Override
    public String getPizza() {
        return pizza.getPizza();
    }
}
