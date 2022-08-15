package yavirac.ticket.feature.sugerencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SugerenciaRepository extends CrudRepository<Sugerencia,Long>{

    List<Sugerencia>findAll();
    List<Sugerencia>findBynombreSugerenciaLikeIgnoreCase(String term);
    List<Sugerencia>findByNombreSugerenciaLikeIgnoreCase(String term);
    
    
}
