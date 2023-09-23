package oguzhan.mavi.Beanannotations.service;

import org.springframework.stereotype.Component;


public class HotPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Hot Pizza Checked...";
    }
}
