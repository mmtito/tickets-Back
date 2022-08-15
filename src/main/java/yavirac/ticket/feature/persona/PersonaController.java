package yavirac.ticket.feature.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin({"*"})
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/findAll")
    public List<Persona>findAll(){
        return personaService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Persona findById(@PathVariable long id){
        return personaService.findById(id);
    }

}
