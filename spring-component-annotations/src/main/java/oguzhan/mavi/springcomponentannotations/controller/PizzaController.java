package oguzhan.mavi.springcomponentannotations.controller;


import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    public String getPizza()
    {
        return "Hot pizza";
    }
}
