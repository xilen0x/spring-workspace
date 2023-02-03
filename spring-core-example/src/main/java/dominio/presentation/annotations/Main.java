package dominio.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/*----------CON ANNOTATIONS------*/
public class Main {

	public static void main(String[] args) {

		// STEP 1: Create the Spring Context
		AbstractApplicationContext context = new AnnotationConfigApplicationContext();
		
		// STEP 2:
		AnnotationConfigApplicationContext annotationContext = (AnnotationConfigApplicationContext)context;
		annotationContext.scan("dominio.presentation.annotations");
		annotationContext.refresh();
		
		//STEP 3: Constructor DI with annotations
		HelloWorld helloWorld = (HelloWorld) annotationContext.getBean("helloWorldConst");
		
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getMessage());
		
		//STEP 3: Another 
		HelloWorld helloWorld2 = (HelloWorld) annotationContext.getBean("helloWorldConst");
		
		System.out.println(helloWorld2.getUuid());
		System.out.println(helloWorld2.getMessage());
		
	}

}
