package oguzhan.mavi.Lazyannotations.controller;
import oguzhan.mavi.Lazyannotations.service.IPizza;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class PizzaController {
    private IPizza pizza;

    public PizzaController(IPizza pizza)
    {
        this.pizza= pizza;
    }

    public String getPizza()
    {
        return  pizza.getPizza();
    }
}
