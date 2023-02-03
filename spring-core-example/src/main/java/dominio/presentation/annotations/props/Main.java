package dominio.presentation.annotations.props;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dominio.presentation.annotations.HelloWorld;

public class Main {

	public static void main(String[] args) {

		
		// STEP 1: Create the Spring Context
		AbstractApplicationContext context = new AnnotationConfigApplicationContext();
		
		// STEP 2:
		AnnotationConfigApplicationContext annotationContext = (AnnotationConfigApplicationContext) context;
		annotationContext.scan("dominio.presentation.annotations.props");
		annotationContext.refresh();
		
		//Constructor Dependency Injection with annotations
		HelloWorld2 helloWorld = (HelloWorld2) annotationContext.getBean("helloWorld");
		
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getMessage());
		
		// Creem un altra instància i comprovem uuid
		HelloWorld2 helloWorld2 = (HelloWorld2) annotationContext.getBean("helloWorld");
		
		System.out.println(helloWorld2.getUuid());
		System.out.println(helloWorld2.getMessage());
		
		context.close();
	}

}
