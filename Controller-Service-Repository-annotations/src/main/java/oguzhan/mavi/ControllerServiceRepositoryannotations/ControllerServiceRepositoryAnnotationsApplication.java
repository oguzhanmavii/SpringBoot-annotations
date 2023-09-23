package oguzhan.mavi.ControllerServiceRepositoryannotations;

import oguzhan.mavi.ControllerServiceRepositoryannotations.controller.MyController;
import oguzhan.mavi.ControllerServiceRepositoryannotations.repository.MyRepository;
import oguzhan.mavi.ControllerServiceRepositoryannotations.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControllerServiceRepositoryAnnotationsApplication {

	public static void main(String[] args)
	{
	  var context=SpringApplication.run(ControllerServiceRepositoryAnnotationsApplication.class, args);

	  MyController myController= context.getBean(MyController.class);
	  MyService myService= context.getBean(MyService.class);
	  MyRepository myRepository= context.getBean(MyRepository.class);


	  System.out.println(myController.helloController());
	  System.out.println(myService.helloService());
	  System.out.println(myRepository.helloRepository());
	}
}
