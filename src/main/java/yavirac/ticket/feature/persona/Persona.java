package yavirac.ticket.feature.persona;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Persona{
    @Id private long id;
    private String nombre;
    
}