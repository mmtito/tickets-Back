package yavirac.ticket.feature.sugerencia;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;



@Data
@Table("sugerencia_rol")
public class SugerenciaRol {
    @Id 
    @Column("s_id")
    private Long id;
    private Long sId;
    @Column("rol_id")
    private Long rolId;


    
}
