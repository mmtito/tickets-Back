package yavirac.ticket.feature.usuario;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    
    List<Usuario> findAll();

    List<Usuario> findByNameLikeIgnoreCase(String term);
    
}
