package oguzhan.mavi.Beanannotations.service;


import org.springframework.stereotype.Component;


public class CeasarPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Ceasar Pizza Checked...";
    }
}
