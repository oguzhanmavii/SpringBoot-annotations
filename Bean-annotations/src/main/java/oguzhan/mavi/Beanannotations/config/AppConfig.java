package oguzhan.mavi.Beanannotations.config;


import oguzhan.mavi.Beanannotations.controller.PizzaController;
import oguzhan.mavi.Beanannotations.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean()
    public IPizza vegPizza()
    {
        return  new VegPizza();
    }

    @Bean()
    public IPizza hotPizza()
    {
        return  new HotPizza();
    }

    @Bean()
    public IPizza classicPizza()
    {
        return  new Pizza();
    }

    @Bean()
    public IPizza ceasarPizza()
    {
        return  new CeasarPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return  new PizzaController(classicPizza());
    }

}
