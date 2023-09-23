package oguzhan.mavi.Beanannotations.service;


import org.springframework.stereotype.Component;


public class Pizza implements IPizza{
    @Override
    public String getPizza() {
        return "Classic Pizza Checked...";
    }
}
