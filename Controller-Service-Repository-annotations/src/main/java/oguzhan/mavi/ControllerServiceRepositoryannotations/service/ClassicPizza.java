package oguzhan.mavi.ControllerServiceRepositoryannotations.service;

public class ClassicPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Classic Pizza Ready :)";
    }
}
