package oguzhan.mavi.Valueannotations;

import oguzhan.mavi.Valueannotations.value.ValueAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueAnnotationsApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(ValueAnnotationsApplication.class, args);

		ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
		System.out.println(valueAnnotation.getDefaultName());
		System.out.println(valueAnnotation.getHost());
		System.out.println(valueAnnotation.getGmail());
		System.out.println(valueAnnotation.getPassword());
		System.out.println(valueAnnotation.getJavaHome());
		System.out.println(valueAnnotation.getHomeDir());
	}
}
