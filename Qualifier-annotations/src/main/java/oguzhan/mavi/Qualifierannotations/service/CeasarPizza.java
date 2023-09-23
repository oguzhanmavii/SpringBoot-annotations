package oguzhan.mavi.Qualifierannotations.service;

import org.springframework.stereotype.Component;

@Component
public class CeasarPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Ceasar Pizza Ready !";
    }
}
