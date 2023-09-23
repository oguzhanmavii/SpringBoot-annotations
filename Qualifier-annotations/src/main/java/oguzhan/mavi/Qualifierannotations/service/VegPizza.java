package oguzhan.mavi.Qualifierannotations.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Vegetarian Pizza Ready !";
    }
}
