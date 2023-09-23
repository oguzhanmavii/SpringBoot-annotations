package oguzhan.mavi.Primaryannotations.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class Pizza implements IPizza{
    @Override
    public String getPizza() {
        return "Pizza Ready !";
    }
}
