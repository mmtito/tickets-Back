package yavirac.ticket.feature.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    // CRUD =CREATE, READ. UPDATE, DELETE

    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    

    public Rol update(Rol rol){
        return rolRepository.save(rol);
    }

    public void deleteById(long id){
        rolRepository.deleteById(id);

    }
    public List<Rol> findAll(){
        return rolRepository.findAll();
    }

   
    public List<Rol> findByNombre(String term){
        return rolRepository.findByNombreLikeIgnoreCase(term+"%"); 
    }
    public Rol findById(long id) {
        return rolRepository.findById(id).orElse(new Rol());
    }
  
    
}
