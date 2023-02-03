package dominio.presentation.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dominio.presentation.xml.HelloWorld;

public class Main {

	public static void main(String[] args) {

		// STEP 1: Create the Spring Context
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		// STEP 2: Create objects(Property dependency injection)
		Student student = (Student) context.getBean("student");
		
		//STEP 3: Testing
		System.out.println(student);// Se puede poner o no el toString()
		
		//STEP 4: Close the contexT
		//context.close();
		
		// STEP 2: Create objects(Constructor dependency injection)
		Student student2 = (Student) context.getBean("studentConst");
		
		System.out.println(student2);// Se puede poner o no el toString()
		
		context.close();
		
	}

}
