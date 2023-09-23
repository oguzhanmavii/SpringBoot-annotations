package oguzhan.mavi.Scopeannotations;

import oguzhan.mavi.Scopeannotations.scope.PrototypeBean;
import oguzhan.mavi.Scopeannotations.scope.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScopeAnnotationsApplication {

	public static void main(String[] args) {
	   var context=SpringApplication.run(ScopeAnnotationsApplication.class, args);

		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());
		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean3.hashCode());

		PrototypeBean prototypeBean1= context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());
		PrototypeBean prototypeBean2= context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());
		PrototypeBean prototypeBean3= context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.hashCode());

	}

}
