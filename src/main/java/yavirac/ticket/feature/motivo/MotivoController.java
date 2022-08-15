package yavirac.ticket.feature.motivo;


import org.springframework.http.HttpStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.ResponseStatus;



@RestController
@RequestMapping("/api/motivo")
@CrossOrigin({"*"})// esta linea es para un error de front end
public class MotivoController {
    @Autowired

    MotivoService motivoService;

    //metodo post para guardar informacion 
    @PostMapping("/save")
    public Motivo save(@RequestBody Motivo motivo) {
        
        
        return motivoService.save(motivo);
    }

    /// metodo read

    @GetMapping("/findById/{id}")
    public Motivo findById(@PathVariable long id) {
        return motivoService.findById(id);
    }

    // update metod

    @PutMapping("/update")
    public Motivo update(@RequestBody Motivo motivo){
        return motivoService.save(motivo);
    }

    //delete metod
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        motivoService.deleteById(id);
    }
    
    @GetMapping("/findAll")
    public List<Motivo> findAll() {
        return motivoService.findAll();
    }
    
    //@GetMapping("/findByModulo/{term}")
    //public List<Motivo> findByModulo(@PathVariable String term) {
       // return motivoService.findByModulo(term);
    //}

    @GetMapping("/findByDescripcion/{term}")
    public List<Motivo> findByDescripcion(@PathVariable String term) {
        return motivoService.findByDescripcion(term);
        
    }


    // @GetMapping("/findByName/{term}")
    // public List<Motivo> findByName(@PathVariable String term){
    //     return motivoService.findByName(term);
    // }
    

}
