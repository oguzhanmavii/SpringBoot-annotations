package oguzhan.mavi.Valueannotations.value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    @Value("Default Name")
    private String defaultName;

    public String getDefaultName()
    {
        return  defaultName;
    }


    @Value("${mail.host}")
    private String host;

    public String getHost()
    {
        return  host;
    }

    @Value("${mail.gmail}")
    private String gmail;

    public String getGmail()
    {
        return  gmail;
    }
    @Value("${mail.password}")
    private String password;


    public String getPassword()
    {
        return  password;
    }


    @Value("${java.home}")
    private String javaHome;


    @Value("${HOME}")
    private String homeDir;

    public String getJavaHome() {
        return javaHome;
    }

    public String getHomeDir() {
        return homeDir;
    }
}
