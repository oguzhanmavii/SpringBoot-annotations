package oguzhan.mavi.Beanannotations.service;


import org.springframework.stereotype.Component;


public class VegPizza implements IPizza{

    @Override
    public String getPizza() {
        return "Vegetarian Pizza Checked...";
    }
}
