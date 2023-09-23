package oguzhan.mavi.Lazyannotations;

import oguzhan.mavi.Lazyannotations.lazy.LazyLoader;
import oguzhan.mavi.Lazyannotations.service.CeasarPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LazyAnnotationsApplication {

	public static void main(String[] args) {
	SpringApplication.run(LazyAnnotationsApplication.class, args);



	}
}
