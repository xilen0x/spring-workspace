package dominio.presentation.xml;

public class HelloWorld {
	
	private String name;
	
	private HelloWorld() {}
	
	private HelloWorld(String name) {
		this.name = name;
	}

	//getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
