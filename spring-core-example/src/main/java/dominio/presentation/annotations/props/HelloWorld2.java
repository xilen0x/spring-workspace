package dominio.presentation.annotations.props;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("helloWorld")
@Scope("prototype")
public class HelloWorld2 {
	
	@Autowired
	@Value("Hello world from property")
	private String message;
	
	private UUID uuid;
	
	//CONSTRUCTORs
	public HelloWorld2() {//este constructor es obligatorio cuando utilizo un Autowired en un atributo
		
		this.uuid = UUID.randomUUID();
	}
	
	public HelloWorld2( String message) {
		
		this();
		this.message = message;
	}
	
	//GETTERS&SETTERS
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
