package dominio.aspects.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Shopping purchase = (Shopping) context.getBean("purchase");
		
		System.out.println(purchase);
		
		try {
			purchase.buy(true);//false no da error, true lanza la excepcion
		} catch (Exception e) {
			System.err.println("Error en la compra...");
		}
		context.close();
	}

}
