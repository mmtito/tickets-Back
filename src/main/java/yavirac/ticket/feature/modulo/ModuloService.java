package yavirac.ticket.feature.modulo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuloService {

    @Autowired
    ModuloRepository moduloRepository;

    // CRUD = Create, Read, Update, Delete

    public Modulo save(Modulo modulo) {

        return moduloRepository.save(modulo);
    }

    

    public Modulo update(Modulo modulo) {
        return moduloRepository.save(modulo);
    }

    public void deleteById(long id) {
        moduloRepository.deleteById(id);
    }

    public List<Modulo> findAll() {
        return moduloRepository.findAll();
    }


    public List<Modulo> findByNombre(String term){
        return moduloRepository.findByNombreLikeIgnoreCase(term+"%");
    }
    public Modulo findById(long id) {
        return moduloRepository.findById(id).orElse(new Modulo());
    }

}
