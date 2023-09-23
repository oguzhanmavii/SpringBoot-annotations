package oguzhan.mavi.Qualifierannotations.service;


import org.springframework.stereotype.Component;

@Component
public class Pizza implements  IPizza {

    @Override
    public String getPizza()
    {
        return  "Pizza Ready !";
    }
}
