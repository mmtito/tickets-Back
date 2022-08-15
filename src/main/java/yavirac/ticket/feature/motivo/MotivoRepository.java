package yavirac.ticket.feature.motivo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MotivoRepository extends CrudRepository<Motivo, Long>{
    List<Motivo> findAll();
   // List<Motivo> findByModuloLikeIgnoreCase(String term);
    List<Motivo> findByDescripcionLikeIgnoreCase(String term);
    
    
}
