package oguzhan.mavi.Beanannotations.controller;

import oguzhan.mavi.Beanannotations.service.IPizza;
import org.springframework.stereotype.Controller;


public class PizzaController {
    private IPizza pizza;



    public PizzaController(IPizza pizza)
    {
        this.pizza=pizza;
    }

    public String getPizza()
    {
        return  pizza.getPizza();
    }

    public void init()
    {
        System.out.println("Initialization Logic");
    }

    public void destroy()
    {
        System.out.println("Destruction Logic");
    }

}
