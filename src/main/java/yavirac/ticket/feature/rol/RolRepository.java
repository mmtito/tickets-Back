package yavirac.ticket.feature.rol;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, Long> {
    List<Rol> findAll();
    List<Rol> findByNombreLikeIgnoreCase(String term);
  

}
