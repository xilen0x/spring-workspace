package dominio.aspects.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("dominio.aspects.annotations");
		context.refresh();
				
		IShopping purchase = context.getBean(IShopping.class);
		
		System.out.println(purchase);
		
		try {
			purchase.buy(false);//false no da error, true lanza la excepcion
		} catch (Exception e) {
			System.err.println("Error en la compra...");
		}
		context.close();
	}

}
