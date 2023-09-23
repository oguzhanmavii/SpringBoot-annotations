package oguzhan.mavi.PropertySourceannotations.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySource("classpath:mail.properties")
@PropertySource("classpath:messages.properties")
/*
@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:mail.properties")
})
 */
public class SpringConfig
{

}
