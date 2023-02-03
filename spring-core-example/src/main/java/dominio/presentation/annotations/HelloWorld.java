package dominio.presentation.annotations;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype") //default
@Component("helloWorldConst")// este es el value en el ej de xml
public class HelloWorld {
	
	private String message;
	private UUID uuid;
	
	
	public HelloWorld() {}
	
	@Autowired
	public HelloWorld(@Value("Hello world from constructor") String message) {
		
		this.setUuid(UUID.randomUUID());
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	
	
}
