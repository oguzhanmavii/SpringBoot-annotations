package oguzhan.mavi.ControllerServiceRepositoryannotations.service;

public class HotPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Hot Pizza Ready :)";
    }
}
