package dominio.aspects.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "dominio.aspects.annotations")
@EnableAspectJAutoProxy
@Component
public class Purchase implements IShopping{

	@Override
	public void buy(boolean error) throws Exception {
		if(error)
			throw new Exception("Algo fue mal!");
		else
			System.out.println("Procesando la compra...");
	}

}
