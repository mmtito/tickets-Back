package yavirac.ticket.feature.rol;

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
@RequestMapping("/api/rol")
@CrossOrigin({ "*" })
public class RolController {

    @Autowired
    RolService rolService;

    // CRUD
    // Create
    @PostMapping("/save")
    public Rol save(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    // Read
    

    // Update
    @PutMapping("/update")
    public Rol update(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    // Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        rolService.deleteById(id);
    }

    @GetMapping("/findAll")
    public List<Rol> findAll(){
        return rolService.findAll();
    }
    

    @GetMapping("/findByNombre/{term}")
    public List<Rol> findByNombre(@PathVariable String term){
        return rolService.findByNombre(term);
    }

    @GetMapping("/findById/{id}")
    public Rol findById(@PathVariable long id) {
        return rolService.findById(id);
    }

}