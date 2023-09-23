package oguzhan.mavi.Lazyannotations.service;
import org.springframework.stereotype.Service;


public class ClassicPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Classic Pizza Ready !";
    }
}
