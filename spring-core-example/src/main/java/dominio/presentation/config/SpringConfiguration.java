package dominio.presentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfiguration {

	@Bean(name="helloWorld20")
	public HelloWorld helloWorld() {
	
		HelloWorld h = new HelloWorld();
		h.setMessage("Hello from world from Code As Configuration");
		return h;
	}
	
}
