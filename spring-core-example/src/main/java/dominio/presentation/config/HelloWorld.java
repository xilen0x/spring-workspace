package dominio.presentation.config;

public class HelloWorld {
	
	//ATRIBs
	private String message;
	
	//CONSTs
	public HelloWorld() {}

	public HelloWorld(String message) {
		this.setMessage(message);
	}
    //GETs&SETs
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
