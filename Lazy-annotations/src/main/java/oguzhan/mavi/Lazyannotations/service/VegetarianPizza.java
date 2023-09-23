package oguzhan.mavi.Lazyannotations.service;
import org.springframework.stereotype.Service;


public class VegetarianPizza implements IPizza{

    @Override
    public String getPizza() {
        return "Vegetarian Pizza Ready !";
    }
}
