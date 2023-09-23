package oguzhan.mavi.ControllerServiceRepositoryannotations.config;


import oguzhan.mavi.ControllerServiceRepositoryannotations.controller.PizzaController;
import oguzhan.mavi.ControllerServiceRepositoryannotations.service.*;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public IPizza ceasarPizza()
    {
        return  new CeasarPizza();
    }

    @Bean
    public IPizza classicPizza()
    {
        return  new ClassicPizza();
    }

    @Bean
    public IPizza hotPizza()
    {
        return  new HotPizza();
    }

    @Bean
    public IPizza vegetarianPizza()
    {
        return  new VegetarianPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return new PizzaController(classicPizza());
    }
}
