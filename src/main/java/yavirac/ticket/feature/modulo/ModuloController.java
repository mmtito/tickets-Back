package yavirac.ticket.feature.modulo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/modulo")
@CrossOrigin({"*"})
public class ModuloController {
    
    @Autowired
    ModuloService moduloService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Modulo save(@RequestBody Modulo modulo){
        return moduloService.save(modulo);
    }

   

    //Update
    @PutMapping("/update")
    public Modulo update(@RequestBody Modulo modulo)
    {
        return moduloService.save(modulo);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        moduloService.deleteById(id);
    }

    @GetMapping("/findAll")
    public List<Modulo> findAll(){
        return moduloService.findAll();

    }

    @GetMapping("/findByNombre/{term}")
    public List<Modulo> findByNombre(@PathVariable String term){
        return moduloService.findByNombre(term);
    }

 //Read
     @GetMapping("/findById/{id}")
     public Modulo findById(@PathVariable long id){
     return moduloService.findById(id);
 }

}
