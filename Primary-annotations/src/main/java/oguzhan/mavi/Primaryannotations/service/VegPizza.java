package oguzhan.mavi.Primaryannotations.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class VegPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Vegeratian Pizza Ready !";
    }
}
