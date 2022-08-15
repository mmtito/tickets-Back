package yavirac.ticket.feature.persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona,Long>{
    List<Persona>findAll();

}
