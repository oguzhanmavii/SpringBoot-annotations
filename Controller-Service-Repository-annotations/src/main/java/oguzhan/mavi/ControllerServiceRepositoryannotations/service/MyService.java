package oguzhan.mavi.ControllerServiceRepositoryannotations.service;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String  helloService()
    {
        return "Hello SpringBoot Service !";
    }
}
