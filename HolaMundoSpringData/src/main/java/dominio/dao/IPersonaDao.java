package dominio.dao;

import dominio.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface IPersonaDao extends CrudRepository<Persona, Long>{
	//esta interface se creó, para poder extender de CrudRepository
	// y poder acceder a métodos como findAll()
}
