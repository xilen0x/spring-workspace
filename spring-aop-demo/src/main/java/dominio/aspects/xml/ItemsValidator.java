package dominio.aspects.xml;

/*CLASE INTERCEPTOR*/

public class ItemsValidator {
	
	//BEFORE(Comprobar cant de productos a comprar)
	public void checkAmount() {
		System.out.println("Comprobando que la cant. de prod. sea correcta...");
	}
	
	//AFTER(Comprobar empaquetado)
	public void pack() {
		System.out.println("Empaquetando los productos...");
	}
		
	//WHEN EXCEPTION (Despues de q excepcion es lanzada...)
	public void fileComplain() {
		System.out.println("Queja presentada por prod. defectuosos...");
	}

}
