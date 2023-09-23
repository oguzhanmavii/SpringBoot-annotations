package oguzhan.mavi.PropertySourceannotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySource {

    @Autowired
    private Environment environment;
    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getEmail() {
        return environment.getProperty("gmail.email");
    }

    public String getPassword() {
        return environment.getProperty("gmail.password");
    }

    //@Value("${gmail.host}")
    private String host;

    //@Value("${gmail.email}")
    private String email;

    //@Value("${gmail.password}")
    private String password;

    public String getAppName() {
        return environment.getProperty("app.name");
    }

    public String getAppDesc() {
        return environment.getProperty("app.description");
    }

    //@Value("${app.name}")
    private String appName;

    //@Value("${app.description}")
    private String appDesc;

}
