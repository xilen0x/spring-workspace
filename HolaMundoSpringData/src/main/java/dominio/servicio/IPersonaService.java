package dominio.servicio;

import java.util.List;
import dominio.domain.Persona;

//Interface que declara los metodos que deben ser implementados
public interface IPersonaService {
	
	public List<Persona> listarPersonas();
	
	public void guardar(Persona persona);
	
	public void eliminar(Persona persona);
	
	public Persona encontrarPersona(Persona persona);

}
