package dominio.presentation.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		/*---- EXAMPLE INJECTION VIA PROPERTY------1 
		* (Para usar via property, se debe tener Getters & Setters creados)*/
		
		// STEP 1: Create the Spring Context
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		// STEP 2: Create objects
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
	
		//STEP 3: Testing
		System.out.println(helloWorld.getName());
		
		//STEP 4: Close the contexT
		//context.close();
		
		/*---- EXAMPLE INJECTION VIA CONSTRUCTOR ------1* 
		 * (Para usar via constructor, se debe tener el constructor creado)*/
		
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorldConst");
		
		System.out.println(helloWorld2.getName());
		
		context.close();
	}

}
