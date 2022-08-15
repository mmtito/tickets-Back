package yavirac.ticket.feature.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;
    
    public List<Persona> findAll(){
        return personaRepository.findAll();
    }

    public Persona findById(long id){
        return personaRepository.findById(id).orElse(new Persona());
    }
}

