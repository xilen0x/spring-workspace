package dominio.aspects.xml;

public class Purchase extends Shopping{
	
	@Override
	public void buy(boolean error) throws Exception{ //provocando una exception
		if(error)
			throw new Exception("Algo va mal");
		else
			System.out.println("Procesando la compra...");
	}

}
