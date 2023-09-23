package oguzhan.mavi.Lazyannotations.service;
import org.springframework.stereotype.Service;


public class CeasarPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Ceasar Pizza Ready !";
    }
}
