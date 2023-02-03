package dominio.aspects.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ItemsValidator {

	//Antes de COMPRAR(Comprobar cant de productos a comprar)
	@Before("execution(* dominio.aspects.annotations.Purchase.buy(..))")
	public void checkAmount() {
		System.out.println("Comprobando que la cant. de prod. sea correcta...");
	}
	
	//Despues de COMPRAR(Comprobar empaquetado)
	@AfterReturning("execution(* dominio.aspects.annotations.Purchase.buy(..))")
	public void pack() {
		System.out.println("Empaquetando los productos...");
	}
		
	//Despues de EXCEPTION (Despues de q excepcion es lanzada...)
	@AfterThrowing("execution(* dominio.aspects.annotations.Purchase.buy(..))")
	public void fileComplain() {
		System.out.println("Queja presentada por prod. defectuosos...");
	}
}
