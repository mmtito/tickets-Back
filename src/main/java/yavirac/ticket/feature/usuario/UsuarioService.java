package yavirac.ticket.feature.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository userRepository;

    public List<Usuario> findAll(){
        return userRepository.findAll();
    }

    public Usuario findById(long id){
        return userRepository.findById(id).orElse(new Usuario());
    }





    public Usuario save(Usuario user){

        return userRepository.save(user);
    }

    public Usuario update(Usuario user){
        return userRepository.save(user);
    }

    public void deleteById(long id){
        userRepository.deleteById(id);
    }
     
    public List<Usuario> findByName(String term){
        return userRepository.findByNameLikeIgnoreCase(term+"%");
    }
}
