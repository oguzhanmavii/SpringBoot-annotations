package oguzhan.mavi.ControllerServiceRepositoryannotations.controller;

import oguzhan.mavi.ControllerServiceRepositoryannotations.service.IPizza;

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
}
