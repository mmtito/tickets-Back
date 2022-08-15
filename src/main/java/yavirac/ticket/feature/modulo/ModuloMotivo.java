package yavirac.ticket.feature.modulo;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("modulos_motivos")
public class ModuloMotivo {
    
   @Id private long id;
   private Long moduloId;
   private Long motivoId;

}
