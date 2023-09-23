package oguzhan.mavi.ControllerServiceRepositoryannotations.controller;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloController()
    {
        return "Hello SpringBoot Controller !";
    }
}
