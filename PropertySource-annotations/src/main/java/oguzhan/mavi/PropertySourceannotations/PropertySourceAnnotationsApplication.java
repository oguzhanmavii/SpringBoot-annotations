package oguzhan.mavi.PropertySourceannotations;

import oguzhan.mavi.PropertySourceannotations.propertysource.PropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertySourceAnnotationsApplication {

	public static void main(String[] args) {
	 var context=SpringApplication.run(PropertySourceAnnotationsApplication.class, args);
		PropertySource propertySource = context.getBean(PropertySource.class);
		System.out.println(propertySource.getHost());
		System.out.println(propertySource.getEmail());
		System.out.println(propertySource.getPassword());
		System.out.println(propertySource.getAppName());
		System.out.println(propertySource.getAppDesc());
	}

}
