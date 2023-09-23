package oguzhan.mavi.ControllerServiceRepositoryannotations.service;

public class VegetarianPizza implements IPizza{
    @Override
    public String getPizza() {
        return "Vegetarian Pizza Ready :)";
    }
}
