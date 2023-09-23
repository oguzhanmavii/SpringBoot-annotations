package oguzhan.mavi.Primaryannotations.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CeasarPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Ceasar Pizza Ready !";
    }
}
