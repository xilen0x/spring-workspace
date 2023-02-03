package dominio.presentation.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/*
 * Code As Configuration
 * */
public class App {

	public static void main(String[] args) {

		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		HelloWorld mensaje =
				(HelloWorld) context.getBean("helloWorld20");
		
		System.out.println(mensaje.getMessage());
		
		context.close();
	}

}
