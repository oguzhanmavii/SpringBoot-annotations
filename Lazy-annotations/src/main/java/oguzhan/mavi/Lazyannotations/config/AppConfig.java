package oguzhan.mavi.Lazyannotations.config;
import oguzhan.mavi.Lazyannotations.controller.PizzaController;
import oguzhan.mavi.Lazyannotations.service.CeasarPizza;
import oguzhan.mavi.Lazyannotations.service.ClassicPizza;
import oguzhan.mavi.Lazyannotations.service.IPizza;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {
    @Bean
    @Lazy
    public IPizza classicPizza()
    {
        return  new ClassicPizza();
    }

    @Bean IPizza ceasarPizza()
    {
        return new CeasarPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return new PizzaController(ceasarPizza());
    }
}
