package yavirac.ticket.feature.sugerencia;




import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;



@Data
@Table("sugerencia")
public class Sugerencia {



    @Id
    @Column("id")
    private long id;
    @Column("nombre_sugerencia")
    private String nombreSugerencia;
    @Column("id_motivo")
    private Integer idMotivo;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    private  boolean archived;
    @Column("motivo_id")
    private Long motivoId;


    @MappedCollection(idColumn = "s_id")
   private Set<SugerenciaRol> rolies =new HashSet<>();
    
}
